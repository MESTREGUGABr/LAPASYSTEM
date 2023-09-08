package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;

public interface InterfaceCadastroVeterinario {

	<S extends Veterinario> S SalvarVeterinario(S entity);

	Optional<Veterinario> procurarVeterinarioPorID(Long id);

	boolean tutorExistePorId(Long id);

	long contarVeterinarios();

	void deletarVeterinarioPorId(Long id);
	
	List<Veterinario> acharTodosOsVeterinarios();

}