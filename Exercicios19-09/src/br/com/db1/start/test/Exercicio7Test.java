package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.Exercicio7;

public class Exercicio7Test {
	private Exercicio7 colecoes;
	
	@Before
	public void colecaoDeTextos() {
		colecoes = new Exercicio7();
		colecoes.adicionaTexto("Texto 1");
		colecoes.adicionaTexto("Texto 2");
		colecoes.adicionaTexto("Texto 3");
		colecoes.adicionaTexto("Texto 4");
		colecoes.adicionaTexto("Texto 5");
		colecoes.adicionaTexto("Texto 6");
		colecoes.adicionaTexto("Texto 7");
		colecoes.adicionaTexto("Texto 8");
		colecoes.adicionaTexto("Texto 9");
		colecoes.adicionaTexto("Texto 10");
		
	}
	
	@Test
	public void copiaTextoTest() {
		
		
	}

}
