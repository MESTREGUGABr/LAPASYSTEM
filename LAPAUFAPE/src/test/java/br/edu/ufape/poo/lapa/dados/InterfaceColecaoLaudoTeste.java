package br.edu.ufape.poo.lapa.dados;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoAnimal;
import br.edu.ufape.poo.lapa.dados.InterfaceColecaoLaudo;
import br.edu.ufape.poo.lapa.dados.InterfaceColecaoNecropsia;
import br.edu.ufape.poo.lapa.dados.InterfaceColecaoPatologista;
import br.edu.ufape.poo.lapa.dados.InterfaceColecaoTutor;
import br.edu.ufape.poo.lapa.negocio.basico.Animal;
import br.edu.ufape.poo.lapa.negocio.basico.Laudo;
import br.edu.ufape.poo.lapa.negocio.basico.Necropsia;
import br.edu.ufape.poo.lapa.negocio.basico.Patologista;
import br.edu.ufape.poo.lapa.negocio.basico.Tutor;


@SpringBootTest
public class InterfaceColecaoLaudoTeste {

	@Autowired
	private InterfaceColecaoLaudo colecaoLaudo;
	
	@Autowired
    private InterfaceColecaoTutor colecaoTutor; 

    @Autowired
    private InterfaceColecaoNecropsia colecaoNecropsia; 

    @Autowired
    private InterfaceColecaoAnimal colecaoAnimal; 

    @Autowired
    private InterfaceColecaoPatologista colecaoPatologista; 

    @Test
    void testeCadastrarLaudoComSucesso() {
       
        Tutor tutorExistente = colecaoTutor.findById(7L).orElse(null); 
        Necropsia necropsiaExistente = colecaoNecropsia.findById(1L).orElse(null);
        Animal animalExistente = colecaoAnimal.findById(3L).orElse(null); 
        Patologista patologistaExistente = colecaoPatologista.findById(4L).orElse(null);

        assertNotNull(tutorExistente);
        assertNotNull(necropsiaExistente);
        assertNotNull(animalExistente);
        assertNotNull(patologistaExistente);

       
        Laudo laudo = new Laudo(animalExistente, necropsiaExistente, patologistaExistente, tutorExistente);
        

        Laudo laudoSalvo = colecaoLaudo.save(laudo);

        assertNotNull(laudoSalvo.getId());
        assertTrue(laudoSalvo.getId() > 0);
    }
}
