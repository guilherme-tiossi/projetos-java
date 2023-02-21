package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    void testeAdicao(){
        assertEquals(10, calculadora.adicao(3, 7));
    }

    @Test
    void testeMultiplicacao(){
        assertEquals(63, calculadora.multiplicacao(9, 7));
    }

    @Test
    void testeDivisao(){
        assertEquals(3, calculadora.divisao(21, 7));
    }

    @Test
    void testeSubtracao(){
        assertEquals(10, calculadora.subtracao(13, 3));
    }
}
