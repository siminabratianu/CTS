package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TestGetPromovabilitate;
import categorii.TesteNormale;
import clase.Grupa;
import clase.Student;

	

public class TestGrupa {
	@Test(expected = IllegalArgumentException.class)
	public void testGetPromovabilitateError() {
		Grupa grupaa = new Grupa(1080);
		grupaa.getPromovabilitate();
	}
	

	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	@Category({TesteNormale.class})
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMic() {
		int nrGrupa=100;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMaiMare() {
		int nrGrupa=1102;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}

	
	
}
