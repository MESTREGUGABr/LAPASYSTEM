package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoArea;
import br.edu.ufape.poo.lapa.negocio.basico.Area;

@Service
public class CadastroArea implements InterfaceCadastroArea {

	@Autowired
	private InterfaceColecaoArea colecaoArea;

	@Override
	public <S extends Area> S save(S entity) {
		return colecaoArea.save(entity);
	}

	@Override
	public List<Area> findAll() {
		return colecaoArea.findAll();
	}

	@Override
	public Optional<Area> findById(Long id) {
		return colecaoArea.findById(id);
	}

	@Override
	public long count() {
		return colecaoArea.count();
	}

	@Override
	public void deleteById(Long id) {
		colecaoArea.deleteById(id);
	}

	@Override
	public void delete(Area entity) {
		colecaoArea.delete(entity);
	}
	
	
}
