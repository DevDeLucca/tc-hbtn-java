import java.util.ArrayList;

public class Banco {
//instanciando objeto banco
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {

        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public boolean adicionarAgencia(String agenciaNova) {
        Agencia agenciaLocalizada = buscarAgencia(agenciaNova);
        if (agenciaLocalizada != null) {
            return false;

        }

        Agencia novaAgencia = new Agencia(agenciaNova);
        agencias.add(novaAgencia);
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTansacaoInicial) {
        Agencia agenciaLocalizada = buscarAgencia(nomeAgencia);
        if (agenciaLocalizada == null) {
            return false;
        }

        agenciaLocalizada.novoCliente(nomeCliente, valorTansacaoInicial);
        agenciaLocalizada.adicionarTransacaoCliente(nomeCliente, valorTansacaoInicial);

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTansacaoInicial) {
        Agencia agenciaLocalizada = buscarAgencia(nomeAgencia);

        if (agenciaLocalizada == null) {
            return false;
        }

        agenciaLocalizada.adicionarTransacaoCliente(nomeCliente, valorTansacaoInicial);
        return true;

    }

    public Agencia buscarAgencia(String nomeAgencia) {

        for (int i = 0; i < this.agencias.size(); i++) {
            if (this.agencias.get(i).getNome().equals(nomeAgencia)) {
                return agencias.get(i);
            }
        }

        return null;
    }


    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
        Agencia agenciaLocalizada = buscarAgencia(nomeAgencia);

        if (agenciaLocalizada == null) {
            return false;
        }

        for (int i = 0; i < agenciaLocalizada.getClientes().size(); i++) {
            Cliente clienteEncontrado = agenciaLocalizada.getClientes().get(i);
            System.out.println("Cliente: " + clienteEncontrado.getNome() + " [" + (i + 1) + "]");

            if (imprimirTransacoes) {
                for (int j = 0; j < clienteEncontrado.getTransacoes().size(); j++) {
                    System.out.println("  [" + (j + 1) + "] valor " + clienteEncontrado.getTransacoes().get(j));
                }
            }

        }

        return true;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

}