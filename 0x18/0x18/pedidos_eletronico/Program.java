import java.util.List;

public class Program {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1,
                "Carro Vortex", CategoriaProduto.BRINQUEDO, 799.90);

        Produto produto2 = new Produto(2,
                "Smart TV LED 32 HD LG", CategoriaProduto.ELETRONICO, 1452.55);

        Produto produto3 = new Produto(3,
                "Nintendo Switch", CategoriaProduto.ELETRONICO, 2990.00);

        Produto produto4 = new Produto(4,
                "Ladrao de Raios", CategoriaProduto.LIVRO, 21.88);

        Produto produto5 = new Produto(5,
                "Xato", CategoriaProduto.LIVRO, 38.30);

        Produto produto6 = new Produto(6,
                "Coracoes sujos", CategoriaProduto.LIVRO, 27.50);

        Cliente cliente1 = new Cliente(1, "Jane Doe", false);
        Cliente cliente2 = new Cliente(2, "John Bannins", true);
        Cliente cliente3 = new Cliente(3, "Jackson Percy", false);

        Pedido pedido1 = new Pedido(1, List.of(produto4, produto3, produto6), cliente1);
        Pedido pedido2 = new Pedido(2, List.of(produto1, produto6, produto2), cliente2);
        Pedido pedido3 = new Pedido(3, List.of(produto4, produto6, produto5), cliente3);
        Pedido pedido4 = new Pedido(4, List.of(produto6, produto1, produto5), cliente3);

        List<Pedido> pedidosEletronicos1 = Consulta.obterPedidosComEletronicos(
                List.of(pedido1, pedido2, pedido3));
        List<Pedido> pedidosEletronicos2 = Consulta.obterPedidosComEletronicos(
                List.of(pedido2, pedido3));
        List<Pedido> pedidosEletronicos3 = Consulta.obterPedidosComEletronicos(
                List.of(pedido3));
        List<Pedido> pedidosEletronicos4 = Consulta.obterPedidosComEletronicos(
                List.of(pedido3));

        System.out.println(pedidosEletronicos1);
        System.out.println(pedidosEletronicos2);
        System.out.println(pedidosEletronicos3);
        System.out.println(pedidosEletronicos4);
    }
}