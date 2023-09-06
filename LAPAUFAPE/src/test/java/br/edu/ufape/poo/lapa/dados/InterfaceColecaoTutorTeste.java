package br.edu.ufape.poo.lapa.dados;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoTutor;
import br.edu.ufape.poo.lapa.negocio.basico.Tutor;

@SpringBootTest
public class InterfaceColecaoTutorTeste {
	
	@Autowired
	private InterfaceColecaoTutor colecaoTutor;
	
	@Test
	void cadastroTutorTeste() {
		long qtdTutor = colecaoTutor.count();
		Tutor tutor = new Tutor("Maria", "maria@gmail.com", "547921889");
		colecaoTutor.save(tutor);
		long qtdTutor1 = colecaoTutor.count();
		
		assertEquals(qtdTutor+1, qtdTutor1);
	}
	
	@Test
    void exclusaoTutorTeste() {

        Tutor tutor = new Tutor("Teste Exclusão 1", "teste1@gmail.com", "937921873");
        colecaoTutor.save(tutor);
        
        long qtdTutoresAntes = colecaoTutor.count();
        assertTrue(colecaoTutor.existsById(tutor.getId()));
        
        colecaoTutor.delete(tutor);
        
        long qtdTutoresDepois = colecaoTutor.count();
        assertFalse(colecaoTutor.existsById(tutor.getId()));
        assertEquals(qtdTutoresAntes - 1, qtdTutoresDepois);
    }
	
//	@Test
//    void exclusaoTutorPorIdExistenteTeste() {
//
//		long tutorIdExistente = 4L;
//
//        assertTrue(colecaoTutor.existsById(tutorIdExistente));
//
//        colecaoTutor.deleteById(tutorIdExistente);
//
//        assertFalse(colecaoTutor.existsById(tutorIdExistente));
//    }
	
//	@Test
//    void edicaoTutorTeste() {
//
//		long tutorIdExistente = 7L;
//
//        Tutor tutor = colecaoTutor.findById(tutorIdExistente).orElse(null);
//        assertTrue(tutor != null);
//
//        String novoNome = "Novo Nome";
//        tutor.setNome(novoNome);
//        String novoEmail = "novoemail@gmail.com";
//        tutor.setEmail(novoEmail);
//        String novoTelefone = "123456789";
//        tutor.setTelefone(novoTelefone);
//
//        colecaoTutor.save(tutor);
//
//                Tutor tutorAtualizado = colecaoTutor.findById(tutorIdExistente).orElse(null);
//        assertTrue(tutorAtualizado != null);
//
//        assertEquals(novoNome, tutorAtualizado.getNome());
//        assertEquals(novoEmail, tutorAtualizado.getEmail());
//        assertEquals(novoTelefone, tutorAtualizado.getTelefone());
//    }
/*
	@Test
    void mostrarDadosTutorEncontradoTeste() {
        long tutorIdExistente = 7L;

        Optional<Tutor> tutorOptional = colecaoTutor.findById(tutorIdExistente);

        assertTrue(tutorOptional.isPresent());

        Tutor tutorEncontrado = tutorOptional.get();

//        System.out.println("ID: " + tutorEncontrado.getId());
//        System.out.println("Nome: " + tutorEncontrado.getNome());
//        System.out.println("Email: " + tutorEncontrado.getEmail());
//        System.out.println("Telefone: " + tutorEncontrado.getTelefone());

        assertEquals(tutorIdExistente, tutorEncontrado.getId());
    }
    */
}
