public class Numero {

    public static void dividir(int a, int b) {
        int calculo = 0;
        try {
            calculo = (a/b);
        } catch (ArithmeticException ex) {
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.println(a + " / " +b + " = " + calculo);
        }
    }

}