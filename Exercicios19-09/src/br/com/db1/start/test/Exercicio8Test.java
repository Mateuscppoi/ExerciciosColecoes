package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.Exercicio8;

public class Exercicio8Test {
	private Exercicio8 colecoes;
	
	@Before
	public void colecaoDeTextos() {
		colecoes = new Exercicio8();
		colecoes.adicionaTexto1("Texto 1");
		colecoes.adicionaTexto1("Texto 2");
		colecoes.adicionaTexto1("Texto 6");
		colecoes.adicionaTexto1("Texto 7");
		colecoes.adicionaTexto1("Texto 4");
		colecoes.adicionaTexto1("Texto 8");
		colecoes.adicionaTexto1("Texto 9");
		colecoes.adicionaTexto1("Texto 3");
		colecoes.adicionaTexto1("Texto 5");
		colecoes.adicionaTexto1("Texto 10");
		
		colecoes.adicionaTexto2("Texto 1");
		colecoes.adicionaTexto2("Texto 4");
		colecoes.adicionaTexto2("Texto 5");
		colecoes.adicionaTexto2("Texto 2");
		colecoes.adicionaTexto2("Texto 3");
		colecoes.adicionaTexto2("Texto 6");
		colecoes.adicionaTexto2("Texto 7");
		colecoes.adicionaTexto2("Texto 9");
		colecoes.adicionaTexto2("Texto 8");
		colecoes.adicionaTexto2("Texto 10");
	}
	
	@Test
	public void comparaList() {
		Assert.assertTrue(true == colecoes.comparaSet());
		
	}

}
