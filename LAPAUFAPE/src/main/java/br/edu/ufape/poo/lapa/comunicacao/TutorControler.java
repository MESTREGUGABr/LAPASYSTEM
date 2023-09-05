package br.edu.ufape.poo.lapa.comunicacao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.poo.lapa.negocio.basico.Tutor;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.TutorNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.lapa.negocio.fachada.Fachada;

@RestController
@RequestMapping("/api/v1")
public class TutorControler {

	@Autowired 
	public Fachada fachada;
	
	@GetMapping("/tutor")
	public List<Tutor> listarTodosOsTutores(){
		return fachada.procurarTodosOsTutores();
	}
	
	@GetMapping("/tutor/{id}")
	public Tutor buscarTutorPorId(@PathVariable Long id) throws TutorNaoExisteException {
	    return fachada.procurarTutorPorId(id);
	}
	
	@GetMapping("/tutor/email/{email}")
	public Tutor buscarTutorPorEmail(@PathVariable String email){
		return fachada.procurarUsuarioEmail(email);
	}
	
	@PostMapping("/tutor")
	public Tutor salvarTutor(@RequestBody Tutor tutor) throws UsuarioDuplicadoException {
		return fachada.salvarTutor(tutor);
	}
	
	@DeleteMapping("/tutor/{id}")
	public ResponseEntity<Void> deletarTutorPorId(@PathVariable Long id) {
	    fachada.deletarTutorPorId(id);
	    return ResponseEntity.noContent().build();
	}
	
	//tutorExistePorID
	
	//TutorExiste
	
	//deletar entidade tutor
	
}
