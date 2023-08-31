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
	
	@Test
	void cadastroAnimal() {
		long qtdAnimal = colecaoAnimal.count();
		
		Date obito = new Date();

		Long idTutorExistente = 1L;

		Optional<Tutor> tutorOptional = colecaoTutor.findById(idTutorExistente);
		assertTrue(tutorOptional.isPresent(), "Tutor não encontrado");

		Tutor tutorExistente = tutorOptional.get();

		Animal ani = new Animal("Lindinha", tutorExistente, "Pesadão", 300, 100, "NaoSeiOqEh", 3, esp, sex, 140, obito);
		colecaoAnimal.save(ani);
		long qtdAnimal1 = colecaoAnimal.count();
		
		assertEquals(qtdAnimal + 1, qtdAnimal1);
	}
}
