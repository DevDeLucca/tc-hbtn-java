public class Program {
    public static void main(String[] args) {
        boolean caractereEhMaiusculo1 = Caractere.EhMaiusculo('a');
        boolean caractereEhMaiusculo2 = Caractere.EhMaiusculo('B');
        boolean caractereEhMaiusculo3 = Caractere.EhMaiusculo('d');
        boolean caractereEhMaiusculo4 = Caractere.EhMaiusculo('f');
        boolean caractereEhMaiusculo5 = Caractere.EhMaiusculo('G');

        System.out.printf("%b\n", caractereEhMaiusculo1);
        System.out.printf("%b\n", caractereEhMaiusculo2);
        System.out.printf("%b\n", caractereEhMaiusculo3);
        System.out.printf("%b\n", caractereEhMaiusculo4);
        System.out.printf("%b\n", caractereEhMaiusculo5);
    }
}
