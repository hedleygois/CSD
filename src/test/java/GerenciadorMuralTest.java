import static org.junit.Assert.*;

import exceptions.TarefaSemNomeException;
import services.GerenciadorMural;
import services.GerenciadorMuralImpl;
import models.Tarefa;
import org.junit.Before;
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

    @Before
    public void setUp() {
        mural = new GerenciadorMuralImpl();
    }

    @Test
    public void deveCriarUmaTarefaComONomeEspecificado() throws TarefaSemNomeException {
        Tarefa tarefa = mural.criarTarefa("Teste");
        assertEquals("Teste", tarefa.getNome());
    }

    @Test(expected = TarefaSemNomeException.class)
    public void naoDeveCriarUmaTarefaComNomeVazio() throws TarefaSemNomeException {
       mural.criarTarefa("");
    }

}
