package models;

public class GerenciadorMuralImpl implements GerenciadorMural {

    @Override
    public Tarefa criarTarefa(String nome) {
        Tarefa tarefa = new Tarefa();
        tarefa.setNome(nome);
        return tarefa;
    }
}
