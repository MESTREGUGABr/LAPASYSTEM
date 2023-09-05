package br.edu.ufape.poo.lapa.negocio.cadastro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.negocio.basico.Tutor;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;

@SpringBootTest
public class CadastroTutorTest {
	
	@Autowired
	private InterfaceCadastroTutor cadastroTutor;
	
	@Test
    void testarCadastroEmailDuplicado() {
		
		String email = "emailteste@gmail.com";
		Tutor t1 = new Tutor ("Nicoly", email,"879999999");
		Tutor t2 = new Tutor ("Erica", email,"8788888888");
		
		UsuarioDuplicadoException exception =
				assertThrows(UsuarioDuplicadoException.class,
			() -> {
				
				cadastroTutor.salvarTutor(t1);
				cadastroTutor.salvarTutor(t2);
				
			});
		
			
			assertEquals(exception.getEmail(), email);
			assertTrue(exception.getMessage().contains("mesmo email"));
			
	}

}
