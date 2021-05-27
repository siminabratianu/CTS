package main;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Grupa;


public class TestGrupa {


	
	@Test
	public void testRight()
	{
		Grupa grupa=new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
		
	}

	@Test
	public void testLimitaInferioara()
	{
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara()
	{
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testErrorMaiMic()
	{
		int nrGrupa=100;
		Grupa grupa=new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testErrorMaiMare()
	{
		int nrGrupa=1101;
		Grupa grupa=new Grupa(nrGrupa);
		assertEquals(nrGrupa, grupa.getNrGrupa());
	}
	@Test(timeout=500)
	public void testTimpUtil()
	{
		int nrGrupa=1077;
		Grupa grupa=new Grupa(nrGrupa);	
	}
	@Test
	public void textExistaLsta()
	{
		Grupa grupa=new Grupa(1077);
		assertNotNull(grupa.getStudenti());
		
	}
	
	
}
