public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;
    private double total;


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
