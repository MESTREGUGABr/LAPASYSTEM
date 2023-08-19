package br.edu.ufape.poo.lapa.negocio.basico;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="exameHistopatologico")
public class ExameHistopatologico extends Necropsia{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToOne
	private Orgao orgao;
	
	@ManyToOne  
	private Necropsia necropsia;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public ExameHistopatologico(Date DataHoraNecropsia) {
		super();
	}
	
	
}
