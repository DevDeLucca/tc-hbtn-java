import exceptions.OperacaoInvalidaException;
public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {

        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0 ) {
            saldo += valor;
        }else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor == 0 ) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }else if (saldo >= valor) {
            saldo -= valor;
        }else {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que o saldo atual");
        }
    }

    public double calcularTarifaMensal() {
        if ((saldo * 0.10) > 10.0) {
            return 10;
        }else {
            return saldo * 0.10;
        }
    }

    public double calcularJurosMensal() {
        if (saldo < 0 ) {
            return 0;
        }else{
            return saldo * ((taxaJurosAnual / 100) / 12);
        }
    }

    public void aplicarAtualizacaoMensal() {
        saldo = (saldo + calcularJurosMensal())- calcularTarifaMensal();
    }

    public String getNumeracao() {
        return numeracao;
    }
    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }
}