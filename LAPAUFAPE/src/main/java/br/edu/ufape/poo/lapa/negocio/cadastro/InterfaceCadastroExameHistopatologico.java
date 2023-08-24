package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.ExameHistopatologico;

public interface InterfaceCadastroExameHistopatologico {

	<S extends ExameHistopatologico> S save(S entity);

	List<ExameHistopatologico> findAll();

	Optional<ExameHistopatologico> findById(Long id);

	long count();

	void deleteById(Long id);

	void deleteAll();

}