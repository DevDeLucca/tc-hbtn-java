public class Program {
    public class void main(String [] args) {
        Endereco = new endereco("Rua Marechal Deodoro",
                "135",
                "",
                "Santo Amaro",
                "Sao Paulo",
                "SP",
                "Brasil");

        Empregado empregado = new Empregado("Jane Doe", 1, endereco);
        empregado.apresentar();
    }
}