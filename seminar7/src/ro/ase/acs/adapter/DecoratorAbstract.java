package ro.ase.acs.adapter;

public abstract class DecoratorAbstract implements CardBancarr {

	private CardBancarr card;

	public DecoratorAbstract(CardBancarr card) {
		this.card = card;
	}
	
	public abstract void platesteContactless();

	@Override
	public void platestePOS() {
	this.card.platestePOS();
		
	}

	@Override
	public void platesteOnline() {
		this.card.platesteOnline();
		
	}

	public CardBancarr getCard() {
		return card;
	}
	
	
	
}
