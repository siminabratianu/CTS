package ro.ase.acs.factoryMethod.clase;

public class Medic extends PersonalSpital{

	public Medic(String nume, int salariul) {
		super(nume, salariul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medic [getNume()=" + getNume() + ", getSalariul()=" + getSalariul() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
