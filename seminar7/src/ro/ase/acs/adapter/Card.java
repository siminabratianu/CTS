package ro.ase.acs.adapter;

public class Card implements CardBancarr {
	private String titular;

	public Card(String titular) {
		this.titular = titular;
	}

	@Override
	public void platestePOS() {
		System.out.println(this.titular+"a platit cu cardul");
		
	}

	@Override
	public void platesteOnline() {
		System.out.println(this.titular+"a platit online");
		
	}

	public String getTitular() {
		return titular;
	}
	
	
	


}
