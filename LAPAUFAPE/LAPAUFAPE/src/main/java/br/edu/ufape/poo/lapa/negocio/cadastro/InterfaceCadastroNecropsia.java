package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Necropsia;

public interface InterfaceCadastroNecropsia {

	<S extends Necropsia> S salvarNecropsia(S entity);

	List<Necropsia> encontrarTodasNecropsias();

	Optional<Necropsia> encontrarNecropsiasPorId(Long id);

	long contarNecropsias();

	void deletarNecropsiaPorId(Long id);

	void deletarNecropsia(Necropsia entity);

}