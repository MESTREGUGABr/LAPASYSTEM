package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.ParteNecropsia;

public interface InterfaceCadastroParteNecropsia {

	<S extends ParteNecropsia> S save(S entity);

	List<ParteNecropsia> findAll();

	Optional<ParteNecropsia> findById(Long id);

	long count();

	void deleteById(Long id);

	void delete(ParteNecropsia entity);

}