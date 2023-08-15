package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;

@Entity
@Table(name= "veterinario")
public class Veterinario extends Pessoa{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String crmv;
	private String instituicao;
	
	public Veterinario(String nome, String email, String telefone, String crmv, String instituicao) {
		super(nome, email, telefone);
		this.crmv = crmv;
		this.instituicao = instituicao;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getCrmv() {
		return crmv;
	}
	public void setCrmv(String crmv) {
		this.crmv = crmv;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
}
