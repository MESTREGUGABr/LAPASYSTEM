package br.edu.ufape.poo.lapa.negocio.basico;

import jakarta.persistence.*;

@Entity
public class Veterinario extends Pessoa{
	

	
	private String crmv;
	private String instituicao;
	
	public Veterinario(String nome, String email, String telefone, String crmv, String instituicao) {
		super(nome, email, telefone);
		this.crmv = crmv;
		this.instituicao = instituicao;
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
