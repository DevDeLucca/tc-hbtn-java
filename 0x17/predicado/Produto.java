public class Produto {

    private String nome;
    private double preco;
    private double peso;
    private int quantidadeEmEstoque;

    private TiposProduto tipo;

    public Produto () {

        public produto(String getNome(), double preco, double peso, int quantidadeEmEstoque, TiposProduto getTipo()) {
            super();
            this.setNome(getNome());
            this.setPreco(preco);
            this.setPeso(peso);
            this.setQuantidadeEmEstoque(quantidadeEmEstoque);
            this.setTipo(getTipo());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public TiposProduto getTipo() {
        return tipo;
    }

    public void setTipo(TiposProduto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return String.format("%s %f %f %d %s", getNome(), getPreco(), getPeso(), getQuantidadeEmEstoque(), getTipo());
    }
}