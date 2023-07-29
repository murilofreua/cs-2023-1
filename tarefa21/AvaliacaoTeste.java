import static org.junit.Assert.*;
import org.junit.Test;
import alfa.br.com.gilmario.modelo.Avaliacao;

public class AvaliacaoTeste {

    Avaliacao avaliacao = new Avaliacao();

    @Test
    public void testAprovado() {

        String resultado = avaliacao.avalia(8.0, 7.6, 10, 64);

        assertEquals("Aprovado.", resultado);
    }

    @Test
    public void testReprovadoPorFalta() {

        String resultado = avaliacao.avalia(8.0, 7.6, 24, 64);

        assertEquals("Reprovado por Falta.", resultado);
    }

    @Test
    public void testReprovadoPorMedia() {

        String resultado = avaliacao.avalia(2.2, 3.0, 8, 64);

        assertEquals("Reprovado por Média.", resultado);
    }

    @Test
    public void testRecuperacao() {

        String resultado = avaliacao.avalia(4.0, 5.0, 8, 64);

        assertEquals("Prova Extra.", resultado);
    }

    @Test
    public void testValorInvalido() {

        String resultado = avaliacao.avalia(8.0, -7.6, 10, 64);

        assertEquals("Valores Inválidos.", resultado);
    }
}
