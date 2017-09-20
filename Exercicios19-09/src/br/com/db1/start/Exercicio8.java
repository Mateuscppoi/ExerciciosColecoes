package br.com.db1.start;

import java.util.HashSet;
import java.util.Set;

public class Exercicio8 {
		private Set<String> texto1  = new HashSet<>();
		private Set<String> texto2 = new HashSet<>();
		
		public void adicionaTexto1(String texto) {
			texto1.add(texto);
		}
		
		public void adicionaTexto2(String texto) {
			texto2.add(texto);
		}
		
		public Boolean comparaSet() {
				if (texto1.containsAll(texto2)) {
					return true;
				}
			return false;
		}
}
