package br.edu.ufape.poo.lapa.negocio.cadastro;

import java.util.List;
import java.util.Optional;

import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.VeterinarioNaoExisteException;

public interface InterfaceCadastroVeterinario {

	<S extends Veterinario> S SalvarVeterinario(S entity) throws UsuarioDuplicadoException;

	Optional<Veterinario> procurarVeterinarioPorID(Long id) throws VeterinarioNaoExisteException;

	boolean veterinarioExistePorId(Long id);

	long contarVeterinarios();

	void deletarVeterinarioPorId(Long id);
	
	List<Veterinario> acharTodosOsVeterinarios();
	
	List<Veterinario> procurarVeterinarioPorNome(String nome)throws VeterinarioNaoExisteException;

}