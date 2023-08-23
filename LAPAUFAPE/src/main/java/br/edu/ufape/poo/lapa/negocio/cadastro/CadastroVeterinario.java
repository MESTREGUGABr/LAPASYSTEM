package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoVeterinario;
import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;

@Service
public class CadastroVeterinario {
	@Autowired
	private InterfaceColecaoVeterinario colecaoVeterinario;

	public <S extends Veterinario> S save(S entity) {
		return colecaoVeterinario.save(entity);
	}

	public List<Veterinario> findAll() {
		return colecaoVeterinario.findAll();
	}

	public Optional<Veterinario> findById(Long id) {
		return colecaoVeterinario.findById(id);
	}

	public boolean existsById(Long id) {
		return colecaoVeterinario.existsById(id);
	}

	public long count() {
		return colecaoVeterinario.count();
	}

	public void deleteById(Long id) {
		colecaoVeterinario.deleteById(id);
	}
	
	
}
