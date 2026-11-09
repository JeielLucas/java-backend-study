public class Tarefa {
    private String titulo;
    private boolean concluida;

    public Tarefa(String titulo){
        this.titulo = titulo;
        this.concluida = false;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public boolean isConcluida(){
        return this.concluida;
    }

    public void concluir(){
        this.concluida = true;
    }
}
