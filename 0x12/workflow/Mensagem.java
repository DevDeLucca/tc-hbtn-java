public class Mensagem {

    private String texto;
    private String tipoMensagem TipoMensagem;

    public Mensagem() {

    }

    public Mensagem(String texto, TipoMensagem tipoMensagem) {
        super();
        this.texto = texto;
        this.tipoMensagem = tipoMensagem;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoMensagem getTipoMensagem() {
        return tipoMensagem;
    }

    public void setTipoMensagem(TipoMensagem tipoMensagem) {
        this.tipoMensagem = tipoMensagem;
    }

}

