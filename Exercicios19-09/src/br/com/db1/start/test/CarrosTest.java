package br.com.db1.start.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.Carros;
import br.com.db1.start.CarrosComparator;
import br.com.db1.start.CarrosComparatorMarca;

public class CarrosTest {
	
	@Test
	public void test(){
		List<Carros> carros = new ArrayList<>();
		carros.add(new Carros(1972, "Fusca", "VW", "DAD-1234"));
		carros.add(new Carros(2017, "Ecosport", "Ford", "ABC-9999"));
		carros.add(new Carros(2016, "Uno", "Fiat", "ABC-1890"));

		Assert.assertTrue(carros.size() == 3);
		Assert.assertTrue(carros.get(0).getAno() == 1972);
		Assert.assertTrue(carros.get(1).getAno() == 2017);
		Assert.assertTrue(carros.get(2).getAno() == 2016);
		
		Collections.sort(carros);

		Assert.assertTrue(carros.get(0).getAno() == 1972);
		Assert.assertTrue(carros.get(1).getAno() == 2016);
		Assert.assertTrue(carros.get(2).getAno() == 2017);

		Collections.sort(carros, new CarrosComparatorMarca());

		Assert.assertEquals("Fiat",carros.get(0).getMarca());
		Assert.assertEquals("Ford",carros.get(1).getMarca());
		Assert.assertEquals("VW",carros.get(2).getMarca());


		Collections.sort(carros, new CarrosComparator());

		Assert.assertEquals("ABC-1890",carros.get(0).getPlaca());
		Assert.assertEquals("ABC-9999",carros.get(1).getPlaca());
		Assert.assertEquals("DAD-1234",carros.get(2).getPlaca());
	}

}
