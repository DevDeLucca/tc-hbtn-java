public class Empregado {

	private String nome;
	private int codigo;
	private Endereco endereco;

	public Empregado(String nome, int codigo, Endereco endereco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.endereco = endereco;
	}

	public void apresentar() {
		System.out.println("Codigo: "+ codigo);
		System.out.println("Nome: "+ nome);
		System.out.println("Bairro: "+ endereco.getBairro());
		System.out.println("Cidade: "+ endereco.getCidade());
		System.out.println("Pais: "+ endereco.getPais());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}