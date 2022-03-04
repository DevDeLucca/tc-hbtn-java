import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializarEstudantes<T> {

    private String nomeArquivo;
    private FileOutputStream fileOut;
    private ObjectOutputStream out;
    private FileInputStream fileIn;
    private ObjectInputStream in;

    public SerializarEstudantes(String nomeArquivo) {
        super();
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {

        try {
            fileOut = new FileOutputStream(nomeArquivo);
            out = new ObjectOutputStream(fileOut);
            out.writeObject(estudantes);
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel serializar");
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel serializar");
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {

        List<Estudante> leitura = null;

        try {
            fileIn = new FileInputStream(nomeArquivo);
            in = new ObjectInputStream(fileIn);
            leitura = (List<Estudante>) in.readObject();

        } catch (IOException e) {
            System.out.println("Nao foi possivel desserializar");
        } catch (ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        } finally {
            if (in != null) {
                try {

                    fileIn.close();
                } catch (IOException e) {
                    System.out.println("Nao foi possivel desserializar");
                }
            }
        }

        return leitura;
    }

}