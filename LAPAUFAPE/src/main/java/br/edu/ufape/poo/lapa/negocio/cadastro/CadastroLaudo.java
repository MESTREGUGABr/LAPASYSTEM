package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoLaudo;
import br.edu.ufape.poo.lapa.negocio.basico.Laudo;

@Service
public class CadastroLaudo implements InterfaceCadastroLaudo {

	@Autowired
	private InterfaceColecaoLaudo colecaoLaudo;

	@Override
	public <S extends Laudo> S salvarLaudo(S entity) {
		return colecaoLaudo.save(entity);
	}

	@Override
	public List<Laudo> encontrarTodosLaudos() {
		return colecaoLaudo.findAll();
	}

	@Override
	public Optional<Laudo> encontrarLaudoPorId(Long id) {
		return colecaoLaudo.findById(id);
	}

	@Override
	public long contarLaudos() {
		return colecaoLaudo.count();
	}

	@Override
	public void deletarLaudoPorId(Long id) {
		colecaoLaudo.deleteById(id);
	}

	@Override
	public void deletarLaudo(Laudo entity) {
		colecaoLaudo.delete(entity);
	}
	
	
}
