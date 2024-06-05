package aplicacao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteSub {
    @Test
    public void TesteSubb() {
    	SubSimples calculator = new SubSimples();
        assertEquals(4, calculator.subtract(6, 2)); 
    }
}
