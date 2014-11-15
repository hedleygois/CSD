import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import exceptions.TarefaSemNomeException;
import services.GerenciadorMural;
import services.GerenciadorMuralImpl;
import models.Tarefa;
import models.Mural;

import org.junit.Before;
import org.junit.Test;

public class GerenciadorMuralTest {

    private GerenciadorMural gerenciador;

    @Before
    public void setUp() {
    	gerenciador = new GerenciadorMuralImpl();
    }

    @Test
    public void deveCriarUmaTarefaComONomeEspecificado() throws TarefaSemNomeException {
        Tarefa tarefa = gerenciador.criarTarefa("Teste");
        assertEquals("Teste", tarefa.getNome());
    }

    @Test(expected = TarefaSemNomeException.class)
    public void naoDeveCriarUmaTarefaComNomeVazio() throws TarefaSemNomeException {
    	gerenciador.criarTarefa("");
    }
    
    @Test
    public void deveMoverTarefa() {
    	Mural muralTarefasConcluidas = new Mural("concluido");
    	Mural muralTafefasARealizar = new Mural("realizar");
    	List<Mural> murais = new ArrayList<>();
    	murais.add(muralTarefasConcluidas);
    	murais.add(muralTafefasARealizar);
    	gerenciador.setMurais(murais);
    	
    	Tarefa tarefa = gerenciador.criarTarefa("Primeira tarefa");
    	muralTafefasARealizar.addTarefa(tarefa);
    }

}
