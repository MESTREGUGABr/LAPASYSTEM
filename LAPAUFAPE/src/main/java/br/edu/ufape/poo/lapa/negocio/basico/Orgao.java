package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;


@Entity
@Table(name = "Orgao")
public class Orgao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String descricao;
	
	@ManyToOne
	private Area area;
	
	@OneToOne(mappedBy = "Orgao", cascade = CascadeType.ALL) 
	private ExameHistopatologico exame;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Orgao() {
		super();
	}
	
	public Orgao(String descricao) {
		super();
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}