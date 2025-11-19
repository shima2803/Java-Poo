package teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void testMenos() {
		calculator calc = new calculator();
		int resultado = calc.menos(1,2,3);
		
		assertEquals(-1, resultado);
		
	}

}
