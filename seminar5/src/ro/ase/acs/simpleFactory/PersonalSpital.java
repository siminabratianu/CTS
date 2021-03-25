package ro.ase.acs.simpleFactory;

public abstract class PersonalSpital {

	private String nume;
	private int salariul;
	
	
	public PersonalSpital(String nume, int salariul) {
		super();
		this.nume = nume;
		this.salariul = salariul;
	}
	public String getNume() {
		return nume;
	}
	public int getSalariul() {
		return salariul;
	}
	
	
}
