package program;

import clase.ClientFidel;
import clase.ManagerSala;
import clase.ManagerSalaAbstracta;
import clase.Observer;

public class Program {

	public static void main(String[] args) {
		Observer c1=new ClientFidel("Popescu");
		Observer c2=new ClientFidel("Georgescu");
		Observer c3=new ClientFidel("Gigel");
		Observer c4=new ClientFidel("Andrei");

		ManagerSala manager=new ManagerSala();
		manager.adaugaAbonat(c1);
		manager.adaugaAbonat(c2);
		manager.adaugaAbonat(c3);
		manager.adaugaAbonat(c4);
		
		
	}

}
