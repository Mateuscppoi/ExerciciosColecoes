package br.com.db1.start.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.Produto;
import br.com.db1.start.ProdutoComparator;

public class ProdutoTest {
	
	@Test
	public void exercicio9Test() {
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto(98, "CELULAR", 1000.0));
		produtos.add(new Produto(50, "MONITOR", 200.0));
		produtos.add(new Produto(55, "CANECA", 50.0));
		
		Assert.assertTrue(produtos.size() == 3);
		
		Assert.assertTrue(produtos.get(0).getValor() == 1000.0);
		Assert.assertTrue(produtos.get(1).getValor() == 200.0);
		Assert.assertTrue(produtos.get(2).getValor() == 50.0);
		
		Collections.sort(produtos);
		
		Assert.assertTrue(produtos.get(0).getValor() == 50.0);
		Assert.assertTrue(produtos.get(1).getValor() == 200.0);
		Assert.assertTrue(produtos.get(2).getValor() == 1000.0);
		
		Collections.sort(produtos, new ProdutoComparator());
		
		Assert.assertEquals("CANECA", produtos.get(0).getDescricao());
		Assert.assertEquals("CELULAR", produtos.get(1).getDescricao());
		Assert.assertEquals("MONITOR", produtos.get(2).getDescricao());
		
	}

}
