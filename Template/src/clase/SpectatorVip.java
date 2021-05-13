package clase;

public class SpectatorVip extends SpectatorAbstract{
	
	private String nume;
	
	

	public SpectatorVip(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println("Spectatorul "+nume+" se prezinta direct la usa");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println("Spectatorul "+nume+" prezinta biletul VIP");
		
		
	}

	@Override
	public void realizareControlComporal() {
		System.out.println("Spectatorul "+nume+" asteapta sa i se faca realizarea coporala");
		
		
	}

	@Override
	public void intraStadion() {
		System.out.println("Spectatorul "+nume+" intra pe la sectiunea VIP");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul "+nume+" ocupa loc in loja");
		
		
	}

}
