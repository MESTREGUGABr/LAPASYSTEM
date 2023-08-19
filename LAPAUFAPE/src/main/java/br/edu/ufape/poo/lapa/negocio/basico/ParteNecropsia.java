package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;


@Entity
@Table(name="partenecropsia")
public class ParteNecropsia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
	private Area area;
	
	@OneToMany(mappedBy = "partenecropsia", cascade = CascadeType.ALL)
	private Necropsia necropsia;
	
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

	private String avaliacao;
	
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
