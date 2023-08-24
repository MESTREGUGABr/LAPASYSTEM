package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Area;

public interface InterfaceCadastroArea {

	<S extends Area> S save(S entity);

	List<Area> findAll();

	Optional<Area> findById(Long id);

	long count();

	void deleteById(Long id);

	void delete(Area entity);

}