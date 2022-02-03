import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        Departamento departamentoEngenharia = new Departamento(1000, 1100);
        Departamento departamentoDocumentacao = new Departamento(1000, 800);

        Empregado empregadoEngenharia1 = new Empregado(2300);
        Empregado empregadoEngenharia2 = new Empregado(3650);
        Gerente gerenteEngenharia = new Gerente(5800);

        Empregado empregadoDocumentacao1 = new Empregado(2500);
        Empregado empregadoDocumentacao2 = new Empregado(3000);
        Gerente gerenteDocumentacao = new Gerente(4980);

        System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
                empregadoEngenharia1.getSalarioFixo(),
                empregadoEngenharia1.calcularSalarioTotal(departamentoEngenharia),
                empregadoEngenharia1.calcularBonus(departamentoEngenharia));

        System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
                empregadoEngenharia2.getSalarioFixo(),
                empregadoEngenharia2.calcularSalarioTotal(departamentoEngenharia),
                empregadoEngenharia2.calcularBonus(departamentoEngenharia));

        System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
                gerenteEngenharia.getSalarioFixo(),
                gerenteEngenharia.calcularSalarioTotal(departamentoEngenharia),
                gerenteEngenharia.calcularBonus(departamentoEngenharia));

        System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
                empregadoDocumentacao1.getSalarioFixo(),
                empregadoDocumentacao1.calcularSalarioTotal(departamentoDocumentacao),
                empregadoDocumentacao1.calcularBonus(departamentoDocumentacao));

        System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
                empregadoDocumentacao2.getSalarioFixo(),
                empregadoDocumentacao2.calcularSalarioTotal(departamentoDocumentacao),
                empregadoDocumentacao2.calcularBonus(departamentoDocumentacao));

        System.out.printf("Salario Fixo: %.2f - Salario Total: %.2f - Valor Bonus: %.2f\n",
                gerenteDocumentacao.getSalarioFixo(),
                gerenteDocumentacao.calcularSalarioTotal(departamentoDocumentacao),
                gerenteDocumentacao.calcularBonus(departamentoDocumentacao));
    }
}
