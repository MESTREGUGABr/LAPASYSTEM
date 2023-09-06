package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class LaudoNaoExisteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private Long id;
    private boolean jaExiste;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isJaExiste() {
        return jaExiste;
    }

    public void setJaExiste(boolean jaExiste) {
        this.jaExiste = jaExiste;
    }

    public LaudoNaoExisteException(Long id, boolean jaExiste) {
        super((jaExiste ? "Já existe" : "Não existe") + " um laudo com o ID informado: " + id);
        this.id = id;
        this.jaExiste = jaExiste;
    }

}
