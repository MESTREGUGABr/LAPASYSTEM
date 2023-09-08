package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;


@Entity
public class ParteNecropsia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String avaliacao;
	@ManyToOne
	private Orgao orgao;
	
	
		
	public Orgao getOrgao() {
		return orgao;
	}


	public void setOrgao(Orgao orgao) {
		this.orgao = orgao;
	}


	public long getId() {
		return id;
	}


	public ParteNecropsia(String avaliacao) {
		super();
		this.avaliacao = avaliacao;
	}


	public void setId(long id) {
		this.id = id;
	}


	public ParteNecropsia() {
		super();
	}


	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	

}