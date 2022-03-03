public class Jornal extends Midia{

	private int quantidadeArtigos;
	
	public Jornal() {
		
	}
	
	public Jornal(String nome, int quantidadeArtigos) {
		setNome(nome);
		this.quantidadeArtigos = quantidadeArtigos;
	}

	public int getQuantidadeArtigos() {
		return quantidadeArtigos;
	}

	public void setQuantidadeArtigos(int quantidadeArtigos) {
		this.quantidadeArtigos = quantidadeArtigos;
	}
	
}
