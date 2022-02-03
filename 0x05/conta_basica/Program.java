import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        try {
            ContaBancariaBasica conta1 = new ContaBancariaBasica("AAA", 50.0);
            System.out.printf("Conta %s - saldo: %.2f\n", conta1.getNumeracao(), conta1.getSaldo());
            conta1.depositar(100);
            System.out.printf("Conta %s - saldo: %.2f\n", conta1.getNumeracao(), conta1.getSaldo());
            conta1.sacar(25);
            System.out.printf("Conta %s - saldo: %.2f\n", conta1.getNumeracao(), conta1.getSaldo());
            conta1.aplicarAtualizacaoMensal();
            System.out.printf("Conta %s - saldo: %.2f\n\n", conta1.getNumeracao(), conta1.getSaldo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaBasica conta2 = new ContaBancariaBasica("BBB", 100.0);
            System.out.printf("Conta %s - saldo: %.2f\n", conta2.getNumeracao(), conta2.getSaldo());
            conta2.depositar(10);
            System.out.printf("Conta %s - saldo: %.2f\n", conta2.getNumeracao(), conta2.getSaldo());
            conta2.sacar(10);
            System.out.printf("Conta %s - saldo: %.2f\n", conta2.getNumeracao(), conta2.getSaldo());
            conta2.aplicarAtualizacaoMensal();
            System.out.printf("Conta %s - saldo: %.2f\n\n", conta2.getNumeracao(), conta2.getSaldo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaBasica conta3 = new ContaBancariaBasica("CCC", 120.0);
            System.out.printf("Conta %s - saldo: %.2f\n", conta3.getNumeracao(), conta3.getSaldo());
            conta3.depositar(1600);
            System.out.printf("Conta %s - saldo: %.2f\n", conta3.getNumeracao(), conta3.getSaldo());
            conta3.aplicarAtualizacaoMensal();
            System.out.printf("Conta %s - saldo: %.2f\n\n", conta3.getNumeracao(), conta3.getSaldo());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaBasica conta4 = new ContaBancariaBasica("DDD", 70.0);
            System.out.printf("Conta %s - saldo: %.2f\n", conta4.getNumeracao(), conta4.getSaldo());
            conta4.depositar(0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            ContaBancariaBasica conta5 = new ContaBancariaBasica("EEE", 50.0);
            System.out.printf("Conta %s - saldo: %.2f\n", conta5.getNumeracao(), conta5.getSaldo());
            conta5.depositar(25);
            System.out.printf("Conta %s - saldo: %.2f\n", conta5.getNumeracao(), conta5.getSaldo());
            conta5.sacar(30);
        } catch (Exception ex) {
            System.out.printf(ex.getMessage() + "\n");
        }
    }
}
