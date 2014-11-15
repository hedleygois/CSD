package models;

import exceptions.TarefaSemNomeException;

public interface GerenciadorMural {

    Tarefa criarTarefa(String nome) throws TarefaSemNomeException;

}
