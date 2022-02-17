import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {

    private List<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

    public ProcessadorVideo() {

    }

    public ProcessadorVideo(List<CanalNotificacao> canais) {
        super();
        this.canais = canais;
    }

    public void registrarCanal(CanalNotificacao canal) {
        canais.add(canal);
    }

    public void processar(Video video) {
        for (CanalNotificacao canalNotificacao : canais) {
            canalNotificacao.notificar(new Mensagem(video.getArquivo() +" - "+video.getFormato() , TipoMensagem.LOG));
        }
    }

    public List<CanalNotificacao> getCanais() {
        return canais;
    }

    public void setCanais(List<CanalNotificacao> canais) {
        this.canais = canais;
    }




}