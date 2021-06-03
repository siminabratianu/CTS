package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TestGetPromovabilitate;
import clase.Grupa;
import clase.Student;

	

public class TestGrupa {
	private Grupa grupa;
	
	@Before
	public void setUp()
	{
		grupa=new Grupa(1077);
		for (int i=0;i<10;i++)
		{
			Student student=new Student("MArcel");
			student.adaugaNota(5);
			student.adaugaNota(10);
			student.adaugaNota(4);
			grupa.adaugaStudent(student);
		}
		
	}
	@Test
	@Category({TestGetPromovabilitate.class})
	public void getPromovabilitateRight()
	{
		Student student2=new Student("Marcel");
		student2.adaugaNota(10);
		student2.adaugaNota(10);
		
		Student student3=new Student("Maria");
		student3.adaugaNota(10);
		student3.adaugaNota(10);
		grupa.adaugaStudent(student2);
		grupa.adaugaStudent(student3);
		//grupa.getPromovabilitate();
		assertEquals(0.16,grupa.getPromovabilitate(),0.05 );
	}
	
	@Test
	@Category({TestGetPromovabilitate.class})
	public void getPromovabilitateBoundry()
	{
		assertEquals(0, grupa.getPromovabilitate(),0.05);
	}

	@Test
	@Category({TestGetPromovabilitate.class})
	public void testGetPromovabilitateUpperBoundry()
	{
		Grupa grupaNoua=new Grupa(1076);
		
		Student student4=new Student("Ana");
		student4.adaugaNota(10);
		student4.adaugaNota(10);
		
		Student student5=new Student("Cristi");
		student5.adaugaNota(10);
		student5.adaugaNota(10);
		grupaNoua.adaugaStudent(student4);
		grupaNoua.adaugaStudent(student5);
		assertEquals(1, grupaNoua.getPromovabilitate(),0.05);
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPromovabilitateError()
	{
		Grupa grupaNoua=new Grupa(1080);
		grupaNoua.getPromovabilitate();
	}
	
	@Test(timeout = 500)
	public void testGetPromovabilitatePerformance()
	{
		
	}
	

	
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
