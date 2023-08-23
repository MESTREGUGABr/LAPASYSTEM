package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoPatologista;
import br.edu.ufape.poo.lapa.negocio.basico.Patologista;

@Service
public class CadastroPatologista {
	@Autowired
	private InterfaceColecaoPatologista colecaoPatologista;

	public <S extends Patologista> S save(S entity) {
		return colecaoPatologista.save(entity);
	}

	public Optional<Patologista> findById(Long id) {
		return colecaoPatologista.findById(id);
	}

	public boolean existsById(Long id) {
		return colecaoPatologista.existsById(id);
	}

	public long count() {
		return colecaoPatologista.count();
	}

	public void deleteById(Long id) {
		colecaoPatologista.deleteById(id);
	}

	public Patologista getById(Long id) {
		return colecaoPatologista.getById(id);
	}

	public void delete(Patologista entity) {
		colecaoPatologista.delete(entity);
	}

    
}
