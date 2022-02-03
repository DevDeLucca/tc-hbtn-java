public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo,
                                   double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        if (super.getSaldo() <= saldoMinimo) {
            double penalidade = super.getSaldo() - valorPenalidade + super.calcularJurosMensal() - super.calcularTarifaMensal();
            super.setSaldo(penalidade);
        }
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }

    public void setValorPenalidade(double valorPenalidade) {
        this.valorPenalidade = valorPenalidade;
    }
}