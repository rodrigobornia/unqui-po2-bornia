package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	public static int sumatoriaDe(List<Integer> arrayDeEnteros) {
		
		int sumatoriaHastaAhora = 0;
		
		for(int i=0; arrayDeEnteros.size() != i;i++) {
			sumatoriaHastaAhora += arrayDeEnteros.get(i);
		}
		return sumatoriaHastaAhora;
	}
	
	// Ejemplo: [10, 3, 2] → 10 - 3 - 2 = 5
	public  int laRestaDeTodos(List<Integer> arrayDeEnteros) {
	    if (arrayDeEnteros.isEmpty()) return 0;

	    int restaHastaAhora = arrayDeEnteros.get(0);
	    for (int i = 1; i < arrayDeEnteros.size(); i++) {
	        restaHastaAhora -= arrayDeEnteros.get(i);
	    }
	    return restaHastaAhora;
	}

	public int multiplicacionDe(List<Integer> arrayDeEnteros) {

		int multiplicacionHastaAhora = 0;
		for(int i=0; arrayDeEnteros.size() != i;i++) {
			multiplicacionHastaAhora =  arrayDeEnteros.get(i) * multiplicacionHastaAhora;
		}
		return multiplicacionHastaAhora;
	}
}
