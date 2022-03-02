import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> todasPessoas) {

        return todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo));

    }

    public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> todasPessoas) {

        return todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        Collectors.mapping(Pessoa::getIdade, Collectors.toList())));
    }

    public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> todasPessoas) {

        return todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        Collectors.filtering(p -> p.getIdade()  > 40, Collectors.toList())));
    }

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(
            List<Pessoa> todasPessoas) {

        return todasPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toCollection(TreeSet::new)));
    }

}