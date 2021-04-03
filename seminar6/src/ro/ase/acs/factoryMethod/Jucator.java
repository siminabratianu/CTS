package ro.ase.acs.factoryMethod;

public  abstract class Jucator {
	private String nume;
	private int meciuriJucate;
	
	
	
	
	public Jucator(String nume, int meciuriJucate) {
		super();
		this.nume = nume;
		this.meciuriJucate = meciuriJucate;
	}




	@Override
	public String toString() {
		return "Jucator [nume=" + nume + ", meciuriJucate=" + meciuriJucate + "]";
	}

	
}
