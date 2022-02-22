import java.util.*;

public class Program {
    public static void main(String[] args) {
        Telefone telefone1 = new Telefone("11", "9888-5551");
        Telefone telefone2 = new Telefone("17", "99602-6725");
        Telefone telefone3 = new Telefone("21", "9882-1514");
        Telefone telefone4 = new Telefone("13", "8771-2344");
        Telefone telefone5 = new Telefone("17", "3221-1788");
        Telefone telefone6 = new Telefone("17", "3444-1112");
        Telefone telefone7 = new Telefone("17", "3311-1566");

        Telefone telefoneDuplicado1 = new Telefone("11", "9888-5551");
        Telefone telefoneDuplicado2 = new Telefone("17", "3444-1112");

        ListaTelefonica listaTelefonica1 = new ListaTelefonica();
        listaTelefonica1.adicionarTelefone("Pedro Alvaro", telefone1);
        listaTelefonica1.adicionarTelefone("Pedro Alvaro", telefone2);
        listaTelefonica1.adicionarTelefone("Pedro Alvaro", telefone7);
        listaTelefonica1.adicionarTelefone("Maria Joaquina", telefone3);
        listaTelefonica1.adicionarTelefone("Maria Joaquina", telefone5);
        listaTelefonica1.adicionarTelefone("Carlos Alberto", telefone4);
        listaTelefonica1.adicionarTelefone("Carlos Alberto", telefone6);

        try {
            listaTelefonica1.adicionarTelefone("Pedro Alvaro", telefoneDuplicado1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            listaTelefonica1.adicionarTelefone("Pedro Alvaro", telefoneDuplicado2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Set<Telefone> telefones1 = listaTelefonica1.buscar("Pedro Alvaro");
        if (telefones1 == null)
            System.out.println("Telefones na encontrados");
        else 
            System.out.println(telefones1);

        Set<Telefone> telefones2 = listaTelefonica1.buscar("Maria Joaquina");
        if (telefones2 == null)
            System.out.println("Telefones na encontrados");
        else   
            System.out.println(telefones2);

        Set<Telefone> telefones3 = listaTelefonica1.buscar("Carlos Alberto");
        if (telefones3 == null)
            System.out.println("Telefones na encontrados");
        else 
            System.out.println(telefones3);

        Set<Telefone> telefones4 = listaTelefonica1.buscar("Jose Oliveira");
        if (telefones4 == null)
            System.out.println("Telefones na encontrados");
        else 
            System.out.println(telefones4);
    }    
}
