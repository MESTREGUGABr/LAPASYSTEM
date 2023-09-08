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

import br.edu.ufape.poo.lapa.negocio.basico.Animal;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.AnimalNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.lapa.negocio.fachada.Fachada;

@RestController
@RequestMapping("/api/v3")
public class AnimalController {
	
	@Autowired 
	public Fachada fachada;
	
	//ListarTodosOsAnimaisCadastrados
	@GetMapping("/animal")
	public List<Animal> listarTodosAnimais(){
		return fachada.encontrarTodosAnimais();
	}
	
	
	//BuscarAnimalPorID
	@GetMapping("/animal/{id}")
	public Optional<Animal> buscarAnimalPorId(@PathVariable Long id) throws AnimalNaoExisteException {
	    return fachada.encontrarAnimalPorId(id);
	}
	
	//ContarTodosOsAnimaisCadastrados
	@GetMapping("/animal/count")
	public long contarAnimais() {
	    return fachada.contarAnimais();
	}
	
	//SalvarAnimal
	@PostMapping("/animal")
	public Animal salvarAnimal(@RequestBody Animal Animal) throws UsuarioDuplicadoException {
		return fachada.salvarAnimal(Animal);
	}
	
	//ExcluirAnimalPorID
	@DeleteMapping("/animal/{id}")
	public ResponseEntity<Void> deletarAnimaisPorId(@PathVariable Long id) {
	    fachada.deletarAnimaisPorId(id);
	    return ResponseEntity.noContent().build();
	}

}
