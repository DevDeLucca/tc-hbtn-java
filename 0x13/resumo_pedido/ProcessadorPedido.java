import provedores.ProvedorFrete;

public class ProcessadorPedido {

    private ProvedorFrete provedorFrete;
    private Frete frete = new Frete();


    public ProcessadorPedido() {

    }

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        super();
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
        double valor = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getTotal());

        frete.setTipoProvedorFrete(provedorFrete.obterTipoProvedorFrete());
        frete.setValor(valor);

        pedido.setFrete(frete);

    }
}