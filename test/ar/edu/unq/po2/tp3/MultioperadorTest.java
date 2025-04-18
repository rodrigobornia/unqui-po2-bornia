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
	
	
	 
}





