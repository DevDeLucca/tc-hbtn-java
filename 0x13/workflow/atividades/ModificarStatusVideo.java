package atividades;
public class ModificarStatusVideo implements Atividade{

    public ModificarStatusVideo() {
        executar();
    }


    @Override
    public void executar() {
        System.out.println("modificando status do video");

    }

}