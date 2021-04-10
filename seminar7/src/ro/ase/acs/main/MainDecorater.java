package ro.ase.acs.main;

import ro.ase.acs.adapter.Card;
import ro.ase.acs.adapter.DecoratorContactless;

public class MainDecorater {

	public static void main(String[] args) {
		Card card=new Card ("Popescu Alina");
		card.platesteOnline();
		card.platestePOS();
		System.out.println("............");
		DecoratorContactless decoratorContactless=new DecoratorContactless(card);
		decoratorContactless.platesteContactless();
		decoratorContactless.platesteOnline();

	}

}
