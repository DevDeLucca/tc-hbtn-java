public interface Armazenavel <T> {
    public void adicionarAoInventario(String nome, t valor);
    public T obterDoInventario(String nome);


}