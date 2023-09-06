package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class ExameHistopatologicoNaoEncontradoException extends Exception{

	 private static final long serialVersionUID = 1L;

	    private Long id;

	    public ExameHistopatologicoNaoEncontradoException(Long id) {
	        super("Exame histopatológico não encontrado com o ID: " + id);
	        this.id = id;
	    }

	    public Long getId() {
	        return id;
	    }
}