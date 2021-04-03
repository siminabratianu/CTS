package ro.ase.acs.factoryMethod;

public class FactoryFundas implements FactoryJucator{

	@Override
	public Jucator createJucator(String nume, int meciuriJucate) {
		// TODO Auto-generated method stub
		return new Fundas(nume, meciuriJucate);
	}
	

}
