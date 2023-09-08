package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class TutorNaoExisteException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TutorNaoExisteException(String email) {
		super("Não existe no sistema um tutor com o email informado");
		this.email = email;
	}
}
