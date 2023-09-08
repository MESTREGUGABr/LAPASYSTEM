package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoPatologista;
import br.edu.ufape.poo.lapa.negocio.basico.Patologista;
@Service
public class CadastroPatologista implements InterfaceCadastroPatologista {
	@Autowired
	private InterfaceColecaoPatologista colecaoPatologista;

	@Override
	public <S extends Patologista> S salvarPatologista(S entity) {
		return colecaoPatologista.save(entity);
	}
	@Override
	public List<Patologista> procurarTodosOsPatologistas() {
		return colecaoPatologista.findAll();
	}

	@Override
	public Optional<Patologista> procurarPatologistaPorId(Long id) {
		return colecaoPatologista.findById(id);
	}

	@Override
	public boolean patologistaexistePorId(Long id) {
		return colecaoPatologista.existsById(id);
	}

	@Override
	public long contarPatologista() {
		return colecaoPatologista.count();
	}

	@Override
	public void deletarPatologistaPorId(Long id) {
		colecaoPatologista.deleteById(id);
	}


	@Override
	public void deletarPatologista(Patologista entity) {
		colecaoPatologista.delete(entity);
	}
	@Override
	public Patologista procurarUsuarioPatologistaEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Patologista procurarUsuarioEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

    
}
