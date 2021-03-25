package ro.ase.acs.simpleFactory;

public class FactoryPersonal {

	public PersonalSpital createPersonal(TipPersonal tip, String nume, int salariul ) throws Exception {
		switch(tip)
		{
		case Medic: return new Medic(nume,salariul); 
		case Asistent: return new Asistent(nume,salariul); 
		case Bracardier: return new Bracardier(nume,salariul); 
		default: throw new Exception();
		}
		
		
	};
}
