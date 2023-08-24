package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Animal;

public interface InterfaceCadastroAnimal {

	<S extends Animal> S save(S entity);

	List<Animal> findAll();

	Optional<Animal> findById(Long id);

	long count();

	void deleteById(Long id);

	void delete(Animal entity);

}