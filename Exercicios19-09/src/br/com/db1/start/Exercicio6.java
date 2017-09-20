package br.com.db1.start;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio6 {
	private Set<String> textoOriginal  = new HashSet<>();
	private Set<String> textoCopiado = new HashSet<>();
	
	public void adicionaTexto(String texto) {
		textoOriginal.add(texto);
	}
	
	public Integer copiaTexto() {
		Iterator<String> lista = textoOriginal.iterator();
		while (lista.hasNext()) {
			String texto = lista.next();
			textoCopiado.add(texto);
		}
		System.out.println(textoCopiado);
		return textoCopiado.size();
	}
}

// sem falar que a maneira de que vc faz de separar cada teste em uma classe nova facilita a concentração tbm, vou aderir  essa pratica.