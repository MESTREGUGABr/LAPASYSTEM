package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class AnimalNaoExisteException extends Exception{
	
	private static final long serialVersionUID = 1L;
		
	private String tutor;
		
	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public AnimalNaoExisteException(String tutor) {
		super("Não existe no sistema um animal com o tutor informado");
		this.tutor = tutor;
	}
}
