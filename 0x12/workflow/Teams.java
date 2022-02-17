public class Teams implements CanalComunicacao {

    @override
    public void notificar(Mensagem mensagem) {
        System.out.println("[Teams] {"+mensagem.getTipoMensagem()+" } - "+mensagem.getTexto());
    }
}