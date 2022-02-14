public class Program {

    public static void main(String[] args) {

        Celular celular = new Celular();

        Contato contato1 = new Contato("Jane Doe", "998211555", TipoNumero.CELULAR);
        Contato contato2 = new Contato("John Bannons", "32214332", TipoNumero.CASA);

        try {
            celular.adicionarContato(contato1);
            celular.adicionarContato(contato2);
            celular.listarContatos();

        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----");

        try {
            celular.atualizarContato(contato1, new Contato("Jane Doe", "998211556", TipoNumero.CELULAR));
            celular.listarContatos();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----");

        try {
            celular.atualizarContato(new Contato("John Bannons", "32214332", TipoNumero.CASA),
                    new Contato("John Bannons", "32214333", TipoNumero.CASA));
            celular.listarContatos();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----");

        try {
            celular.atualizarContato(new Contato("John Bannons", "32214332", TipoNumero.CASA),
                    new Contato("John Bannons", "32214333", TipoNumero.CASA));
            celular.listarContatos();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----");

        try {
            celular.atualizarContato(new Contato("John", "32214332", TipoNumero.CASA),
                    new Contato("John Bannons", "32214333", TipoNumero.CASA));
            celular.listarContatos();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----");

        try {
            celular.atualizarContato(contato2,
                    new Contato("Jane Doe", "32214333", TipoNumero.CASA));
            celular.listarContatos();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----");

        try {
            celular.removerContato(contato1);
            celular.listarContatos();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----");

        try {
            celular.removerContato(new Contato("Jane", "32214333", TipoNumero.CASA));
            celular.listarContatos();
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-----");
    }
}
