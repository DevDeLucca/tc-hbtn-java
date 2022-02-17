package provedores;

public class Sedex implements ProvedorFrete {


    public Sedex() {

    }

    @Override
    public double calcularFrete(double peso, double valor) {
        return (peso > 1000 ? (valor*0.10): (valor*0.05));
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {

        return TipoProvedorFrete.SEDEX;
    }
}