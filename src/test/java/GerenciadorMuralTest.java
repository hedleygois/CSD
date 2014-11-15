import org.junit.Test;

public class GerenciadorMuralTest {

    private GerenciadorMural mural;
    
    @Test
    public deveMoverTarefa() {
    	GerenciadorMuralImpl gerenciador = new GerenciadorMural();
    	Mural muralTarefasConcluidas = new Mural("Concluido");
    	Mural muralTafefasARealizar = new Mural("A realizar");
    	Tarefa tarefa = new Tarefa("Primeira tarefa");
    	gerenciador.adicionarMural(muralConcluido);
    	gerenciador.adicionarMural(muralTafefasARealizar);
    	
    	gerenciador.adicionarTarefa();
    	
    }

}
