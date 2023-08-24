package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.ExameHistopatologico;

public interface InterfaceCadastroExameHistopatologico {

	<S extends ExameHistopatologico> S salvarExameHistopatologico(S entity);

	List<ExameHistopatologico> encontrarTodosExamesHistopatologicos();

	Optional<ExameHistopatologico> encontrarExameHistopatologicoPorId(Long id);

	long contarExamesHistopatologicos();

	void deletarExameHistopatologicoPorId(Long id);

	void deletarTodosExamesHistopatologicos();

}