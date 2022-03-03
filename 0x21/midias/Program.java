import java.util.*;
public class Program {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Xato", 1);
        Livro livro2 = new Livro("Coracoes sujos", 3);
        Livro livro3 = new Livro("Harry Potter e a Pedra Filosofal", 1);

        Video video1 = new Video("Aprendendo Java Generics", 25);
        Video video2 = new Video("Apresentando Wildcards Generics em Java", 25);

        Jornal jornal1 = new Jornal("Folha de Sao Paulo", 130);
        Jornal jornal2 = new Jornal("Estadao", 113);

        Biblioteca<Livro> bibliotecaLivros = new Biblioteca<>();
        bibliotecaLivros.adicionarMidia(livro1);
        bibliotecaLivros.adicionarMidia(livro2);
        bibliotecaLivros.adicionarMidia(livro3);

        System.out.println(bibliotecaLivros.obterListaMidias());

        Biblioteca<Midia> bibliotecaMidias = new Biblioteca<>();
        bibliotecaMidias.adicionarMidia(livro1);
        bibliotecaMidias.adicionarMidia(video1);
        bibliotecaMidias.adicionarMidia(video2);
        bibliotecaMidias.adicionarMidia(jornal2);

        System.out.println(bibliotecaMidias.obterListaMidias());
    }
}