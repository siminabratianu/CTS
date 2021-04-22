package ro.ase.cts.strategy.clase;

public class Cash implements ModalitatePlata {

	@Override
	public void plateste(double sumaPlatita) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata plata cu cardul pentru suma de "+sumaPlatita);
		
	}

}
