Program.java
    import java.util.*;

    public class Program {
        public static void main(String[] args) {
            Blog blog1 = new Blog();

            Autor autor1 = new Autor("John", "Bannons");
            Autor autor2 = new Autor("Jane", "Doe");
            Autor autor3 = new Autor("Peter", "Dirkly");

            Post post1 = new Post(autor1, 
                "Como implementar Terraform",
                "Implementando IaC com Terraform bla bla bla",
                Categorias.DEVOPS);

            Post post2 = new Post(autor1, 
                "Trabalhando com a interface Set em Java",
                "A interface Set eh implementada por varias colecoes em Java bla bla bla",
                Categorias.DESENVOLVIMENTO);            

            Post post3 = new Post(autor2, 
                "Publicando pipelines GitLab",
                "Para publicar pipelines no GitLab bla bla bla",
                Categorias.DEVOPS);            

            Post post4 = new Post(autor2, 
                "Azure Service Bus por onde comecar",
                "Primeiramente, eh necessario entender que bla bla bla",
                Categorias.DEVOPS);

            Post post5 = new Post(autor2, 
                "TDD de forma simples",
                "O processo de desenvolvimento de software TDD bla bla bla",
                Categorias.DESENVOLVIMENTO);       

            Post post6 = new Post(autor3,
                "Hadoop: A ferramenta que vai facilitar seu processamento de dados",
                "Hadoop eh uma ferramente bla bla bla",
                Categorias.DATA_SCIENCE);

            Post post7 = new Post(autor3,
                "Hadoop: A ferramenta que vai facilitar seu processamento de dados",
                "A ferramenta Hadoop bla bla bla",
                Categorias.DATA_SCIENCE);

            blog1.adicionarPostagem(post1);
            blog1.adicionarPostagem(post2);
            blog1.adicionarPostagem(post3);
            blog1.adicionarPostagem(post4);
            blog1.adicionarPostagem(post5);
            blog1.adicionarPostagem(post6);

            try {
                blog1.adicionarPostagem(post7);
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }

            Set<Autor> autores = blog1.obterTodosAutores();

            System.out.println(autores);

            Map<Categorias, Integer> contagem = blog1.obterContagemPorCategoria();

            System.out.println(contagem);

            Set<Post> postsDevOps = blog1.obterPostsPorCategoria(Categorias.DEVOPS);

            System.out.println(postsDevOps);

            Set<Post> postsDev = blog1.obterPostsPorCategoria(Categorias.DESENVOLVIMENTO);

            System.out.println(postsDev); 

            Set<Post> postsData = blog1.obterPostsPorCategoria(Categorias.DATA_SCIENCE);

            System.out.println(postsData); 

            Set<Post> postsJaneDoe = blog1.obterPostsPorAutor(new Autor("Jane", "Doe"));

            System.out.println(postsJaneDoe);      

            Map<Categorias, Set<Post>> postsPorCategoria = blog1.obterTodosPostsPorCategorias();

            System.out.println(postsPorCategoria);

            Map<Autor, Set<Post>> postsPorAutor = blog1.obterTodosPostsPorAutor();

            System.out.println(postsPorAutor);        
        }
    }
