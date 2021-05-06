package main.chain;

import clase.chian.ContCredit;
import clase.chian.ContCurent;
import clase.chian.ContEconomii;
import clase.chian.Handler;
import clase.chian.RefuzaTranzactia;

public class Program {

	public static void main(String[] args) {
		Handler contCredit=new ContCredit(5000);
		Handler contCurent=new ContCurent(2000);
		Handler contEconomii= new ContEconomii(2100);
		Handler refuzaTranzactia=new RefuzaTranzactia();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCurent);
		contCredit.setSuccesor(refuzaTranzactia);
		contCurent.realizeazaPlata(5000);
	}

}
