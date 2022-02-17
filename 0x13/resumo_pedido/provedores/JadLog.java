package provedores;

public class JadLog implements ProvedorFrete {

    @Override
    public double calcularFrete(double peso, double valor) {
        return (peso > 2000 ? (valor * 0.07) : (valor * 0.045));

    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }


}