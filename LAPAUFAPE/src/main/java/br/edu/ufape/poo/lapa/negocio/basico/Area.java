package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;

@Entity
public class Area {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String descricao;
	
	public long getId() {
		return id;
	}
	

	public Area() {
		super();
	}


	public Area(String descricao) {
		super();
		this.descricao = descricao;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
	

