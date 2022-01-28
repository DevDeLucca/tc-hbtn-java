public class Program {
    public static void main(String[] args) {
        PersonagemGame personagem1 = new PersonagemGame();

        personagem1.setNome("Sonic");
        personagem1.setSaudeAtual(0);

        System.out.printf("%d - %s\n", personagem1.getSaudeAtual(), personagem1.getStatus());

        personagem1.receberCura(90);

        System.out.printf("%d - %s\n", personagem1.getSaudeAtual(), personagem1.getStatus());

        personagem1.tomarDano(25);

        System.out.printf("%d - %s\n", personagem1.getSaudeAtual(), personagem1.getStatus());

        personagem1.tomarDano(80);

        System.out.printf("%d - %s\n", personagem1.getSaudeAtual(), personagem1.getStatus());

        personagem1.receberCura(10);

        System.out.printf("%d - %s\n", personagem1.getSaudeAtual(), personagem1.getStatus());
    }
}