import static org.junit.Assert.*;
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
    public void deveCriarUmaTarefaComONomeEspecificado() {
        Tarefa tarefa = mural.criarTarefa("Teste");
        assertEquals("Teste", tarefa.getNome());
    }

}
