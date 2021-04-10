package ro.ase.acs.clase;

public class AdapterLeasingClase extends Leasing implements Creditable {

	public AdapterLeasingClase(String numeClient, int suma) {
		super(numeClient, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crediteaza() {
		// TODO Auto-generated method stub
		super.oferaLeasing();
		
		
	}

}
