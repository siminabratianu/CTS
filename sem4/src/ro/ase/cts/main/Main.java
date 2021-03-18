package ro.ase.cts.main;

import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;

public class Main {

	public static void main(String[] args) {
		DepartamentFinanciarEager primulDepartamanetFinanciarEager=DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepartamanetFinanciarEager=DepartamentFinanciarEager.getInstance();
		

		System.out.println(primulDepartamanetFinanciarEager.toString());
		System.out.println(alDoileaDepartamanetFinanciarEager.toString());
		
		primulDepartamanetFinanciarEager.setDirector("Gigel");
		alDoileaDepartamanetFinanciarEager.setNrAngajati(20);
		
		System.out.println(primulDepartamanetFinanciarEager.toString());
		System.out.println(alDoileaDepartamanetFinanciarEager.toString());
		
		DepartamentFinanciar primulDepartamanetFinanciar=DepartamentFinanciar.getInstance(20,"Georgescu",2700);
		DepartamentFinanciar alDoileaDepartamanetFinanciar=DepartamentFinanciar.getInstance(52,"Ana",2500);
		
		System.out.println(primulDepartamanetFinanciar.toString());
		System.out.println(alDoileaDepartamanetFinanciar.toString());
		
	}

}
