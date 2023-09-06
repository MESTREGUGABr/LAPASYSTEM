package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class NecropsiaNaoEncontradaException extends Exception{

	private static final long serialVersionUID = 1L;
    
    private Long id;
    
    public NecropsiaNaoEncontradaException(Long id) {
        super("Necropsia não encontrada com o ID: " + id);
        this.id = id;
    }
    
    public Long getId() {
        return id;
    }
}
