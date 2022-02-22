import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> listaTelefones;

    public ListaTelefonica() {
        listaTelefones = new HashMap<>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) {
        HashSet<Telefone> telTempLoc = new HashSet<Telefone>();
        boolean achou = false;
        String chave = "";


        for (Entry<String, HashSet<Telefone>> entry : listaTelefones.entrySet()) {
            if (entry.getValue().contains(telefone)) {
                achou=true;
                chave = entry.getKey();
            }
        }

        if(achou == false && listaTelefones.containsKey(nome)) {
            telTempLoc.addAll(listaTelefones.get(nome));
            telTempLoc.add(telefone);
            listaTelefones.put(nome, telTempLoc);

        }

        if(chave.equals(nome) && achou) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }else if(!chave.equals(nome) && achou){
            throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
        }

        telTempLoc.add(telefone);
        listaTelefones.put(nome, telTempLoc);

        return telTempLoc;

    }
    public HashSet<Telefone> buscar(String nome) {

        HashSet<Telefone> telTemp = new HashSet<Telefone>();

        if (!listaTelefones.containsKey(nome)) {
            return null;
        } else {
            telTemp = listaTelefones.get(nomes);
            return telTemp;
        }

    }

}
