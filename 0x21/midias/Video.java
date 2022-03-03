public class Video  extends Midia{

    private int duracao;

    public Video(){

    }

    public Video(String nome, int duracao){
        setNome(nome);
        this.setDuracao(duracao);

    }


    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }



}