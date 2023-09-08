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

import br.edu.ufape.poo.lapa.negocio.basico.Patologista;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.PatologistaNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.lapa.negocio.fachada.Fachada;

@RestController
@RequestMapping("/api/v2")

public class PatologistaController {
	
	@Autowired 
	public Fachada fachada;
	
	//ListarTodosOsPatologistas
	@GetMapping("/patologista")
	public List<Patologista> listarTodosOsPatologistas(){
		return fachada.procurarTodosOsPatologistas();
	}
	
	//BuscarPorUmPatologistaPorID
	@GetMapping("/patologista/{id}")
	public Optional<Patologista> buscarPatologistaPorId(@PathVariable Long id) throws PatologistaNaoExisteException {
	    return fachada.procurarPatologistaPorId(id);
	}
	
	//BuscarPatologistaPorEmail
	@GetMapping("/patologista/email/{email}")
	public Patologista procurarPatologistaEmail(@PathVariable String email){
		return fachada.procurarPatologistaEmail(email);
	}
	
	//SalvarPatologista
	@PostMapping("/patologista")
	public Patologista salvarPatologista(@RequestBody Patologista Patologista) throws UsuarioDuplicadoException {
		return fachada.salvarPatologista(Patologista);
	}
	
	//ExcluirPatologista
	@DeleteMapping("/patologista/{id}")
	public ResponseEntity<Void> deletarPatologistaPorId(@PathVariable Long id) {
	    fachada.deletarPatologistaPorId(id);
	    return ResponseEntity.noContent().build();
	}
	
	//PatologistaExistePorID
	@GetMapping("/patologista/existe/{id}")
	public ResponseEntity<Boolean> patologistaExistePorId(@PathVariable Long id) {
	    boolean existe = fachada.patologistaexistePorId(id);
	    return ResponseEntity.ok(existe);
	}
		
	//DeletarEntidadePatologista

}
