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
	public <S extends Necropsia> S salvarNecropsia(S entity) {
		return colecaoNecropsia.save(entity);
	}

	@Override
	public List<Necropsia> encontrarTodasNecropsias() {
		return colecaoNecropsia.findAll();
	}

	@Override
	public Optional<Necropsia> encontrarNecropsiasPorId(Long id) {
		return colecaoNecropsia.findById(id);
	}

	@Override
	public long contarNecropsias() {
		return colecaoNecropsia.count();
	}

	@Override
	public void deletarNecropsiaPorId(Long id) {
		colecaoNecropsia.deleteById(id);
	}

	@Override
	public void deletarNecropsia(Necropsia entity) {
		colecaoNecropsia.delete(entity);
	}
}
