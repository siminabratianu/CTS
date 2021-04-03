package ro.ase.acs.factoryMethod;

public class FactoryAtacant  implements FactoryJucator{

	@Override
	public Jucator createJucator(String nume, int meciuriJucate) {
		// TODO Auto-generated method stub
		return new Atacant(nume,meciuriJucate);
	}

}
