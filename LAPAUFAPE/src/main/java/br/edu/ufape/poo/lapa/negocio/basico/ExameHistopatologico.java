package br.edu.ufape.poo.lapa.negocio.basico;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class ExameHistopatologico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Orgao orgao;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public ExameHistopatologico(Date DataHoraNecropsia) {
		super();
	}

	public Orgao getOrgao() {
		return orgao;
	}

	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}
	
	
}
	
	

