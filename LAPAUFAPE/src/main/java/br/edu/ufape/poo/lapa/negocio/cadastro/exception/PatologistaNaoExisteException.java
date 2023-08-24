package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class PatologistaNaoExisteException extends Exception{

	private static final long serialVersionUID = 1L;

	private String email;

	public String email() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PatologistaNaoExisteException(String tutor) {
		super("Não existe no sistema um patologista com o email informado");
		this.email = email;
	}
}

