package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;


@Entity
public class Orgao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "area_id")
	private Area area;

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

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	
}