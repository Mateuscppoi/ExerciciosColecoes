package br.com.db1.start;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio3 {
	
	private Set<Integer> numeros = new HashSet<>();
	
	public void adicionaNumeros(Integer numero) {
		numeros.add(numero);
	}
	
	public Integer removePosicao(Integer posicao) {
		Integer tmp = 0;
		Integer numero= 0;
		Iterator<Integer> lista = numeros.iterator();
		while (lista.hasNext()) {
			if(tmp == posicao-1) {
				numero = lista.next();
			}
			tmp++;
		}
		numeros.remove(numero);
		return numeros.size();
	}
}