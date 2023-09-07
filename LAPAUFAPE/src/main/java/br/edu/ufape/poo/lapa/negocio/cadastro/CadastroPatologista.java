package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoPatologista;
import br.edu.ufape.poo.lapa.negocio.basico.Patologista;
import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.PatologistaNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.VeterinarioNaoExisteException;

@Service
public class CadastroPatologista implements InterfaceCadastroPatologista {
	@Autowired
	private InterfaceColecaoPatologista colecaoPatologista;

	@Override
	public <S extends Patologista> S salvarPatologista(S entity) throws UsuarioDuplicadoException{
		
		if (colecaoPatologista.findByEmail(entity.getEmail()) != null) {
            throw new UsuarioDuplicadoException(entity.getEmail());
        }
        
		return colecaoPatologista.save(entity);
	}

	@Override
	public Optional<Patologista> procurarPatologistaPorId(Long id) throws PatologistaNaoExisteException {
		
		Optional<Patologista> patologistaOptional = colecaoPatologista.findById(id);

        if (patologistaOptional.isPresent()) {
            return patologistaOptional;
        } else {
            throw new PatologistaNaoExisteException("Não existe patologista com o ID informado: " + id);
        }
	}

	@Override
	public boolean patologistaexistePorId(Long id) {
		return colecaoPatologista.existsById(id);
	}

	@Override
	public long contarPatologista() {
		return colecaoPatologista.count();
	}

	@Override
	public void deletarPatologistaPorId(Long id) {
		colecaoPatologista.deleteById(id);
	}


	@Override
	public void deletarPatologista(Patologista entity) {
		colecaoPatologista.delete(entity);
	}

	@Override
	public List<Patologista> procurarPatologistaPorNome(String nome) throws PatologistaNaoExisteException {
		List<Patologista> patologista = colecaoPatologista.findByNome(nome);
        if (!patologista.isEmpty()) {
            return patologista;
        } else {
            throw new PatologistaNaoExisteException("Patologista não encontrado com o nome: " + nome);
        }
	}

    
}
