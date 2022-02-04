public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;
    private double total, total2;
    private String tipo;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        super();
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        for (ItemPedido itemPedido : itens) {
            total += (itemPedido.getProduto().obterPrecoLiquido(itemPedido.getProduto().getPrecoBruto())*itemPedido.getQuantidade());
        }

        return total - (total * percentualDesconto / 100 );
    }

    public void apresentarResumoPedido() {

        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido itemPedido : itens) {
            total2 += (itemPedido.getProduto().obterPrecoLiquido(itemPedido.getProduto().getPrecoBruto())* itemPedido.getQuantidade());

            tipo = itemPedido.getProduto().getClass().getName();
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",tipo.replace("produtos.", "")
                    ,itemPedido.getProduto().getTitulo()
                    ,itemPedido.getProduto().obterPrecoLiquido(itemPedido.getProduto().getPrecoBruto())
                    ,itemPedido.getQuantidade()
                    ,itemPedido.getProduto().obterPrecoLiquido(itemPedido.getProduto().getPrecoBruto())* itemPedido.getQuantidade());
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", (total2 * percentualDesconto / 100));
        System.out.printf("TOTAL PRODUTOS: %.2f\n", total2);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }
}