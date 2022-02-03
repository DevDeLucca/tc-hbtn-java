package exceptions;

public class LivroInvalidoException extends Exception {

    private static final long serialVersionUID = 1L;

    public LivroInvalidoException(String msg) {
        super(msg);
    }
}