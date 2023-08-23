package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoTutor;
import br.edu.ufape.poo.lapa.negocio.basico.Tutor;

@Service
public class CadastroTutor {
	@Autowired
	private InterfaceColecaoTutor colecaoTutor;

	public <S extends Tutor> S save(S entity) {
		return colecaoTutor.save(entity);
	}

	public List<Tutor> findAll(Sort sort) {
		return colecaoTutor.findAll(sort);
	}

	public List<Tutor> findAll() {
		return colecaoTutor.findAll();
	}

	public Optional<Tutor> findById(Long id) {
		return colecaoTutor.findById(id);
	}

	public boolean existsById(Long id) {
		return colecaoTutor.existsById(id);
	}

	public <S extends Tutor> boolean exists(Example<S> example) {
		return colecaoTutor.exists(example);
	}

	public long count() {
		return colecaoTutor.count();
	}

	public void deleteById(Long id) {
		colecaoTutor.deleteById(id);
	}

	public Tutor getById(Long id) {
		return colecaoTutor.getById(id);
	}

	public void delete(Tutor entity) {
		colecaoTutor.delete(entity);
	}

	
}


