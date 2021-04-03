package ro.ase.acs.builder.program;

import ro.ase.acs.builder.Rezervare;
import ro.ase.acs.builder.RezervareBuilder;
import ro.ase.acs.builder.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare=new Rezervare(1, false, true, true, false, "Jazz");
		System.out.println(rezervare.toString());
	
		Rezervare rezervare2=new RezervareBuilder().setCod(10).setBauturaRacoritoareInclusa(true).setMuzicaAmbientalaPersonalizata(true).buid();
		System.out.println(rezervare2.toString());
		
		Rezervare rezervare3=new RezervareBuilder().setCod(11).setScaunErgonomic(true).buid();
		Rezervare rezervare4=new RezervareBuilder().setGenMuzica("pop").buid();
		
		System.out.println(rezervare3);
		System.out.println(rezervare4);
		
		
		RezervareBuilderV2 builder=new RezervareBuilderV2().setBauturaRacoritoareInclusa(true).setMancareInclusa(true);
		//Rezervare rezervare5=builder.setCod(5).build();
		//System.out.println(rezervare5.toString());
	
	}

}
