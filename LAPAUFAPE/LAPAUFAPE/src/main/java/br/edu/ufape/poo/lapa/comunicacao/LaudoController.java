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

import br.edu.ufape.poo.lapa.negocio.basico.Laudo;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.LaudoNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.lapa.negocio.fachada.Fachada;

@RestController
@RequestMapping("/api/v5")
public class LaudoController {
	
	
	@Autowired 
	public Fachada fachada;
	
	//ListarTodosOsLaudos
	@GetMapping("/laudo")
	public List<Laudo> listarTodosOsLaudos(){
		return fachada.encontrarTodosLaudos();
	}
	
	//BuscarLaudoPorID
	@GetMapping("/laudo/{id}")
	public Optional<Laudo> buscarLaudoPorId(@PathVariable Long id) throws LaudoNaoExisteException {
	    return fachada.encontrarLaudoPorId(id);
	}
	
	//ContarTodosOsLaudosCadastrados
		@GetMapping("/laudo/count")
		public long contarLaudos() {
		    return fachada.contarLaudos();
		}
	
	//SalvarLaudo
	@PostMapping("/laudo")
	public Laudo salvarLaudo(@RequestBody Laudo Laudo) throws UsuarioDuplicadoException {
		return fachada.salvarLaudo(Laudo);
	}
	
	//DeletarLaudo
	@DeleteMapping("/laudo/{id}")
	public ResponseEntity<Void> deletarLaudoPorId(@PathVariable Long id) {
	    fachada.deletarLaudoPorId(id);
	    return ResponseEntity.noContent().build();
	}

}
