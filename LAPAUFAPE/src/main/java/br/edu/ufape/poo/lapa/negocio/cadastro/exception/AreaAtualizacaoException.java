package br.edu.ufape.poo.lapa.negocio.cadastro.exception;

public class AreaAtualizacaoException extends Exception{

	private static final long serialVersionUID = 1L;

    private Long id;
    private String motivo;

    public AreaAtualizacaoException(Long id, String motivo) {
        super("Não foi possível atualizar a área com o ID " + id + ". Motivo: " + motivo);
        this.id = id;
        this.motivo = motivo;
    }

    public Long getId() {
        return id;
    }

    public String getMotivo() {
        return motivo;
    }
}
