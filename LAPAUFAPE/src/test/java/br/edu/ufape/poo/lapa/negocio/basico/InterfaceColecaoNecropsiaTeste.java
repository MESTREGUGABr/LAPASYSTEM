package br.edu.ufape.poo.lapa.negocio.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoNecropsia;
import br.edu.ufape.poo.lapa.negocio.basico.Enum.EstadoConservacao.EstadoConserv;

@SpringBootTest
public class InterfaceColecaoNecropsiaTeste {
	
	@Autowired
	private InterfaceColecaoNecropsia ColecaoNecropsia;
	EstadoConserv estado = EstadoConserv.PERFEITO;
	
	@Test
	void cadastroNecropsia() {
		long qtdNecropsia = ColecaoNecropsia.count();
		Necropsia nec = new Necropsia(estado,"Eutanasia");
		ColecaoNecropsia.save(nec);
		long qtdNecropsia1 = ColecaoNecropsia.count();
		
		assertEquals(qtdNecropsia+1, qtdNecropsia1);
		
	}
	
}
