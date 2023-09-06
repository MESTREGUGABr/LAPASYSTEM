package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoOrgao;
import br.edu.ufape.poo.lapa.negocio.basico.Orgao;

@Service
public class CadastroOrgao implements InterfaceCadastroOrgao {
	
	@Autowired
	private InterfaceColecaoOrgao colecaoOrgao;

	@Override
	public <S extends Orgao> S save(S entity) {
		return colecaoOrgao.save(entity);
	}

	@Override
	public List<Orgao> findAll() {
		return colecaoOrgao.findAll();
	}

	@Override
	public Optional<Orgao> findById(Long id) {
		return colecaoOrgao.findById(id);
	}

	@Override
	public long count() {
		return colecaoOrgao.count();
	}

	@Override
	public void deleteById(Long id) {
		colecaoOrgao.deleteById(id);
	}

	@Override
	public void delete(Orgao entity) {
		colecaoOrgao.delete(entity);
	}
	
	
}
