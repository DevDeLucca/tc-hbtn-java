import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Program {
    public static void main(String[] args) {

        try {
            if (Modifier.isAbstract(FormaGeometrica.class.getDeclaredMethod("area").getModifiers()))
                System.out.println("area() eh uma funcao abstrata");
            else
                System.out.println("area() nao eh uma funcao abstrata");
        } catch (Exception ex) {
            System.out.println("area() nao eh uma funcao");
        }

        if (Modifier.isAbstract(FormaGeometrica.class.getModifiers()))
            System.out.println("FormaGeometrica eh uma classe abstrata");
        else
            System.out.println("FormaGeometrica nao eh uma classe abstrata");
    }
}