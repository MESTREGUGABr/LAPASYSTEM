package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Laudo;

public interface InterfaceCadastroLaudo {

	<S extends Laudo> S save(S entity);

	List<Laudo> findAll();

	Optional<Laudo> findById(Long id);

	long count();

	void deleteById(Long id);

	void delete(Laudo entity);

}