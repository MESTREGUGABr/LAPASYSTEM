package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Orgao;

public interface InterfaceCadastroOrgao {

	<S extends Orgao> S save(S entity);

	List<Orgao> findAll();

	Optional<Orgao> findById(Long id);

	long count();

	void deleteById(Long id);

	void delete(Orgao entity);

}