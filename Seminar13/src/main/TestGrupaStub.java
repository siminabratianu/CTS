package main;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaStub {

	@Test
	public void testGetPromovabilitateGrupa() {
		Grupa grupa=new Grupa(1077);
		IStudent student1= new StudentStub();
		IStudent student2= new StudentStub();
		IStudent student3= new StudentStub();
		grupa.adaugaStudent(student1);
		grupa.adaugaStudent(student2);
		grupa.adaugaStudent(student3);
		
		assertEquals(1, grupa.getPromovabilitate(),0.05);
		
	}
	

}
