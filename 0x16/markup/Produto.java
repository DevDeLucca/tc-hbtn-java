public class Produto {

    public static void main (String [] args) {

        private String nome;
        private double preco;
        private double percentualMarkUp = 0.1;

        public Produto () {

        }

        public Produto(double preco, String nome) {
            super();
            this.preco = preco;
            this.nome = nome;
        }

        Supplier<double> precoComMarkUp = () -> preco*(1-percentualMarkUp);
        Consumer<double> atualizarMarkUp = valor ->  this.percentualMarkUp =(valor/100);

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
}