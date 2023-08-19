package br.edu.ufape.poo.lapa.negocio.basico;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "area")
public class Area {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy = "orgao", cascade = CascadeType.ALL) 
	private List<Orgao> orgaos;
	
	private String descricao;
	
	public long getId() {
		return id;
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
