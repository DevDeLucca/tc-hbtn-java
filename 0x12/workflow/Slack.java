public class Slack implements CanalNotificacao {

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println("[SLACK] {"+mensagem.getTipoMensagem()+"} - "+mensagem.getTexto());
    }


}