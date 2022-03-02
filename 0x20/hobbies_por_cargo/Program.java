import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Pessoa pessoa1 = new Pessoa(1, "John Bannins", "Desenvolvedor", 23, 3200,
                List.of("ouvir musica", "assistir futebol", "assistir series", "balada"));
        Pessoa pessoa2 = new Pessoa(2, "Derry Collier", "Desenvolvedor", 45, 8600,
                List.of("assistir futebol", "assistir filmes"));
        Pessoa pessoa3 = new Pessoa(3, "Mikey Berg", "Product Owner", 51, 11350,
                List.of("ouvir musica", "jogar futebol", "assistir series"));
        Pessoa pessoa4 = new Pessoa(4, "Diana Hayes", "Product Owner", 33, 7400,
                List.of("jogar futebol", "assistir filmes", "balada"));
        Pessoa pessoa5 = new Pessoa(5, "Ellen Costa", "Product Owner", 51, 12500,
                List.of("ouvir musica", "assistir futebol", "assistir filmes"));
        Pessoa pessoa6 = new Pessoa(6, "Jane Doe", "Analista QA", 42, 5200,
                List.of("assistir futebol", "assistir filmes"));
        Pessoa pessoa7 = new Pessoa(7, "Haseeb Roche", "Analista QA", 21, 3200, List.of("assistir series", "balada"));
        Pessoa pessoa8 = new Pessoa(8, "Jadene Everett", "Analista QA", 39, 4860, List.of("assistir series"));
        Pessoa pessoa9 = new Pessoa(9, "Andrei Melendez", "Analista QA", 42, 5330,
                List.of("ouvir musica", "assistir series", "balada"));
        Pessoa pessoa10 = new Pessoa(10, "Branden Irwin", "Analista QA", 21, 2800,
                List.of("jogar futebol", "assistir series", "balada"));

        List<Pessoa> todasPessoas = List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7, pessoa8,
                pessoa9, pessoa10);

        Map<String, TreeSet<String>> pessoas1 = ConsultaPessoas.obterHobbiesPorCargo(todasPessoas);
        Map<String, TreeSet<String>> pessoas2 = ConsultaPessoas
                .obterHobbiesPorCargo(List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa9, pessoa10));
        Map<String, TreeSet<String>> pessoas3 = ConsultaPessoas
                .obterHobbiesPorCargo(List.of(pessoa1, pessoa3, pessoa4, pessoa5, pessoa9));

        System.out.println(pessoas1);
        System.out.println();
        System.out.println(pessoas2);
        System.out.println();
        System.out.println(pessoas3);
    }
}