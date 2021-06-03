package main;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import dubluri.StudentFake;

public class TestGrupaFake {

	@Test
	public void testPromovabilitateAreRestante() {
		
		Grupa grupa=new Grupa(1077);
		for(int i=0;i<8;i++)
		{
			StudentFake student=new StudentFake();
			student.setAreRestante(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<2;i++)
		{
			StudentFake student2=new StudentFake();
			student2.setAreRestante(true);
			grupa.adaugaStudent(student2);
			
		}
		assertEquals(0.8, grupa.getPromovabilitate(),0.01);
	
	
	
	}

}
