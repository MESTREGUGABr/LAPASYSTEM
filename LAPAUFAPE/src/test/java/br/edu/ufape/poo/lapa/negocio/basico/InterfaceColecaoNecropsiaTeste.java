package br.edu.ufape.poo.lapa.negocio.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoNecropsia;
import br.edu.ufape.poo.lapa.negocio.basico.Enum.EstadoDeConservacao;

@SpringBootTest
public class InterfaceColecaoNecropsiaTeste {
	
	@Autowired
	private InterfaceColecaoNecropsia ColecaoNecropsia;
	EstadoDeConservacao estado = EstadoDeConservacao.MEDIO;

	@Test
	void cadastroNecropsia() {
		long qtdNecropsia = ColecaoNecropsia.count();
		
		Date DataHoraNecropsia = new Date();
		
		Necropsia nec = new Necropsia(DataHoraNecropsia,estado,"Eutanasia");
		ColecaoNecropsia.save(nec);
		long qtdNecropsia1 = ColecaoNecropsia.count();
		
		assertEquals(qtdNecropsia+1, qtdNecropsia1);
		
	}
	
}
