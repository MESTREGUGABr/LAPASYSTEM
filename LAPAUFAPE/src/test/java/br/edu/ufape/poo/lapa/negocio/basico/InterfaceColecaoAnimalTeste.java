package br.edu.ufape.poo.lapa.negocio.basico;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoAnimal;
import br.edu.ufape.poo.lapa.dados.InterfaceColecaoTutor;
import br.edu.ufape.poo.lapa.negocio.basico.Enum.Sexo;
import br.edu.ufape.poo.lapa.negocio.basico.Enum.Especie;

@SpringBootTest
public class InterfaceColecaoAnimalTeste {

	@Autowired
	private InterfaceColecaoAnimal colecaoAnimal; // Corrigido o nome da variável
	Sexo sex = Sexo.MACHO;
	Especie esp = Especie.BOVINO;
	
	@Autowired
	private InterfaceColecaoTutor colecaoTutor;

//	@Test
//	void cadastroAnimal() {
//		long qtdAnimal = colecaoAnimal.count(); // Usar a variável correta aqui
//
//		Date obito = new Date();
//
//		Tutor tut = new Tutor("Gabriel", "gabriel@gmail.com", "87998270096");
//
//		Animal ani = new Animal("Lindinha", tut, "Pesadão", 300, 100, "NaoSeiOqEh", 3, esp, sex, 140, obito);
//		colecaoAnimal.save(ani); // Usar a variável correta aqui
//		long qtdAnimal1 = colecaoAnimal.count(); // Usar a variável correta aqui
//
//		assertEquals(qtdAnimal + 1, qtdAnimal1);
//	}
	
//	@Test
//	void testeCadastroAnimalComSucesso() {
//		long qtdAnimal = colecaoAnimal.count();
//		
//		Date obito = new Date();
//
//		Long idTutorExistente = 7L;
//
//		Optional<Tutor> tutorOptional = colecaoTutor.findById(idTutorExistente);
//		assertTrue(tutorOptional.isPresent(), "Tutor não encontrado");
//
//		Tutor tutorExistente = tutorOptional.get();
//
//		Animal ani = new Animal("Leo", tutorExistente, "Pesadão", 300, 100, "NaoSeiOqEh", 3, esp, sex, 140, obito);
//		colecaoAnimal.save(ani);
//		long qtdAnimal1 = colecaoAnimal.count();
//		
//		assertEquals(qtdAnimal + 1, qtdAnimal1);
//	}
	
//	@Test
//	void testeDeletarAnimalComSucesso() {
//	    
//		Long idAnimalExistente = 4L;
//
//	    colecaoAnimal.deleteById(idAnimalExistente);
//
//	    assertFalse(colecaoAnimal.findById(idAnimalExistente).isPresent(), "O animal não foi excluído corretamente");
//	}
	
//	@Test
//	void testeAtualizarAnimalComSucesso() {
//		
//		Long idTutorExistente = 7L;
//		
//		Optional<Tutor> tutorOptional = colecaoTutor.findById(idTutorExistente);
//		assertTrue(tutorOptional.isPresent(), "Tutor não encontrado");
//		
//		Tutor tutorExistente = tutorOptional.get();
//
//	    Animal animalOriginal = new Animal("NomeOriginal", tutorExistente, "DescriçãoOriginal", 100, 50, "OutrasInformaçõesOriginal", 2, esp, sex, 70, new Date());
//	    colecaoAnimal.save(animalOriginal);
//
//
//	    Long idAnimal = animalOriginal.getId();
//	    Animal animalRecuperado = colecaoAnimal.findById(idAnimal).orElse(null);
//	    assertNotNull(animalRecuperado, "Registro original não encontrado");
//
//
//	    animalRecuperado.setNome("NovoNome");
//	    animalRecuperado.setPeso(200);
//
//
//	    colecaoAnimal.save(animalRecuperado);
//
//
//	    Animal animalAtualizado = colecaoAnimal.findById(idAnimal).orElse(null);
//	    assertNotNull(animalAtualizado, "Registro atualizado não encontrado");
//
//
//	    assertEquals("NovoNome", animalAtualizado.getNome());
//	    assertEquals(200, animalAtualizado.getPeso()); 
//	}
	
	@Test
	void buscarAnimalExistentePorId() {
	   
	    Long idAnimalExistente = 3L;
	 
	    Optional<Animal> animalEncontradoOptional = colecaoAnimal.findById(idAnimalExistente);
	    
	    assertTrue(animalEncontradoOptional.isPresent(), "Animal não encontrado");
	    
	    Animal animalEncontrado = animalEncontradoOptional.get();
	  
	    assertEquals("Lindinha", animalEncontrado.getNome());
	    
	}


}
