package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoVeterinario;
import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;

@Service
public class CadastroVeterinario implements InterfaceCadastroVeterinario {
	@Autowired
	private InterfaceColecaoVeterinario colecaoVeterinario;

	@Override
	public <S extends Veterinario> S SalvarVeterinario(S entity) {
		return colecaoVeterinario.save(entity);
	}

	public List<Veterinario> acharTodosOsVeterinarios() {
		return colecaoVeterinario.findAll();
	}

	@Override
	public Optional<Veterinario> procurarVeterinarioPorID(Long id) {
		return colecaoVeterinario.findById(id);
	}

	@Override
	public boolean tutorExistePorId(Long id) {
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

	
	
}
