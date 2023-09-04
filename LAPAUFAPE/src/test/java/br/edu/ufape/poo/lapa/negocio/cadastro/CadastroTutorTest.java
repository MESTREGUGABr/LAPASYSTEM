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
    void exclusaoTutorTeste() {
		
		String email = "te@gmail.com";

        Tutor tutor = new Tutor("Teste Exclusão 3", email , "937921873");
//        Tutor tutor2 = new Tutor("Teste Exclusão 2", email , "3424242");
        
        UsuarioDuplicadoException exception = 
				assertThrows(UsuarioDuplicadoException.class, 
			() -> {
				cadastroTutor.salvarTutor(tutor);
//				cadastroTutor.salvarTutor(tutor2);
				  }			
		);
        
//        long qtdTutoresAntes = cadastroTutor.contarTutores();
//     
//        assertTrue(cadastroTutor.tutorExistePorId(tutor.getId()));
        
        assertEquals(exception.getEmail(), email);
//		assertTrue(exception.getMessage().contains("mesmo email"));
        
//        cadastroTutor.deletarTutorPorId(tutor.getId());
//        
//        long qtdTutoresDepois = cadastroTutor.contarTutores();
//        assertFalse(cadastroTutor.tutorExistePorId(tutor.getId()));
//        assertEquals(qtdTutoresAntes - 1, qtdTutoresDepois);
    }

}
