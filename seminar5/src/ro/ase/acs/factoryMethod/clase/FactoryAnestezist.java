package ro.ase.acs.factoryMethod.clase;

public class FactoryAnestezist implements FactoryPersonal {

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		// TODO Auto-generated method stub
		return new Anestezist(nume, salariu);
	}

}
