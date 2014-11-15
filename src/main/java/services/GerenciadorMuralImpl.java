package services;

import exceptions.TarefaSemNomeException;
import models.Tarefa;

public class GerenciadorMuralImpl implements GerenciadorMural {

    @Override
    public Tarefa criarTarefa(String nome) throws TarefaSemNomeException {
        if(nome.isEmpty()) {
            throw new TarefaSemNomeException();
        }
        Tarefa tarefa = new Tarefa();
        tarefa.setNome(nome);
        return tarefa;
    }
}
