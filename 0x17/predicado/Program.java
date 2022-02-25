import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.function.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Produto produto1 = new Produto("Cafe Chocolate Trufado Baggio",
                21.99, 250, 120, TiposProduto.COZINHA);

        Produto produto2 = new Produto("Leite Condensado Moca",
                6.29, 395, 200, TiposProduto.COZINHA);

        Produto produto3 = new Produto("Carro Vortex",
                799.90, 1560, 5, TiposProduto.BRINQUEDO);

        Produto produto4 = new Produto("Smart TV LED 32 HD LG",
                1452.55, 6300, 7, TiposProduto.ELETRONICO);

        Produto produto5 = new Produto("Nintendo Switch",
                2990.00, 1700, 12, TiposProduto.ELETRONICO);

        List<Produto> produtos = Arrays.asList(
                produto1, produto2, produto3, produto4, produto5);

        List<Produto> produtosPrecoMaiorQue100 = ConsultaProdutos.filtrar(produtos,
                p -> p.getPreco() > 100);

        List<Produto> produtosPesoMenorOuIgual1600 = ConsultaProdutos.filtrar(produtos,
                p -> p.getPeso() <= 1600);

        List<Produto> produtosCozinha = ConsultaProdutos.filtrar(produtos,
                p -> p.getTipo() == TiposProduto.COZINHA);

        List<Produto> produtosBaixoEstoque = ConsultaProdutos.filtrar(produtos,
                p -> p.getQuantidadeEmEstoque() <= 10);

        try
        {
            Method method = ConsultaProdutos.class.getMethod("filtrar", List.class, Predicate.class);
            if (method != null) {
                System.out.println("Metodo encontrado");
            }
        } catch(NoSuchMethodException ex) {
            System.out.println("Metodo nao encontrado");
        }

        System.out.println(produtosPrecoMaiorQue100);
        System.out.println(produtosPesoMenorOuIgual1600);
        System.out.println(produtosCozinha);
        System.out.println(produtosBaixoEstoque);
    }
}