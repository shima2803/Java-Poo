package teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTest {

	@Test
	public void testSum() {
		test t = new test();
		int resultado = t.sum(2, 3);

		assertEquals(5, resultado);
	}

	@Test
    public void secondtest() {
    	test a = new test(); 
    	int resul = a.sum(6,3);
    	
    	assertEquals(9, resul);
    	
    }

}
