public class Livro extends Midia {

    private int edicao;

    public Livro() {

    }

    public Livro(String nome, int edicao) {
        setNome(nome);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }



}