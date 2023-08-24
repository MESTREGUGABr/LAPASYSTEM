package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoParteNecropsia;
import br.edu.ufape.poo.lapa.negocio.basico.ParteNecropsia;

@Service
public class CadastroParteNecreopsia implements InterfaceCadastroParteNecropsia {
	
	@Autowired
	private InterfaceColecaoParteNecropsia parteNecropsia;

	@Override
	public <S extends ParteNecropsia> S save(S entity) {
		return parteNecropsia.save(entity);
	}

	@Override
	public List<ParteNecropsia> findAll() {
		return parteNecropsia.findAll();
	}

	@Override
	public Optional<ParteNecropsia> findById(Long id) {
		return parteNecropsia.findById(id);
	}

	@Override
	public long count() {
		return parteNecropsia.count();
	}

	@Override
	public void deleteById(Long id) {
		parteNecropsia.deleteById(id);
	}

	@Override
	public void delete(ParteNecropsia entity) {
		parteNecropsia.delete(entity);
	}
	
}
