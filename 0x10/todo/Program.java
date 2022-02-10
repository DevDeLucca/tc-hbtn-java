public class Program {
    public static void main(String[] args) throws Exception {
        ListaTodo todo = new ListaTodo();

        todo.adicionarTarefa(new Tarefa("Ler conteudo aula Lambda", 1));
        todo.adicionarTarefa(new Tarefa("Aprender Design Patterns", 2));
        todo.adicionarTarefa(new Tarefa("Limpar o quarto", 3));

        todo.marcarTarefaFeita(1);

        todo.listarTarefas();

        System.out.println("----");

        todo.marcarTarefaFeita(2);
        todo.desfazerTarefa(1);

        todo.listarTarefas();

        System.out.println("----");

        try {
            todo.marcarTarefaFeita(2);
            todo.listarTarefas();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("----");

        todo.fazerTodas();
        todo.listarTarefas();
        System.out.println("----");

        todo.desfazerTodas();
        todo.listarTarefas();
        System.out.println("----");

        boolean resultado = todo.marcarTarefaFeita(4);
        System.out.println(resultado);
        System.out.println("----");

        resultado = todo.desfazerTarefa(5);
        System.out.println(resultado);
        System.out.println("----");

        try {
            todo.adicionarTarefa(new Tarefa("Lavar roupas", 2));
            todo.listarTarefas();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("----");

        try {
            todo.adicionarTarefa(new Tarefa("", 4));
            todo.listarTarefas();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("----");
    }
}