import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> listaTelefones;

    public ListaTelefonica() {
        listaTelefones = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> telTemp = new ArrayList<Telefone>();

        if (!listaTelefones.containsKey(nome)) {
            telTemp.add(telefone);
            listaTelefones.put(nome, telTemp);
        } else {
            telTemp = listaTelefones.get(nome);
            telTemp.add(telefone);
            listaTelefones.put(nome, telTemp);
        }
    }
    public ArrayList<Telefone> buscar(String nome) {

        ArrayList<Telefone> telTemp = new ArrayList<Telefone>();

        if (!listaTelefones.containsKey(nome)) {
            return null;
        } else {
            telTemp = listaTelefones.get(nome);
            return telTemp;
        }
    }
}