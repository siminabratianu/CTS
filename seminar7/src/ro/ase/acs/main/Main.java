package ro.ase.acs.main;

import ro.ase.acs.clase.AdapterLeasing;
import ro.ase.acs.clase.AdapterLeasingClase;
import ro.ase.acs.clase.Creditable;
import ro.ase.acs.clase.Leasing;

public class Main {
	
	public static void printeazaInformatiiCredit(Creditable credit)
	{
		credit.crediteaza();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leasing leasing=new Leasing("Bogdan", 5000);
		AdapterLeasing adapterLeasing=new AdapterLeasing(leasing);
		adapterLeasing.crediteaza();
		System.out.println("................");
		printeazaInformatiiCredit(adapterLeasing);

		
		AdapterLeasingClase adapterLeasingClase=new AdapterLeasingClase("Gigel", 25000);
		printeazaInformatiiCredit(adapterLeasingClase);
	}

}
