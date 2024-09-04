package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

//Punto 1)

public class Counter {
	
	private List<Integer> arrayInt = new ArrayList<Integer>();

	public void addNumber(int i) {
		arrayInt.add(i);
	}

	public int cantidadDePares() {
		List<Integer> listaARecorrer = arrayInt;
		
		int paresVistos = 0;
		
		int i=0;
		
		while(listaARecorrer.size() != i) {
			if((listaARecorrer.get(i) % 2) == 0) { 
				paresVistos =+ 1; 
			}
			i++;
		}
		return paresVistos;
	}
		
	
	public int cantidadDeImpares() {
		List<Integer> listaARecorrer = arrayInt;
		
		int imparesVistos = 0;
		
		int i = 0;
		
		while(i < listaARecorrer.size() ) {
			if((listaARecorrer.get(i) % 2) == 1) { 
				imparesVistos = imparesVistos + 1; 
			}
			i++;
		}
		return imparesVistos;
	}
}