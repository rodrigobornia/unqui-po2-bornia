package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	public Integer esMultiplo(int i) {
		List<Integer> multiplos = this.arrayInt.stream().filter(n -> n % i==0).collect(Collectors.toList());
		return multiplos.size();
	}
	
	//Punto 2)
	public int desarmarNumeros(ArrayList<Integer> enteros) {
		
		int numerosConMasPares = enteros.get(0);
		for(int entero:enteros) {
			numerosConMasPares = numerosConMasParesEntre(numerosConMasPares, entero);
		}		
		return numerosConMasPares;
	}

	public int numerosConMasParesEntre(int x, int y) {
		int numMayor = (numerosParesEn(x) >= numerosParesEn(y)) ? x : y;		
		return numMayor;
	}

	//obtengo los numeros pares del digito
	public int numerosParesEn(int x) {
		for (int i = 0; i < cantidadDeDigitosDe(x); i++) {
			this.addNumber(x % 10);
			x = x / 10;
		}
		return (this.cantidadDePares());
	}
	
	public int cantidadDeDigitosDe(int numero) {
		int cifras = 1;
		int n = numero;
		while(n >= 10) {
			n = n/10;
			cifras++;
		}
		return cifras;
	}
	// Punto 3
	public int multiploEntre(int x, int y) {
		int resultado = -1;
		for(int i=0; i < 1000; i++) {
			if(sonMultiplos(x,y,i)) {
				resultado = i;
			}
		}
		return resultado;
	}

	public boolean sonMultiplos(int x, int y, int i) {
		return (i%x==0 && i%y==0);
	}
	
}