package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class AreaJaExistenteException extends Exception{

	private static final long serialVersionUID = 1L;
    
    private String nome;

    public String getNome() {
        return nome;
    }
    
    public AreaJaExistenteException(String nome) {
        super("Já existe uma área com o nome: " + nome);
        this.nome = nome;
    }
}
