public class Program {
    public static void main(String[] args) {
        ProcessadorVideo processadorVideo1 = new ProcessadorVideo();
        processadorVideo1.registrarCanal(new Slack());
        processadorVideo1.registrarCanal(new Teams());

        ProcessadorVideo processadorVideo2 = new ProcessadorVideo();
        processadorVideo2.registrarCanal(new Slack());
        processadorVideo2.registrarCanal(new Email());

        ProcessadorVideo processadorVideo3 = new ProcessadorVideo();
        processadorVideo3.registrarCanal(new Sms());

        ProcessadorVideo processadorVideo4 = new ProcessadorVideo();

        ProcessadorVideo processadorVideo5 = new ProcessadorVideo();
        processadorVideo5.registrarCanal(new Sms());
        processadorVideo5.registrarCanal(new Slack());
        processadorVideo5.registrarCanal(new Email());
        processadorVideo5.registrarCanal(new Teams());

        Video video1 = new Video("video1.mpg", FormatoVideo.MPEG);
        Video video2 = new Video("video2.avi", FormatoVideo.AVI);
        Video video3 = new Video("video3.mkv", FormatoVideo.MKV);

        processadorVideo1.processar(video1);

        System.out.println();

        processadorVideo2.processar(video1);

        System.out.println();

        processadorVideo3.processar(video2);

        System.out.println();

        processadorVideo4.processar(video3);

        System.out.println();

        processadorVideo5.processar(video3);
    }
}
