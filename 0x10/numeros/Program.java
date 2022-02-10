import java.util.*;

public class Program {
    //classe prgram
    public static void main(String[] args) {
        //metodo statico de arrays
        List<Integer> numeros = new ArrayList<Integer>();

        ManipularArrayNumeros.adicionarNumero(numeros, 1);
        ManipularArrayNumeros.adicionarNumero(numeros, 3);
        ManipularArrayNumeros.adicionarNumero(numeros, 6);
        ManipularArrayNumeros.adicionarNumero(numeros, 9);

        System.out.println(numeros);
//try catch lança esseções para serem tratadas.
        try {
            ManipularArrayNumeros.adicionarNumero(numeros, 9);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        ManipularArrayNumeros.removerNumero(numeros, 3);
        ManipularArrayNumeros.removerNumero(numeros, 9);

        System.out.println(numeros);

        try {
            ManipularArrayNumeros.removerNumero(numeros, 9);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        ManipularArrayNumeros.substituirNumero(numeros, 3, 5);

        System.out.println(numeros);

        ManipularArrayNumeros.substituirNumero(numeros, 5, 3);

        System.out.println(numeros);
    }
}
