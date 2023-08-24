package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoNecropsia;
import br.edu.ufape.poo.lapa.negocio.basico.Necropsia;

@Service
public class CadastroNecropsia implements InterfaceCadastroNecropsia {

	private InterfaceColecaoNecropsia colecaoNecropsia;

	@Override
	public <S extends Necropsia> S save(S entity) {
		return colecaoNecropsia.save(entity);
	}

	@Override
	public List<Necropsia> findAll() {
		return colecaoNecropsia.findAll();
	}

	@Override
	public Optional<Necropsia> findById(Long id) {
		return colecaoNecropsia.findById(id);
	}

	@Override
	public long count() {
		return colecaoNecropsia.count();
	}

	@Override
	public void deleteById(Long id) {
		colecaoNecropsia.deleteById(id);
	}

	@Override
	public void delete(Necropsia entity) {
		colecaoNecropsia.delete(entity);
	}
}
