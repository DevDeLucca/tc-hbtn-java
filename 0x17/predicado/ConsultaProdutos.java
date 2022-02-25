import java.util.stream.Collectors;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar (List<Produto> produtos, CriterioFiltro criterioFiltro){
        return produtos.stream().filter(p -> criterioFiltro.testar(p)).collect(Collectors.toList());
    }
}