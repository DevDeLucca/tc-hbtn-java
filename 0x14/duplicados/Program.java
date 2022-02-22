import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        TreeSet<Integer> duplicados1 = NumerosDuplicados.buscar(new int[] {1, 2, 3, 1, 3, 2, 5, 8, 9, 6, 7, 6, 1, 2});
        TreeSet<Integer> duplicados2 = NumerosDuplicados.buscar(new int[] {6, 17, 19, 11, 4, 18, 5, 20, 22, 5, 1, 19, 25, 14, 7, 8, 18, 16, 1, 12, 4, 18, 15, 27, 2, 24, 6, 23, 3, 2});
        TreeSet<Integer> duplicados3 = NumerosDuplicados.buscar(new int[] {9, 15, 6, 11, 1, 14, 16, 9, 5, 4, 16, 13, 9, 17, 5, 7, 16, 3, 7, 15});
        TreeSet<Integer> duplicados4 = NumerosDuplicados.buscar(new int[] {2, 2, 18, 16, 4, 22, 23, 18, 5, 13, 21, 7, 9, 12, 2, 17, 14, 12, 14, 20, 10, 20, 13, 18, 23, 21, 19, 8, 11, 13});
        System.out.println(duplicados1);
        System.out.println(duplicados2);
        System.out.println(duplicados3);
        System.out.println(duplicados4);
    }
}
