package ro.ase.acs.factoryMethod;

public class FactoryPortar implements FactoryJucator{

	@Override
	public Jucator createJucator(String nume, int meciuriJucate) {
		// TODO Auto-generated method stub
		return new Portar(nume, meciuriJucate);
	}

}
