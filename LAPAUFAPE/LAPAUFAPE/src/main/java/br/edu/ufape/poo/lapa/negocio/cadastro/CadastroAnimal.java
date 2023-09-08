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
	public <S extends Animal> S salvarAnimal(S entity) {
		return colecaoAnimal.save(entity);
	}

	@Override
	public List<Animal> encontrarTodosAnimais() {
		return colecaoAnimal.findAll();
	}

	@Override
	public Optional<Animal> encontrarAnimalPorId(Long id) {
		return colecaoAnimal.findById(id);
	}

	@Override
	public long contarAnimais() {
		return colecaoAnimal.count();
	}

	@Override
	public void deletarAnimaisPorId(Long id) {
		colecaoAnimal.deleteById(id);
	}

	@Override
	public void deletarAnimal(Animal entity) {
		colecaoAnimal.delete(entity);
	}
	
	
}
