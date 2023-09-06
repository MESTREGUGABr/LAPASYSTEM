package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class LaudoJaExisteException extends Exception{

	private static final long serialVersionUID = 1L;
	public Long userId;
	private String tutor;
	
	public void setTutor(String tutor) {
        this.tutor = tutor;
    	}

    	public LaudoJaExisteException(String tutor) {
        	super("Já existe um laudo associado ao tutor informado");
        	this.tutor = tutor;
    	}

}
