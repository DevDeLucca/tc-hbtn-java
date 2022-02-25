public class FolhaPagamento{
	
	public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculadora) {
		return calculadora.calcular(funcionario.getSalario());
	}

}
