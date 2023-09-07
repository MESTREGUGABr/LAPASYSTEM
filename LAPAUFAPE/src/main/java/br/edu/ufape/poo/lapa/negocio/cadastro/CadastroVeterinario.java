package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoVeterinario;
import br.edu.ufape.poo.lapa.negocio.basico.Tutor;
import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.TutorNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.VeterinarioNaoExisteException;

@Service
public class CadastroVeterinario implements InterfaceCadastroVeterinario {
	@Autowired
	private InterfaceColecaoVeterinario colecaoVeterinario;

	@Override
	public <S extends Veterinario> S SalvarVeterinario(S entity) throws UsuarioDuplicadoException {
	
		if (colecaoVeterinario.findByEmail(entity.getEmail()) != null) {
            throw new UsuarioDuplicadoException(entity.getEmail());
        }
        
        return colecaoVeterinario.save(entity);
	}

	public List<Veterinario> acharTodosOsVeterinarios() {
		return colecaoVeterinario.findAll();
	}

	@Override
    public Optional<Veterinario> procurarVeterinarioPorID(Long id) throws VeterinarioNaoExisteException {
        Optional<Veterinario> veterinarioOptional = colecaoVeterinario.findById(id);

        if (veterinarioOptional.isPresent()) {
            return veterinarioOptional;
        } else {
            throw new VeterinarioNaoExisteException("Não existe veterinário com o ID informado: " + id);
        }
    }
	

	@Override
	public boolean veterinarioExistePorId(Long id) {
		return colecaoVeterinario.existsById(id);
	}

	@Override
	public long contarVeterinarios() {
		return colecaoVeterinario.count();
	}

	@Override
	public void deletarVeterinarioPorId(Long id) {
		colecaoVeterinario.deleteById(id);
	}

	@Override
	public List<Veterinario> procurarVeterinarioPorNome(String nome) throws VeterinarioNaoExisteException {
		List<Veterinario> veterinario = colecaoVeterinario.findByNome(nome);
        if (!veterinario.isEmpty()) {
            return veterinario;
        } else {
            throw new VeterinarioNaoExisteException("Veterinario não encontrado com o nome: " + nome);
        }
	}

	
	
}
