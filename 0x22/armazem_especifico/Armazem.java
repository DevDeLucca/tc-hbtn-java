import java.util.Map;
import java.util.TreeMap;

public abstract class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> mapa = new TreeMap<>();


    @Override
    public void adicionarAoInventario(String nome, T valor) {
        mapa.put(nome, valor);

    }

    @Override
    public T obterDoInventario(String nome) {


        return mapa.get(nome);
    }

}