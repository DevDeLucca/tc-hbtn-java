public class PersonagemGame {

    private int saudeAtual = 0;
    private String nome;
    private String status;


    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
        setSaudeAtual(this.saudeAtual);
    }

    public void tomarDano(int quantidadeDeDano) {
        int resp = this.saudeAtual -= quantidadeDeDano;
        if (resp < 0) {
            resp = 0;
        }
        setSaudeAtual(resp);

    }

    public void receberCura(int quantidadeDeCura) {

        int resp = this.saudeAtual += quantidadeDeCura;
        if (resp > 100) {
            resp = 100;
        }
        setSaudeAtual(resp);

    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!(nome == null || nome == "")) {
            this.nome = nome;
        } else {
            nome = this.nome;

        }
    }

    public String getStatus() {
        return status;
    }

}
