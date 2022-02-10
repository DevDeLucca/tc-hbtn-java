public class Program {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarPedidoCookie(new PedidoCookie("Chocolate", 10));
        pedido.adicionarPedidoCookie(new PedidoCookie("Nutella", 3));
        pedido.adicionarPedidoCookie(new PedidoCookie("Baunilha", 2));
//adicionado o pedido

        System.out.println(String.format("Total: %d", pedido.obterTotalCaixas()));

        pedido.adicionarPedidoCookie(new PedidoCookie("Chocolate", 1));
        pedido.adicionarPedidoCookie(new PedidoCookie("Nutella", 1));


        System.out.println(String.format("Total: %d", pedido.obterTotalCaixas()));

        int quantidadeRemovidos = pedido.removerSabor("Nutella");

        System.out.println(String.format("Total: %d - Removidos: %d", pedido.obterTotalCaixas(), quantidadeRemovidos));

        quantidadeRemovidos = pedido.removerSabor("Chocolate");

        System.out.println(String.format("Total: %d - Removidos: %d", pedido.obterTotalCaixas(), quantidadeRemovidos));

        quantidadeRemovidos = pedido.removerSabor("Baunilha");

        System.out.println(String.format("Total: %d - Removidos: %d", pedido.obterTotalCaixas(), quantidadeRemovidos));

        quantidadeRemovidos = pedido.removerSabor("Chocolate");

        System.out.println(String.format("Total: %d - Removidos: %d", pedido.obterTotalCaixas(), quantidadeRemovidos));

        pedido.adicionarPedidoCookie(new PedidoCookie("Nutella", 5));

        System.out.println(String.format("Total: %d", pedido.obterTotalCaixas()));
    }
}
