package models;

import java.util.ArrayList;

public class GerenciadorMuralImpl implements GerenciadorMural {
	
	private List<Mural> murais;
	
	public GerenciadorMuralImpl(List<Mural> murais) {
		this.murais = murais;
	}
	
	public void adicionarMural(Mural mural) {
		murais.add(mural);
	}

    @Override
    public Tarefa criarTarefa() {
        return null;
    }
    
    @Override
    public void moverTarefa(Tarefa tarefa) {
    	
    }
}
