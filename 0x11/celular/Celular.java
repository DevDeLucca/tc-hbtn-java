import java.util.ArrayList;
import java.util.List;

public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    private ArrayList<Contato> contatosPesquisados = new ArrayList<Contato>();

    public Celular() {

    }

    public Celular(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    public int buscarPosicaoContato(String nomeContato) {

        return contatos.indexOf(nomeContato);

    }

    public void adicionarContato(Contato contato) {

        for (Contato contatoAdd : contatos) {
            if (contatoAdd.getNome().equals(contato.getNome())) {
                throw new IllegalArgumentException(
                        "Nao foi possivel adicionar contato. Contato jah existente com esse nome");
            }

        }

        contatos.add(contato);
    }

    public void removerContato(Contato contato) {

        for (int i = 0; i < contatos.size(); i++) {

            if (contatos.get(i).getNome().equals(contato.getNome())) {
                contatos.remove(i);
            } else {
                throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
            }
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {



        for (Contato contato : contatos) {
            if (contato.getNome().equals(novoContato.getNome()) && ! contato.getNome().equals(contatoAntigo.getNome())){
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            }
            if (!(contatoAntigo.getNome().equals(novoContato.getNome()))) {
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
            }
        }



        for (int i = 0; i < contatos.size(); i++) {

            if (contatos.get(i).getNome().equals(contatoAntigo.getNome())) {
                contatos.get(i).setNumeroDeTelefone(novoContato.getNumeroDeTelefone());
                contatos.get(i).setTipo(novoContato.getTipo());
            }

        }

    }

    public List<Contato> buscarContato(String nomeContatoBuscado) {

        for (Contato contato : contatos) {
            if (contato.getNome().equals(nomeContatoBuscado)) {
                contatosPesquisados.add(contato);
            }
        }
        return contatosPesquisados;
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(
                    contato.getNome() + " -> " + contato.getNumeroDeTelefone() + " (" + contato.getTipo() + ")");
        }
    }
}