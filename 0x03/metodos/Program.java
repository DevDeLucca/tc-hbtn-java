public class Program {
    public static void main(String[] args) {
        PersonagemGame personagem1 = new PersonagemGame();

        personagem1.setNome("Sonic");
        personagem1.setSaudeAtual(10);

        System.out.printf("%d\n", personagem1.getSaudeAtual());

        personagem1.receberCura(91);

        System.out.printf("%d\n", personagem1.getSaudeAtual());

        personagem1.tomarDano(25);

        System.out.printf("%d\n", personagem1.getSaudeAtual());

        personagem1.tomarDano(80);

        System.out.printf("%d\n", personagem1.getSaudeAtual());
    }
}