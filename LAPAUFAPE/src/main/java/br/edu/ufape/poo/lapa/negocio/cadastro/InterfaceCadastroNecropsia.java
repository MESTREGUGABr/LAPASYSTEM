package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Necropsia;

public interface InterfaceCadastroNecropsia {

	<S extends Necropsia> S save(S entity);

	List<Necropsia> findAll();

	Optional<Necropsia> findById(Long id);

	long count();

	void deleteById(Long id);

	void delete(Necropsia entity);

}