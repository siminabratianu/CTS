package ro.ase.acs.simpleFactory;

public class Bracardier extends PersonalSpital{

	public Bracardier(String nume, int salariul) {
		super(nume, salariul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bracardier [getNume()=" + getNume() + ", getSalariul()=" + getSalariul() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
