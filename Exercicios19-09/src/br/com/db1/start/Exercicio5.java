package br.com.db1.start;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio5 {

	private Set<Integer> numeros = new HashSet<>();
	private Set<Integer> multiplos = new HashSet<>();
	
	public void adicionaNumeros(Integer numero) {
		numeros.add(numero);
	}
	
	public Integer multiplosDeDois() {
		Iterator<Integer> lista = numeros.iterator();
		while (lista.hasNext()) {
			Integer numero = lista.next();
			if(numero % 2 == 0 ) {
				multiplos.add(numero);
			}
		}
		System.out.println(multiplos);
		return multiplos.size();
	}
// Matheus, o seu codigo está muito bom, e me ajudou bastante pois ainda estava enroscada nesses.
}
