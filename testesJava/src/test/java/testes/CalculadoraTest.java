package testes;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    public void testeAdicao(){
        assertEquals(10, calculadora.adicao(3, 7));
    }

    @Test
    public void testeMultiplicacao(){
        assertEquals(10, calculadora.multiplicacao(5, 2));
    }

    @Test
    public void testeDivisao(){
        assertEquals(10, calculadora.divisao(20, 2));
    }

    @Test
    public void testeSubtracao(){
        assertEquals(10, calculadora.subtracao(13, 3));
    }
}
