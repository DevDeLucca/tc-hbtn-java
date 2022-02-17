public class Sms implements CanalNotificacao {

    @Override
    public void notificar (Mensagem mensagem) {
        System.out.println("[Sms] {"+mensagem.getTipoMensagem()+" } - "+mensagem.getTexto());
    }
}