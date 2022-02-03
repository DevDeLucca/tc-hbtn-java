import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);

    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0 ) {
            double saldoA = super.getSaldo() + valor - 0.10;
            setSaldo(saldoA);
        }else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor == 0 ) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }else if (super.getSaldo() >= valor) {
            double saldoA = super.getSaldo() - valor - 0.10;
            setSaldo(saldoA);
        }else {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que o saldo atual");
        }
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void setQuantidadeTransacoes(int quantidadeTransacoes) {
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

}