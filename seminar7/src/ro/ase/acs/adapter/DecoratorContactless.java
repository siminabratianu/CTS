package ro.ase.acs.adapter;

public class DecoratorContactless extends DecoratorAbstract implements CardBancarr{

	public DecoratorContactless(CardBancarr card) {
		super(card);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void platesteContactless() {
		System.out.println(((Card)super.getCard()).getTitular()+"realizeaza o plata contactless");
		
	}

}
