package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;


@Entity
@Table(name="partenecropsia")
public class ParteNecropsia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
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
