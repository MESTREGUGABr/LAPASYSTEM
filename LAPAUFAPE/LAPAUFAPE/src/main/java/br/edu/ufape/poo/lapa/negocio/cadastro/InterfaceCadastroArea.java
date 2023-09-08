package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Area;

public interface InterfaceCadastroArea {

	<S extends Area> S salvarArea(S entity);

	List<Area> encontrarTodasAreas();

	Optional<Area> encontrarAreaPorId(Long id);

	long contarAreas();

	void deletarAreaPorId(Long id);

	void deletarArea (Area entity);

}