package br.edu.ufape.poo.lapa.negocio.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import br.edu.ufape.poo.lapa.dados.InterfaceColecaoVeterinario;

@SpringBootTest
public class InterfaceColecaoVeterinarioTeste {
	@Autowired
	private InterfaceColecaoVeterinario ColecaoVeterinario;
	
	@Test
	void cadastroVeterinarioTeste() {
		long qtdVeterinario = ColecaoVeterinario.count();
		Veterinario vet = new Veterinario("Maria Luisa","MaluW@gmail.com","87998270079","123456","UFAPE - Universidade Federal");
		ColecaoVeterinario.save(vet);
		long qtdVeterinario1 = ColecaoVeterinario.count();
		
		assertEquals(qtdVeterinario+1, qtdVeterinario1);
	}
}
