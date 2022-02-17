public class Pedido {

    private int codigo;
    private double peso;
    private double total;
    private Frete frete;


    public Pedido() {

    }

    public Pedido(int codigo, double peso, double total) {
        super();
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;


    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public Frete getFrete() {
        return frete;
    }
    public void setFrete(Frete frete) {
        this.frete = frete;
    }







}