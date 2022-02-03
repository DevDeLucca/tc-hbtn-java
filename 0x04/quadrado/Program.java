import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Program {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        quadrado.setLado(10);

        if (Retangulo.class.isAssignableFrom(Quadrado.class))
            System.out.println("Quadrado eh uma subclasse de Retangulo");
        else
            System.out.println("Quadrado nao eh uma subclasse de Retangulo");

        try {
            Field campoAltura = Retangulo.class.getDeclaredField("altura");
            int modifierAltura = campoAltura.getModifiers();
            System.out.printf("Campo altura eh %s\n", Modifier.toString(modifierAltura));

            Field campoLargura = Retangulo.class.getDeclaredField("altura");
            int modifierLargura = campoLargura.getModifiers();
            System.out.printf("Campo largura eh %s\n", Modifier.toString(modifierLargura));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.printf("Lado: %.2f\n", quadrado.getLado());
        System.out.printf("Area: %.2f\n", quadrado.area());
        System.out.printf(quadrado.toString() + "\n");

    }
}