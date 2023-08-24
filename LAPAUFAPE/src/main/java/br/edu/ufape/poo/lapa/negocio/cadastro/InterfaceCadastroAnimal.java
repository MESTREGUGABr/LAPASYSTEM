package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Animal;

public interface InterfaceCadastroAnimal {

	<S extends Animal> S salvarAnimal(S entity);

	List<Animal> encontrarTodosAnimais();

	Optional<Animal> encontrarAnimalPorId(Long id);

	long contarAnimais();

	void deletarAnimaisPorId(Long id);

	void deletarAnimal(Animal entity);

}