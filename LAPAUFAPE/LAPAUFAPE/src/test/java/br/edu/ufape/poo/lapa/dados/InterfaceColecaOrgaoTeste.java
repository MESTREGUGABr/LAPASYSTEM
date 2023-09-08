package br.edu.ufape.poo.lapa.dados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.lapa.dados.InterfaceColecaoOrgao;
import br.edu.ufape.poo.lapa.negocio.basico.Orgao;

@SpringBootTest
public class InterfaceColecaOrgaoTeste {

		@Autowired
		private InterfaceColecaoOrgao ColecaoOrgao;
		
		@Test
		void cadastroOrgao() {
			long qtdOrgao = ColecaoOrgao.count();
			Orgao org = new Orgao("Coração");
			ColecaoOrgao.save(org);
			long qtdOrgao1 = ColecaoOrgao.count();
			
			assertEquals(qtdOrgao+1, qtdOrgao1);

			
		}
}
