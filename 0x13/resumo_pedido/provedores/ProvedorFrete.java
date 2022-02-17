package provedores;

public interface ProvedorFrete {

    public double calcularFrete(double peso, double valor);
    public TipoProvedorFrete obterTipoProvedorFrete();
}