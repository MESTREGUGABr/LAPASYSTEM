package br.edu.ufape.poo.lapa.negocio.basico;


import jakarta.persistence.*;

@Entity
@Table(name="laudo")
public class Laudo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	private Tutor tutorsolicitante;
	
	@OneToOne( cascade = CascadeType.ALL)
	private Necropsia necropsia;


	@OneToOne( cascade = CascadeType.ALL)
	private Animal animal;

	@ManyToOne(cascade = CascadeType.ALL)
	private Patologista patologista;

	
	public Laudo(Patologista patologista, Tutor tutorsolicitante) {
		super();
		this.patologista = patologista;
		this.tutorsolicitante = tutorsolicitante;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public Tutor getTutorsolicitante() {
		return tutorsolicitante;
	}
	public void setTutorsolicitante(Tutor tutorsolicitante) {
		this.tutorsolicitante = tutorsolicitante;
	}
	
	
	
	
}