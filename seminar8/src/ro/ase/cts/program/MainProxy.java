package ro.ase.cts.program;

import ro.ase.cts.clase.proxy.OperatorRezervari;
import ro.ase.cts.clase.proxy.ProxyOperatorRezervari;

public class MainProxy {

	public static void main(String[] args) {
	
		OperatorRezervari operatorRezervari = new OperatorRezervari();
		ProxyOperatorRezervari proxy = new ProxyOperatorRezervari(operatorRezervari, 4);
		
		proxy.realizeazaRezervare(4);

	}

	}


