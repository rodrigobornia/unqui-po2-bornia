package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private  List<Integer>  arrayInt =  new ArrayList<Integer>();
	
	public int cantidadDePares() {
		List<Integer> listaARecorrer = arrayInt;
		
		int paresVistos = 0;
		
		int i=0;
		
		while(listaARecorrer.size() != i) {
			if((listaARecorrer.get(i) % 2) == 0) { 
				paresVistos += 1; 
			}
			i += 1;
		}
		return paresVistos;
	}
	
	public int cantidadDeImpares() {
		List<Integer> listaARecorrer = arrayInt;
		int imparesVistos = 0;
		int i= 0; 
		
		while(listaARecorrer.size() != i) {
			if((listaARecorrer.get(i) % 2) ==1) { 
				imparesVistos += 1; 
			}
			i += 1;
		}
		return imparesVistos;
	}
	
	public int cantidadDeMultiplosDe(int m) {
	    List<Integer> listaARecorrer = arrayInt;

	    int multiplosVistos = 0;

	    for (int i = 0; i < listaARecorrer.size(); i++) {
	        if (listaARecorrer.get(i) % m == 0) {
	            multiplosVistos++;
	        }
	    }
	    return multiplosVistos;
	}

	public void addNumber(int i) {
		arrayInt.add(i);
	}

}
