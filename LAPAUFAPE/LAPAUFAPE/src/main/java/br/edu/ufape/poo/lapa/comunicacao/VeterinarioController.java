package br.edu.ufape.poo.lapa.comunicacao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.VeterinarioNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.fachada.Fachada;

@RestController
@RequestMapping("/api/v4")
public class VeterinarioController {
	
	@Autowired 
	public Fachada fachada;
	
	//ListarTodosOsVeterinarios
	@GetMapping("/veterinario")
	public List<Veterinario> acharTodosOsVeterinarios(){
		return fachada.acharTodosOsVeterinarios();
	}
	
	//BuscarVeterinarioPorID
	@GetMapping("/veterinario/{id}")
	public Optional<Veterinario> buscarVeterinarioPorId(@PathVariable Long id) throws VeterinarioNaoExisteException {
	    return fachada.procurarVeterinarioPorID(id);
	}
	
	//ContarTodosOsVeterinariosCadastrados
		@GetMapping("/veterinario/count")
		public long contarVeterinarios() {
		    return fachada.contarVeterinarios();
		}
		
		//SalvarVeterinario
		@PostMapping("/veterinario")
		public Veterinario salvarVeterinario(@RequestBody Veterinario Veterinario) throws UsuarioDuplicadoException {
			return fachada.SalvarVeterinario(Veterinario);
		}
		
		//DeletarVeterinario
		@DeleteMapping("/veterinario/{id}")
		public ResponseEntity<Void> deletarVeterinarioPorId(@PathVariable Long id) {
		    fachada.deletarVeterinarioPorId(id);
		    return ResponseEntity.noContent().build();
		}

}
