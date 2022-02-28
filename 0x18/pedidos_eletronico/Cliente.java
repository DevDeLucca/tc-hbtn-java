public class Cliente {

	private int codigo;
	private String nome;
	private boolean premium;
	
	public Cliente() {
		
	}

	public Cliente(int codigo, String nome, boolean premium) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.premium = premium;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	
	
}
