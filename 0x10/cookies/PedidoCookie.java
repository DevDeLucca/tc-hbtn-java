public class PedidoCookie {

    private String sabor;
    private int quantidadeCaixas;

    public PedidoCookie() {

    }

    public PedidoCookie(String sabor, int quantidadeCaixas) {

        this.sabor = sabor;
        this.quantidadeCaixas = quantidadeCaixas;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidadeCaixas() {
        return quantidadeCaixas;
    }

    public void setQuantidadeCaixas(int quantidadeCaixas) {
        this.quantidadeCaixas = quantidadeCaixas;
    }


}