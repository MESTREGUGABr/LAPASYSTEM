package br.edu.ufape.poo.lapa.dados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoArea;
import br.edu.ufape.poo.lapa.negocio.basico.Area;

@SpringBootTest
public class InterfaceColecaoAreaTeste {

	@Autowired
	private InterfaceColecaoArea ColecaoArea;
	
	@Test
	void cadastroArea() {
		long qtdArea = ColecaoArea.count();
		Area are = new Area("Caixa Toracida");
		ColecaoArea.save(are);
		long qtdArea1 = ColecaoArea.count();
		
		assertEquals(qtdArea+1, qtdArea1);

		
	}
}
