package ro.ase.acs.factoryMethod.clase;

public class FactoryBracardier implements FactoryPersonal {

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		// TODO Auto-generated method stub
		return new Bracardier(nume, salariu);
	}

	
}
