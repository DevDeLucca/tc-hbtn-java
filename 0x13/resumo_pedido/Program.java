import provedores.*;

public class Program {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1, 1500, 234.90);
        Pedido pedido2 = new Pedido(2, 600, 124.00);
        Pedido pedido3 = new Pedido(3, 3000, 53.00);
        Pedido pedido4 = new Pedido(4, 7000, 300.00);

        ProcessadorPedido processadorPedidoSedex = new ProcessadorPedido(new Sedex());
        processadorPedidoSedex.processar(pedido1);

        System.out.printf("%s - %.2f\n", pedido1.getFrete().getTipoProvedorFrete(), pedido1.getFrete().getValor());

        ProcessadorPedido processadorPedidoJadLog = new ProcessadorPedido(new JadLog());
        processadorPedidoJadLog.processar(pedido1);

        System.out.printf("%s - %.2f\n", pedido1.getFrete().getTipoProvedorFrete(), pedido1.getFrete().getValor());

        ProcessadorPedido processadorPedidoLoggi = new ProcessadorPedido(new Loggi());
        processadorPedidoLoggi.processar(pedido1);

        System.out.printf("%s - %.2f\n", pedido1.getFrete().getTipoProvedorFrete(), pedido1.getFrete().getValor());

        System.out.println("-----");

        processadorPedidoSedex.processar(pedido2);
        System.out.printf("%s - %.2f\n", pedido2.getFrete().getTipoProvedorFrete(), pedido2.getFrete().getValor());

        processadorPedidoJadLog.processar(pedido2);
        System.out.printf("%s - %.2f\n", pedido2.getFrete().getTipoProvedorFrete(), pedido2.getFrete().getValor());

        processadorPedidoLoggi.processar(pedido2);
        System.out.printf("%s - %.2f\n", pedido2.getFrete().getTipoProvedorFrete(), pedido2.getFrete().getValor());

        System.out.println("-----");

        processadorPedidoSedex.processar(pedido3);
        System.out.printf("%s - %.2f\n", pedido3.getFrete().getTipoProvedorFrete(), pedido3.getFrete().getValor());

        processadorPedidoJadLog.processar(pedido3);
        System.out.printf("%s - %.2f\n", pedido3.getFrete().getTipoProvedorFrete(), pedido3.getFrete().getValor());

        processadorPedidoLoggi.processar(pedido3);
        System.out.printf("%s - %.2f\n", pedido3.getFrete().getTipoProvedorFrete(), pedido3.getFrete().getValor());

        System.out.println("-----");

        processadorPedidoSedex.processar(pedido4);
        System.out.printf("%s - %.2f\n", pedido4.getFrete().getTipoProvedorFrete(), pedido4.getFrete().getValor());

        processadorPedidoJadLog.processar(pedido4);
        System.out.printf("%s - %.2f\n", pedido4.getFrete().getTipoProvedorFrete(), pedido4.getFrete().getValor());

        processadorPedidoLoggi.processar(pedido4);
        System.out.printf("%s - %.2f\n", pedido4.getFrete().getTipoProvedorFrete(), pedido4.getFrete().getValor());
    }
}