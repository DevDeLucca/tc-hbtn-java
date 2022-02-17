public class Slack implements  CanalNotificacao {

    @override
    public void notificar(Mensagem mensagem) {
        System.out.println("[Slack] {"+mensagem.getTipoMensagem()+" } - "+mensagem.getTexto());
    }
}