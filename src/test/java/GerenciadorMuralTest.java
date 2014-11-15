import static org.junit.Assert.*;

import exceptions.TarefaSemNomeException;
import models.GerenciadorMural;
import models.GerenciadorMuralImpl;
import models.Tarefa;
import org.junit.Before;
import org.junit.Test;

public class GerenciadorMuralTest {

    private GerenciadorMural mural;

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
