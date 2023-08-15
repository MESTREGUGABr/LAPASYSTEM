package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;

@Entity
@Table(name= "patologista")
public class Patologista extends Veterinario{

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Patologista(String nome, String email, String telefone, String crmv, String instituicao) {
		super(nome, email, telefone, crmv, instituicao);
		// TODO Auto-generated constructor stub
	}

}
