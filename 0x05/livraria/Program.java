import java.util.Locale;
public class Program {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));
        try {
            Livro livro1 = new Livro(
                    "As barbas do imperador: D. Pedro II",
                    "Lilia Moritz Schwarcz",
                    56);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livro1.getTitulo(),
                    livro1.getAutor(),
                    livro1.getPreco());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            LivroEdicaoOuro livroEdicaoOuro1 = new LivroEdicaoOuro(
                    "Xato",
                    "Fernando Morais",
                    38.30);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livroEdicaoOuro1.getTitulo(),
                    livroEdicaoOuro1.getAutor(),
                    livroEdicaoOuro1.getPreco());

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            LivroEdicaoOuro livroEdicaoOuro2 = new LivroEdicaoOuro(
                    "Ladrao de Raios",
                    "Rick",
                    21.88);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livroEdicaoOuro2.getTitulo(),
                    livroEdicaoOuro2.getAutor(),
                    livroEdicaoOuro2.getPreco());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            Livro livro2 = new Livro(
                    "ab",
                    "Jane Doe",
                    15.99);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livro2.getTitulo(),
                    livro2.getAutor(),
                    livro2.getPreco());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            Livro livro3 = new Livro(
                    "Harry Potter e o enigma do principe",
                    "J.K. Rowling",
                    0);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livro3.getTitulo(),
                    livro3.getAutor(),
                    livro3.getPreco());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }
    }
}
