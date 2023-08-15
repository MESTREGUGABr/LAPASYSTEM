package br.edu.ufape.poo.lapa.negocio.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoTutor;

@SpringBootTest
public class InterfaceColecaoTutorTeste {
	@Autowired
	private InterfaceColecaoTutor ColecaoTutor;
	
	@Test
	void cadastroTutorTeste() {
		long qtdTutor = ColecaoTutor.count();
		Tutor tutor = new Tutor("José", "eisso@gmail.com", "837921873");
		ColecaoTutor.save(tutor);
		long qtdTutor1 = ColecaoTutor.count();
		
		assertEquals(qtdTutor+1, qtdTutor1);
	}
}
