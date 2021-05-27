package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTest {
	Student student=null;

	//Student student=new Student();
	@Before
	public void setUp()
	{
		 student=new Student();
	}
	@Test
	public void testApelCorectConstrucctorCuParametru() {
		String nume="Ion";
		Student student=new Student(nume);
		
	
		//verificam daca cei 2 parametri primiti sunt egali; daca sunt diferite apeleaza fail
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testApelConstructorFaraParametru()
	{
		String nume="Student";
		Student student=new Student();
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaConstructorFaraParametri()
	{
		Student student=new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNotaInLista()
	{
		//Student student=new Student();
		int nota=6;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	@Test
	public void testMarimeListaCorecta()
	{
	//	Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void setNumeCorect()
	{
	//	Student student=new Student();
		String nume="Gigel";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
		
		
	}
	@Test
	public void testCalculareMedieCorecta()
	{
		student.adaugaNota(7);
		student.adaugaNota(8);
		assertEquals(7.5, student.calculeazaMedie(),0.01);
		
	}
	
	@Test
	public void testCalculareMedieFaraNote()
	{
		assertEquals(0, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testCalculareMedieCuONota()
	{
		student.adaugaNota(6);
		assertEquals(6, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testVerificareRestanta()
	{
		int nota=4;
		int nota1=10;
		student.adaugaNota(nota);
		student.adaugaNota(nota1);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testeVerificareNuAreRestane()
	{
		int nota=5;
		int nota1=10;
		student.adaugaNota(nota);
		student.adaugaNota(nota1);
		assertFalse(student.areRestante());
		
	}
	
	@Test
	public void testareVerificareRestanteFaraNote()
	{
		assertFalse(student.areRestante());
	}
	
	@Test (expected=IndexOutOfBoundsException.class)
	public void testareVerificareAruncareExceptie()
	{
		int index=-1;
		student.getNota(index);
		
	}
	/*@Test
	public void testgetNotaShouldThrowException()
	{
		Student s= new Student();
		try {
			student.getNota(-1);
			fail("nu trebuia sa ajunga aici");
			
		}
		catch() {
			
		}
	}
	
*/
}
