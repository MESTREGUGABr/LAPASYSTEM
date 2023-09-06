package br.edu.ufape.poo.lapa.negocio.basico;

import java.util.Date;

import br.edu.ufape.poo.lapa.negocio.basico.Enum.Especie;
import br.edu.ufape.poo.lapa.negocio.basico.Enum.Sexo;
import jakarta.persistence.*;

@Entity
@Table(name="animal")
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "tutor_id")
	private Tutor tutor;
	private String porte;
	private int score;
	private float medidas;
	private String rghv;
	private int idade;
	private Especie especie;
	private Sexo sexo;
	private float peso;
	private Date dataHoraObito;
	
	public Animal() {
		super();
	}

	public Animal(String nome, Tutor tutor, String porte, int score, float medidas, String rghv, int idade,
			Especie especie, Sexo sexo, float peso, Date dataHoraObito) {
		super();
		this.nome = nome;
		this.tutor = tutor;
		this.porte = porte;
		this.score = score;
		this.medidas = medidas;
		this.rghv = rghv;
		this.idade = idade;
		this.especie = especie;
		this.sexo = sexo;
		this.peso = peso;
		this.dataHoraObito = dataHoraObito;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Tutor getTutor() {
		return tutor;
	}
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public float getMedidas() {
		return medidas;
	}
	public void setMedidas(float medidas) {
		this.medidas = medidas;
	}
	public String getRghv() {
		return rghv;
	}
	public void setRghv(String rghv) {
		this.rghv = rghv;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Especie getEspecie() {
		return especie;
	}
	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Date getDataHoraObito() {
		return dataHoraObito;
	}
	public void setDataHoraObito(Date dataHoraObito) {
		this.dataHoraObito = dataHoraObito;
	}
	
}
