package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import br.edu.ufape.poo.lapa.negocio.basico.Tutor;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;

public interface InterfaceCadastroTutor {

	<S extends Tutor> S salvarTutor(S entity) throws UsuarioDuplicadoException;

	List<Tutor> procurarTodosOsTutores();

	Optional<Tutor> procurarTutorPorId(Long id);

	boolean tutorExistePorId(Long id);

	<S extends Tutor> boolean tutorExiste(Example<S> example);

	long contarTutores();

	void deletarTutorPorId(Long id);

	void deletarTutor(Tutor entity);

	Optional<Tutor> procurarUsuarioEmail(String email);

}