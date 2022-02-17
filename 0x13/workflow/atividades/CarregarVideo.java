package atividades;
public class CarregarVideo implements Atividade {

    public CarregarVideo() {
        executar();
    }

    @Override
    public void executar() {
        System.out.println("carregando video");
    }


}