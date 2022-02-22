import java.util.TreeMap;

public class AnalisadorFrase{

    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> map = new TreeMap<>();
        frase = frase.replace("?","");
        frase = frase.replace("!","");
        frase = frase.replace(".","");

        String [] arrayString = frase.split(" ");
        int total=0;
        for(int i = 0; i < arrayString.length; i++) {
            for(int j = 0; j < arrayString.length; j++) {
                if(arrayString[i].equalsIgnoreCase(arrayString[j])) {
                    total++;
                }
            }
            map.put(arrayString[i].toLowerCase(), total);
            total = 0;
        }
        return map;
    }
}