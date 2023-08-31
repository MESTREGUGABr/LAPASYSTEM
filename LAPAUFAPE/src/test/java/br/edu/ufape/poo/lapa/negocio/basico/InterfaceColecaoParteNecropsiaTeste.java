package br.edu.ufape.poo.lapa.negocio.basico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoOrgao;
import br.edu.ufape.poo.lapa.dados.InterfaceColecaoParteNecropsia;

@SpringBootTest
public class InterfaceColecaoParteNecropsiaTeste {

	@Autowired
	private InterfaceColecaoParteNecropsia colecaoParteNecropsia;
	
	@Autowired
	private InterfaceColecaoOrgao colecaoOrgao;
	
//	@Test
//	void cadastroParteNecropsia() {
//		long qtdParteNecropsia= colecaoParteNecropsia.count();
//		ParteNecropsia part = new ParteNecropsia("Caixa Toracica");
//		colecaoParteNecropsia.save(part);
//		long qtdParteNecropsia1 = colecaoParteNecropsia.count();
//		
//		assertEquals(qtdParteNecropsia+1, qtdParteNecropsia1);
//	}
	
	@Test
	void testCadastroParteNecropsiaComOrgaoValido() {
	    long qtdParteNecropsia = colecaoParteNecropsia.count();

	    Long orgaoId = 1L;

	    Orgao orgao = colecaoOrgao.findById(orgaoId).orElse(null);

	    if (orgao == null) {
	        return;
	    }

	    ParteNecropsia part = new ParteNecropsia("Caixa Test");
	    part.setOrgao(orgao);

	    colecaoParteNecropsia.save(part);

	    long qtdParteNecropsia1 = colecaoParteNecropsia.count();

	    assertEquals(qtdParteNecropsia + 1, qtdParteNecropsia1);
	}
}
