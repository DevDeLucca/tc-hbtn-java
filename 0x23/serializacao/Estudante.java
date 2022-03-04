import java.io.Serializable;

public class Estudante implements Serializable {

    private static final long serialVersionUID = 1L;
    private int idade;
    private String nome;
    private transient String senha;

    public Estudante () {

    }

    public Estudante(String nome, int idade, String senha) {
        super();
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    @Override
    public String toString() {
        return String.format("Estudante { nome='%s', idade='%d', senha='%s' }", getNome(), getIdade(), getSenha());
    }



}