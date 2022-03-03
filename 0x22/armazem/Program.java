import java.util.*;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));
		Comida comida1 = new Comida("arroz", 100, 15.9);
		Comida comida2 = new Comida("feijao", 80, 23.0);
		Comida comida3 = new Comida("pacoca", 165, 7.5);

		Eletronico eletronico1 = new Eletronico("Smart TV LED 32 HD LG", 1452.55);
		Eletronico eletronico2 = new Eletronico("Nintendo Switch", 2990);

		Armazem<Eletronico> armazem1 = new Armazem<>();
		armazem1.adicionarAoInventario("TV LG", eletronico1);
		armazem1.adicionarAoInventario("Switch", eletronico2);

		Eletronico eletronicoBuscado1 = armazem1.obterDoInventario("Switch");

		System.out.println(eletronicoBuscado1);

		Armazem<Comida> armazem2 = new Armazem<>();
		armazem2.adicionarAoInventario("feijao", comida2);
		armazem2.adicionarAoInventario("pacoca", comida3);

		Comida comidaBuscada1 = armazem2.obterDoInventario("feijao");

		System.out.println(comidaBuscada1);
	}
}
