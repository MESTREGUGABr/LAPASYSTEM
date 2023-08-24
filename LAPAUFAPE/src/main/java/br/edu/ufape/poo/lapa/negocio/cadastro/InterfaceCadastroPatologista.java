package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Patologista;

public interface InterfaceCadastroPatologista {

	<S extends Patologista> S salvarPatologista(S entity);

	Optional<Patologista> procurarPatologistaPorId(Long id);

	boolean patologistaexistePorId(Long id);

	long contarPatologista();

	void deletarPatologistaPorId(Long id);

	void deletarPatologista(Patologista entity);

}