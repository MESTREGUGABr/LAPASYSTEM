package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Patologista;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.PatologistaNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;

public interface InterfaceCadastroPatologista {

	<S extends Patologista> S salvarPatologista(S entity) throws UsuarioDuplicadoException;

	Optional<Patologista> procurarPatologistaPorId(Long id) throws PatologistaNaoExisteException;

	boolean patologistaexistePorId(Long id);

	long contarPatologista();

	void deletarPatologistaPorId(Long id);

	void deletarPatologista(Patologista entity);

	List<Patologista> procurarPatologistaPorNome(String nome)throws PatologistaNaoExisteException;
}