package ro.ase.acs.simpleFactory;

public class Asistent extends PersonalSpital {

	public Asistent(String nume, int salariul) {
		super(nume, salariul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Asistent [getNume()=" + getNume() + ", getSalariul()=" + getSalariul() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
