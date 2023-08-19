package br.edu.ufape.poo.lapa.negocio.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoAnimal;
import br.edu.ufape.poo.lapa.negocio.basico.Enum.Sexo;
import br.edu.ufape.poo.lapa.negocio.basico.Enum.Especie;

@SpringBootTest
public class InterfaceColecaoAnimalTeste {

	@Autowired
	private InterfaceColecaoAnimal ColecaoAnimal;
	Sexo sex = Sexo.MACHO;
	Especie esp = Especie.BOVINO;
	
	Tutor tut = new Tutor("Gabriel","gabriel@gmail.com","87998270096");
	
	@Test
	void cadastroAnimal() {
		long qtdAnimal = ColecaoAnimal.count();
		
		Date obito = new Date();
		
		Tutor tut = new Tutor("Gabriel","gabriel@gmail.com","87998270096");
		
		Animal ani = new Animal("Lindinha", tut, "Pesadão", 300, 100, "NaoSeiOqEh", 3, esp, sex, 140, obito);
		ColecaoAnimal.save(ani);
		long qtdAnimal1 = ColecaoAnimal.count();
		
		assertEquals(qtdAnimal+1, qtdAnimal1);
	}
}
