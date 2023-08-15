package br.edu.ufape.poo.lapa.negocio.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoParteNecropsia;

@SpringBootTest
public class InterfaceColecaoParteNecropsiaTeste {

	@Autowired
	private InterfaceColecaoParteNecropsia ColecaoParteNecropsia;
	
	@Test
	void cadastroParteNecropsia() {
		long qtdParteNecropsia= ColecaoParteNecropsia.count();
		ParteNecropsia part = new ParteNecropsia("Caixa toracica");
		ColecaoParteNecropsia.save(part);
		long qtdParteNecropsia1 = ColecaoParteNecropsia.count();
		
		assertEquals(qtdParteNecropsia+1, qtdParteNecropsia1);
	}
}
