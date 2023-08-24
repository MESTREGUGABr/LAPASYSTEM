package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoExameHistopatologico;
import br.edu.ufape.poo.lapa.negocio.basico.ExameHistopatologico;

@Service
public class CadastroExameHistopatologico implements InterfaceCadastroExameHistopatologico {

	@Autowired
	private InterfaceColecaoExameHistopatologico exameHistopatologico;

	@Override
	public <S extends ExameHistopatologico> S save(S entity) {
		return exameHistopatologico.save(entity);
	}

	@Override
	public List<ExameHistopatologico> findAll() {
		return exameHistopatologico.findAll();
	}

	@Override
	public Optional<ExameHistopatologico> findById(Long id) {
		return exameHistopatologico.findById(id);
	}

	@Override
	public long count() {
		return exameHistopatologico.count();
	}

	@Override
	public void deleteById(Long id) {
		exameHistopatologico.deleteById(id);
	}

	@Override
	public void deleteAll() {
		exameHistopatologico.deleteAll();
	}
	
	
}
