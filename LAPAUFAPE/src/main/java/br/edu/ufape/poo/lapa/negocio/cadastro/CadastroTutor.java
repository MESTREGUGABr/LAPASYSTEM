package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoTutor;
import br.edu.ufape.poo.lapa.negocio.basico.Tutor;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.TutorNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;

@Service
public class CadastroTutor implements InterfaceCadastroTutor{
	@Autowired
	private InterfaceColecaoTutor colecaoTutor;


	@Override
	public Optional<Tutor> procurarUsuarioEmail(String email){
		return Optional.of(colecaoTutor.findByEmail(email));
	}
	
	@Override
	public <S extends Tutor> S salvarTutor(S entity) throws UsuarioDuplicadoException {
	    Optional<Tutor> existingTutor = procurarUsuarioEmail(entity.getEmail());
		if (existingTutor.isPresent()) {
		    throw new UsuarioDuplicadoException(entity.getEmail());
		}

		return colecaoTutor.save(entity);
	}

	
	@Override
	public List<Tutor> procurarTodosOsTutores() {
		return colecaoTutor.findAll();
	}

	@Override
	public Optional<Tutor> procurarTutorPorId(Long id) {
		return colecaoTutor.findById(id);
	}

	@Override
	public boolean tutorExistePorId(Long id) {
		return colecaoTutor.existsById(id);
	}

	@Override
	public <S extends Tutor> boolean tutorExiste(Example<S> example) {
		return colecaoTutor.exists(example);
	}

	@Override
	public long contarTutores() {
		return colecaoTutor.count();
	}

	@Override
	public void deletarTutorPorId(Long id) {
		colecaoTutor.deleteById(id);
	}

	@Override
	public void deletarTutor(Tutor entity) {
		colecaoTutor.delete(entity);
	}

	
}


