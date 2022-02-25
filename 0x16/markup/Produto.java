import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

	private String nome;
	private Double preco;
	private Double percentualMarkUp = 0.1;
	
	public Produto() {
		
	}
	
	
	public Produto(Double preco, String nome) {
		super();
		this.nome = nome;
		this.preco = preco;
		
	}

	Supplier<Double> precoComMarkUp = () -> preco*(1+percentualMarkUp); 
	Consumer<Double> atualizarMarkUp = valor ->  this.percentualMarkUp =(valor/100);
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public Double getPercentualMarkUp() {
		return percentualMarkUp;
	}


	public void setPercentualMarkUp(Double percentualMarkUp) {
		this.percentualMarkUp = percentualMarkUp;
	}
	
}
