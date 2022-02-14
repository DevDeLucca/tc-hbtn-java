import java.util.ArrayList;
//instanciando bjeto cliente
public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente() {

    }

    public Cliente(String nome, double transacao) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
    }

//instanciando objeto transacao
    public void adicionarTransacao(double valorDaTransacao) {
        transacoes.add(valorDaTransacao);
    }


    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }
}