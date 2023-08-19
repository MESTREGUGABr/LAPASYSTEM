package br.edu.ufape.poo.lapa.negocio.basico;

import java.util.Date;
import java.util.List;

import br.edu.ufape.poo.lapa.negocio.basico.Enum.EstadoDeConservacao;
import jakarta.persistence.*;

@Entity
@Table(name="necropsia")
public class Necropsia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date DataHoraNecropsia;
	private EstadoDeConservacao estado;
	private String tipoMorte;
	
	@OneToMany(mappedBy = "necropsia", cascade = CascadeType.ALL)
	private List<ParteNecropsia> partenecropsia;
	
	@OneToMany(mappedBy = "necropsia", cascade = CascadeType.ALL)
	private List<ExameHistopatologico> examesHistopatologicos;
	
	
	@OneToOne(mappedBy = "necropsia", cascade = CascadeType.ALL)
	private Laudo laudo;
	
	public Necropsia() {
		super();
	}

	public Necropsia(Date DataHoraNecropsia, EstadoDeConservacao estado, String tipoMorte) {
		this.DataHoraNecropsia = DataHoraNecropsia;
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
		return DataHoraNecropsia;
	}

	public void setDataHoraNecropsia(Date DataHoraNecropsia) {
		this.DataHoraNecropsia = DataHoraNecropsia;
	}

	public String getTipoMorte() {
		return tipoMorte;
	}

	public void setTipoMorte(String tipoMorte) {
		this.tipoMorte = tipoMorte;
	}

	public EstadoDeConservacao getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeConservacao estado) {
		this.estado = estado;
	}

	public List<ParteNecropsia> getPartenecropsia() {
		return partenecropsia;
	}

	public void setPartenecropsia(List<ParteNecropsia> partenecropsia) {
		this.partenecropsia = partenecropsia;
	}

	public List<ExameHistopatologico> getExamesHistopatologicos() {
		return examesHistopatologicos;
	}

	public void setExamesHistopatologicos(List<ExameHistopatologico> examesHistopatologicos) {
		this.examesHistopatologicos = examesHistopatologicos;
	}

	public Laudo getLaudo() {
		return laudo;
	}

	public void setLaudo(Laudo laudo) {
		this.laudo = laudo;
	}
	
	
	
	
}
