package br.edu.ufape.poo.lapa.negocio.cadastro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.negocio.basico.Tutor;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.TutorNaoExisteException;
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
	
	@Test
    public void mostrarDadosTutorEncontradoTeste() {
        long tutorIdNaoExistente = 5L;

        TutorNaoExisteException exception = assertThrows(TutorNaoExisteException.class, () -> {
            // Simule o comportamento do método procurarTutorPorId
            Optional<Tutor> tutorOptional = Optional.of(cadastroTutor.procurarTutorPorId(tutorIdNaoExistente));

            if (!tutorOptional.isPresent()) {
                throw new TutorNaoExisteException("Tutor não encontrado");
            }
        });

        // Verifique a mensagem da exceção
        assertEquals("Não existe no sistema um tutor com o email informado", exception.getMessage());
    }
	
	@Test
    public void mostrarDadosTutorPorNomeNaoExistenteTeste() throws UsuarioDuplicadoException {
		String email = "emailteste@gmail.com";
		Tutor t1 = new Tutor ("Nicoly", email,"879999999");
		cadastroTutor.salvarTutor(t1);
        String nomeNaoExistente = "Nicol";

        // Use assertThrows para capturar a exceção TutorNaoExisteException
        TutorNaoExisteException exception = assertThrows(TutorNaoExisteException.class, () -> {
            // Simule o comportamento do método procurarTutorPorNome
            Optional<List<Tutor>> tutorOptional = Optional.of(cadastroTutor.procurarTutorPorNome(nomeNaoExistente));

            if (!tutorOptional.isPresent()) {
                throw new TutorNaoExisteException("Tutor não encontrado");
            }
        });

        
        assertEquals("Não existe no sistema um tutor com o email informado", exception.getMessage());
    }

}