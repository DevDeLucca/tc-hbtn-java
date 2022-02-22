import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {

        List<Integer> duplicados = new ArrayList<>();
        for (int i = 0; i < numeros.length; i++) {
            duplicados.add(numeros[i]);
        }
        Set<Integer> duplicatedNumbersRemovedSet = new HashSet<>();
        Set<Integer> duplicatedNumbersSet = duplicados.stream().filter(n -> !duplicatedNumbersRemovedSet.add(n))
                .collect(Collectors.toSet());

        TreeSet<Integer> setDuplicados = new TreeSet<Integer>();

        for (Integer numeroLista : duplicatedNumbersSet) {
            setDuplicados.add(numeroLista);
        }
        return setDuplicados;
    }
}