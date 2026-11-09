import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaDeTarefas;

    public ListaTarefas(){
        this.listaDeTarefas = new ArrayList<>();
    }

    public void listar(){
        if(listaDeTarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        int contador = 1;
        for(Tarefa tarefa : listaDeTarefas){
            System.out.printf("%d. %s\n", contador, tarefa);
            contador++;
        }
    }

    public void adicionar(String tarefa){
        Tarefa tarefa1 = new Tarefa(tarefa);
        this.listaDeTarefas.add(tarefa1);
    }

    public void concluir(String tarefa){
        for(Tarefa tarefa1 : listaDeTarefas){
            if(tarefa1.getTitulo().equals(tarefa)){
                tarefa1.concluir();
                return;
            }
        }
        System.out.println("A tarefa não foi encontrada");
    }
}
