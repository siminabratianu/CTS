package ro.ase.cts.main.command;

import ro.ase.acs.cts.clase.command.ComandaConstituire;
import ro.ase.acs.cts.clase.command.ComandaDepunere;
import ro.ase.acs.cts.clase.command.ComandaRetragere;
import ro.ase.acs.cts.clase.command.ContBancar;
import ro.ase.acs.cts.clase.command.ManagerComenzi;

public class Program {

	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		ContBancar contBancar = new ContBancar("Teo", 0);
		managerComenzi.invoca(new ComandaConstituire(contBancar, 1000));
		managerComenzi.invoca(new ComandaDepunere(contBancar, 200));
		managerComenzi.executaComanda();
		
		managerComenzi.invoca(new ComandaRetragere(contBancar, 500));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();

	}

}
