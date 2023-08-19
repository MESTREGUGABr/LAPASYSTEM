package br.edu.ufape.poo.lapa.negocio.basico;


import jakarta.persistence.*;

@Entity
@Table(name="laudo")
public class Laudo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private Patologista patologisa;
	private Tutor tutorsolicitante;
	
	@OneToOne(mappedBy = "laudo", cascade = CascadeType.ALL)
	private Necropsia necropsia;
	
	@OneToOne(mappedBy = "laudo", cascade = CascadeType.ALL)
	private Animal animal;
	
    @OneToOne(mappedBy = "laudo", cascade = CascadeType.ALL)
	private Patologista patologista;
	
	public Laudo(Patologista patologisa, Tutor tutorsolicitante) {
		super();
		this.patologisa = patologisa;
		this.tutorsolicitante = tutorsolicitante;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Patologista getPatologisa() {
		return patologisa;
	}
	public void setPatologisa(Patologista patologisa) {
		this.patologisa = patologisa;
	}
	public Tutor getTutorsolicitante() {
		return tutorsolicitante;
	}
	public void setTutorsolicitante(Tutor tutorsolicitante) {
		this.tutorsolicitante = tutorsolicitante;
	}
	
	
	
	
}
