package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;

@Entity
public class Patologista extends Veterinario{


	@ManyToOne
	private Laudo laudo;
	
	public Patologista() {
        super(null, null, null, null, null); // Você pode passar valores padrão ou null aqui
    }

	public Patologista(String nome, String email, String telefone, String crmv, String instituicao) {
		super(nome, email, telefone, crmv, instituicao);
		// TODO Auto-generated constructor stub
	}

}
