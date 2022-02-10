import java.util.List;
//classe que manipula arrays
public class ManipularArrayNumeros {
//metodo statico que gera um array
    public static int buscarPosicaoNumero(List<Integer> listaDeNumeros, int numeroBuscado) {
// Permite localizar a primeira ocorrência de uma sequência de caracteres no array
        return listaDeNumeros.indexOf(numeroBuscado);

    }
    //metodo statico que gera um array
    public static void adicionarNumero(List<Integer> listaDeNumeros, int numeroAdicionado) {
//destacando o tipo de valor retorno
        int retorno = buscarPosicaoNumero(listaDeNumeros, numeroAdicionado);
//condicional if retorno maior que 0
        if (retorno > 0) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
//lança esseções tratadas
        listaDeNumeros.add(numeroAdicionado);
    }

    public static void removerNumero(List<Integer> listaDeNumeros, int numeroRemovido) {

        int retorno = buscarPosicaoNumero(listaDeNumeros, numeroRemovido);

        if (retorno < 0) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }

        listaDeNumeros.remove(retorno);
    }


    public static void substituirNumero(List<Integer> listaDeNumeros, int numeroSubstituir, int numeroSubstituto) {
        int retorno = buscarPosicaoNumero(listaDeNumeros, numeroSubstituir);

        if (retorno < 0) {
            listaDeNumeros.add(numeroSubstituto);
        } else {
            listaDeNumeros.set(retorno,numeroSubstituto);
        }
    }
}