package ro.ase.acs.cts.clase.command;

public class ComandaRetragere extends Comanda{

	@Override
	public void executa() {
		super.contBancar.retragere(super.suma);
		
	}
	
	public ComandaRetragere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}

}


