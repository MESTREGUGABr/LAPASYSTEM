package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class VeterinarioNaoExisteException extends Exception{

	private static final long serialVersionUID = 1L;
		
	private String email;
		
	public String getEmail() {
			return email;
	}

	public void setEmail(String email) {
			this.email = email;
	}

	public VeterinarioNaoExisteException(String email) {
		super("Não existe no sistema um veterinário com o email informado");
		this.email = email;
	}
}
	