package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class TipoIncompativelException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	private String campo;
    private String tipoEsperado;

    public TipoIncompativelException(String campo, String tipoEsperado) {
        super("Tipo incompatível para o campo " + campo + ". Tipo esperado: " + tipoEsperado);
        this.campo = campo;
        this.tipoEsperado = tipoEsperado;
    }

    public String getCampo() {
        return campo;
    }

    public String getTipoEsperado() {
        return tipoEsperado;
    }

}
