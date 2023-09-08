package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.ParteNecropsia;

public interface InterfaceCadastroParteNecropsia {

	<S extends ParteNecropsia> S salvarParteNecropsia(S entity);

	List<ParteNecropsia> encontrarTodasPartesNecropsias();

	Optional<ParteNecropsia> encontrarParteNecropsiaPorId(Long id);

	long contarPartesNecropsias();

	void deletarParteNecropsiaPorId(Long id);

	void deletarParteNecropsia(ParteNecropsia entity);

}