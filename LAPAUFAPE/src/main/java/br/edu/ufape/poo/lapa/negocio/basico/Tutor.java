package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;


@Entity
@Table(name = "tutor")
public class Tutor extends Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	public Tutor() {
		super();
	}

	public Tutor(String nome, String email, String telefone) {
		super(nome, email, telefone);
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
	

}
