public class FolhaPagamento {

    private static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculadora) {
        return calculadora.calcular(funcionario.getSalario());
    }
}