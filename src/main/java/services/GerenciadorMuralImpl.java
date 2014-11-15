package services;

import java.util.List;

import exceptions.TarefaSemNomeException;
import models.Tarefa;
import models.*;

public class GerenciadorMuralImpl implements GerenciadorMural {

	private List<Mural> murais;
	
	public List<Mural> getMurais() {
		return murais;
	}
	
	public void setMurais(List<Mural> murais) {
		this.murais = murais;
	}
	
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
