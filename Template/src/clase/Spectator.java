package clase;

public class Spectator extends SpectatorAbstract{
	
	private String nume;
	

	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println("Spectatorul "+nume+" se aseaza la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println("Spectatorul "+nume+" prezinta biletul");
	}

	@Override
	public void realizareControlComporal() {
		System.out.println("Spectatorul "+nume+" asteapta sa i se faca realizarea coporala");
		
	}

	@Override
	public void intraStadion() {
		System.out.println("Spectatorul "+nume+" intra pe stadion");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul "+nume+" ocupa loc");
		
	}
	

}
