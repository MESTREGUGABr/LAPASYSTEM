package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class NenhumExameHistopatologicoEncontradoException extends Exception{

	 private static final long serialVersionUID = 1L;

	    public NenhumExameHistopatologicoEncontradoException() {
	        super("Nenhum exame histopatológico foi encontrado.");
	    }
}
