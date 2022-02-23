Program.java
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Blog blog1 = new Blog();

        Post post1 = new Post("John Bannons",
                "Como implementar Terraform",
                "Implementando IaC com Terraform bla bla bla",
                "DevOps");

        Post post2 = new Post("John Bannons",
                "Trabalhando com a interface Set em Java",
                "A interface Set é implementada por várias coleções em Java bla bla bla",
                "Desenvolvimento");

        Post post3 = new Post("Jane Doe",
                "Publicando pipelines GitLab",
                "Para publicar pipelines no GitLab bla bla bla",
                "DevOps");

        Post post4 = new Post("Jane Doe",
                "Azure Service Bus por onde começar",
                "Primeiramente, é necessário entender que bla bla bla",
                "DevOps");

        Post post5 = new Post("Jane Doe",
                "TDD de forma simples",
                "O processo de desenvolvimento de software TDD bla bla bla",
                "Desenvolvimento");

        blog1.adicionarPostagem(post1);
        blog1.adicionarPostagem(post2);
        blog1.adicionarPostagem(post3);
        blog1.adicionarPostagem(post4);
        blog1.adicionarPostagem(post5);

        Set<String> autores = blog1.obterTodosAutores();

        System.out.println(autores);

        Map<String, Integer> contagem = blog1.obterContagemPorCategoria();

        System.out.println(contagem);
    }
}