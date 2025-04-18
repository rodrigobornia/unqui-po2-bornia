package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MultioperadorTest {

	@Test
	public void testSumatoriaConNumerosPositivos() {
       
        assertEquals(10, Multioperador.sumatoriaDe(Arrays.asList(1, 2, 3, 4)));
    }
	
	
	  @Test
	    public void testRestaNormal() {
	        assertEquals(5, laRestaDeTodos(Arrays.asList(10, 3, 2))); // 10 - 3 - 2 = 5
	    }
}





