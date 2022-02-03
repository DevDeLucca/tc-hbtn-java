import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro {


    public LivroEdicaoOuro(String titulo, String autor, double preco)
            throws LivroInvalidoException, AutorInvalidoException {
        super(titulo, autor, preco);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getPreco() {
        return super.getPreco() * 1.3;
    }
}
