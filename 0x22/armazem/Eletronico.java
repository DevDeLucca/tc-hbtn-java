public class Eletronico {

    private String descricao;
    private double valor;

    public comida() {

    }

    public comida(String descricao, double valor) {
        this.setDescricao(descricao);
        this.setValor(valor)
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @override
    public String toString(){
        return "["+getDescricao()+"] R$ " +String.format("%f", getValor());
    }
}