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
	public <S extends ParteNecropsia> S salvarParteNecropsia(S entity) {
		return parteNecropsia.save(entity);
	}

	@Override
	public List<ParteNecropsia> encontrarTodasPartesNecropsias() {
		return parteNecropsia.findAll();
	}

	@Override
	public Optional<ParteNecropsia> encontrarParteNecropsiaPorId(Long id) {
		return parteNecropsia.findById(id);
	}

	@Override
	public long contarPartesNecropsias() {
		return parteNecropsia.count();
	}

	@Override
	public void deletarParteNecropsiaPorId(Long id) {
		parteNecropsia.deleteById(id);
	}

	@Override
	public void deletarParteNecropsia(ParteNecropsia entity) {
		parteNecropsia.delete(entity);
	}
	
}
