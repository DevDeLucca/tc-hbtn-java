public class Contato {

    private String nome;
    private String numeroDeTelefone;
    private TipoNumero tipo;


    public Contato() {

    }


    public Contato(String nome, String numeroDeTelefone, TipoNumero tipo) {
        super();
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
        this.tipo = tipo;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }
    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }
    public TipoNumero getTipo() {
        return tipo;
    }
    public void setTipo(TipoNumero tipo) {
        this.tipo = tipo;
    }
}