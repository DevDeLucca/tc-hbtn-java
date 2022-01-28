import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        String val = nf.format(valor);
        System.out.print("Valor: R$ "+val.substring(0,8)+"\n");
        System.out.printf("Taxa: %.2f%s", taxa, "%\n");
    }
}