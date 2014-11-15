package models;

import java.util.ArrayList;
import java.util.List;

public class Mural {
	
	private String nome;
	private List<Tarefa> tarefas;
	
	public Mural(String nome) {
		this.nome = nome;
		tarefas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	
	public void addTarefa(Tarefa tarefa) {
		tarefas.add(tarefa);
	}
	
	public void removeTarefa(Tarefa tarefa) {
		tarefas.remove(tarefa);
	}
	
}
