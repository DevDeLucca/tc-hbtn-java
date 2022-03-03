public interface Armazenavel<T> {
	public void adicionarAoInventario(String nome,T valor);
	public T obterDoInventario(String nome);
	

}
