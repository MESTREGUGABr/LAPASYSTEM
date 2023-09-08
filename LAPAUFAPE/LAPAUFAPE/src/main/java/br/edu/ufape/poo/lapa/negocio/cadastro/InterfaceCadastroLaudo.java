package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Laudo;

public interface InterfaceCadastroLaudo {

	<S extends Laudo> S salvarLaudo(S entity);

	List<Laudo> encontrarTodosLaudos();

	Optional<Laudo> encontrarLaudoPorId(Long id);

	long contarLaudos();

	void deletarLaudoPorId(Long id);

	void deletarLaudo(Laudo entity);

}