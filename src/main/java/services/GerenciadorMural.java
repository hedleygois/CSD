package services;

import exceptions.TarefaSemNomeException;
import models.Tarefa;

public interface GerenciadorMural {

    Tarefa criarTarefa(String nome) throws TarefaSemNomeException;

}
