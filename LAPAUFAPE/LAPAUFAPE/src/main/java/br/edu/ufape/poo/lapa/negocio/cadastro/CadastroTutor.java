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
	public Tutor salvarTutor(Tutor entity) throws UsuarioDuplicadoException {
	    Tutor existingTutor = procurarUsuarioEmail(entity.getEmail());
	    
	    // Check if an existing tutor with the same email exists
	    if (existingTutor != null && existingTutor.getEmail().equals(entity.getEmail())) {
	        throw new UsuarioDuplicadoException(entity.getEmail());
	    }

	    // If no duplicate tutor is found, save the new tutor entity
	    return colecaoTutor.save(entity);
	}
	
	@Override
	public List<Tutor> procurarTodosOsTutores() {
		return colecaoTutor.findAll();
	}

	@Override
	public Tutor procurarTutorPorId(Long id) throws TutorNaoExisteException {
		return colecaoTutor.findById(id).orElse(null);
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

	@Override
	public Tutor procurarUsuarioEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}