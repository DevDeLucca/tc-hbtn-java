public class Armazem  implements Armazenavel {

    public class Armazem<T> implements armazenavel<T>();


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