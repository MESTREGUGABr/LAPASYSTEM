package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoAnimal;
import br.edu.ufape.poo.lapa.negocio.basico.Animal;

@Service
public class CadastroAnimal implements InterfaceCadastroAnimal {

	@Autowired
	private InterfaceColecaoAnimal colecaoAnimal;

	@Override
	public <S extends Animal> S save(S entity) {
		return colecaoAnimal.save(entity);
	}

	@Override
	public List<Animal> findAll() {
		return colecaoAnimal.findAll();
	}

	@Override
	public Optional<Animal> findById(Long id) {
		return colecaoAnimal.findById(id);
	}

	@Override
	public long count() {
		return colecaoAnimal.count();
	}

	@Override
	public void deleteById(Long id) {
		colecaoAnimal.deleteById(id);
	}

	@Override
	public void delete(Animal entity) {
		colecaoAnimal.delete(entity);
	}
	
	
}
