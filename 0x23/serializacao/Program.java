import java.util.List;

public class Program {
	public static void main(String[] args) {

		Estudante estudante1 = new Estudante(21, "Jane Doe", "1011121314");
		Estudante estudante2 = new Estudante(33, "John Bannons", "1122334455");
		Estudante estudante3 = new Estudante(27, "Alyssa White", "minha_senha_100");
		Estudante estudante4 = new Estudante(35, "Maike Eed", "Maike@eed100");
		Estudante estudante5 = new Estudante(19, "Peter Diemon", "123");

		List<Estudante> estudantes = List.of(estudante1, estudante2, estudante3, estudante4, estudante5);

		SerializarEstudantes<Estudante> serializarEstudantes1 = new SerializarEstudantes<Estudante>("estudantes.data");
		serializarEstudantes1.serializar(estudantes);

		List<Estudante> listaDesserializacao1 = serializarEstudantes1.desserializar();

		for (Estudante e : listaDesserializacao1) {
			System.out.println(e);
		}

		SerializarEstudantes<Estudante> serializarEstudantes2 = new SerializarEstudantes<Estudante>("estudantes1.data");
		List<Estudante> listaDesserializacao2 = serializarEstudantes2.desserializar();
	}

}
