package br.com.db1.start;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio4 {

	private Set<Integer> numeros = new HashSet<>();
	private Set<Integer> multiplos = new HashSet<>();
	
	public void adicionaNumeros(Integer numero) {
		numeros.add(numero);
	}
	
	public Integer multiplosDeTres() {
		Integer posicaoMultiplo = 2;
		Integer tmp = 0;
		Iterator<Integer> lista = numeros.iterator();
		while (lista.hasNext()) {
			Integer numero = lista.next();
			if(tmp == posicaoMultiplo ) {
				multiplos.add(numero);
				posicaoMultiplo = posicaoMultiplo + 3;
			}
			tmp++;
		}
		System.out.println(multiplos);
		return multiplos.size();
	}
}

