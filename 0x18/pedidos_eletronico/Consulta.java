import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Consulta {
	
	public static List<Produto> obterLivrosDoPedido(Pedido pedido) {

		List<Produto> produtosPedidos = new ArrayList<Produto>(pedido.getProdutos());

		List<Produto> filter = produtosPedidos.stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO))
				.collect(Collectors.toList());

		return filter;

	}


	public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {

		return produtos.stream()
				.max(Comparator.comparing(Produto::getPreco)).get();
	}

	public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {

		List<Produto> produtoMenorPreco = produtos.stream()
				.filter(p -> p.getPreco() >= precoMinimo)
				.collect(Collectors.toList());
		
		return produtoMenorPreco;
	}


	public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
		return pedidos.stream()
				.filter(pd -> pd.getProdutos().stream()
				.anyMatch(p -> p.getCategoria().equals(CategoriaProduto.ELETRONICO)))
				.collect(Collectors.toList());

	}
	
	
	
	
	
}
