package br.edu.ufape.poo.lapa.dados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoPatologista;
import br.edu.ufape.poo.lapa.negocio.basico.Patologista;

@SpringBootTest
public class InterfaceColecaoPatologistaTeste {

	@Autowired
	private InterfaceColecaoPatologista ColecaoPatologista;
	
	@Test
	void cadastroPatologista() {
		long qtdPatologista = ColecaoPatologista.count();
		Patologista pat = new Patologista ("Érica Monte", "Erikakaka@gmail.com", "8799999999", "123456789","UFAPE - Universidade Federal");
		ColecaoPatologista.save(pat);
		long qtdPatologista1 = ColecaoPatologista.count();
		
		assertEquals(qtdPatologista+1, qtdPatologista1);
		
	}
}
