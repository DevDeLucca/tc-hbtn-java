package provedores;

public class Loggi implements ProvedorFrete {

    public Loggi() {

    }

    @Override
    public double calcularFrete(double peso, double valor) {
        return (peso > 5000 ? (valor * 0.12) : (valor * 0.04));

    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }

}