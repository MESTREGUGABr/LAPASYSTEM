package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import br.edu.ufape.poo.lapa.negocio.basico.Tutor;
<<<<<<< Updated upstream
=======
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.TutorNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
>>>>>>> Stashed changes

public interface InterfaceCadastroTutor {

	<S extends Tutor> S salvarTutor(S entity);

	List<Tutor> procurarTodosOsTutores();

	Tutor procurarTutorPorId(Long id) throws TutorNaoExisteException;

	boolean tutorExistePorId(Long id);

	<S extends Tutor> boolean tutorExiste(Example<S> example);

	long contarTutores();

	void deletarTutorPorId(Long id);

	void deletarTutor(Tutor entity);

<<<<<<< Updated upstream
=======
	Tutor procurarUsuarioEmail(String email);

>>>>>>> Stashed changes
}