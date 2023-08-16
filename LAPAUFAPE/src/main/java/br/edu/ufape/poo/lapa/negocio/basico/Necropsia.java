package br.edu.ufape.poo.lapa.negocio.basico;

import java.util.Date;

import br.edu.ufape.poo.lapa.negocio.basico.Enum.EstadoConservacao.EstadoConserv;
import jakarta.persistence.*;

@Entity
@Table(name="necropsia")
public class Necropsia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Date dataHoraNecropsia;
	private EstadoConserv estado;
	private String tipoMorte;
	
	public Necropsia() {
		super();
	}

	public Necropsia(EstadoConserv estado, String tipoMorte) {
		this.estado = estado;
		this.tipoMorte = tipoMorte;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataHoraNecropsia() {
		return dataHoraNecropsia;
	}

	public void setDataHoraNecropsia(Date dataHoraNecropsia) {
		this.dataHoraNecropsia = dataHoraNecropsia;
	}

	public String getTipoMorte() {
		return tipoMorte;
	}

	public void setTipoMorte(String tipoMorte) {
		this.tipoMorte = tipoMorte;
	}

	public EstadoConserv getEstado() {
		return estado;
	}

	public void setEstado(EstadoConserv estado) {
		this.estado = estado;
	}
	
	
	
	
}
