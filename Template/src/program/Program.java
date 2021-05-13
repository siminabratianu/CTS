package program;

import clase.Spectator;
import clase.SpectatorAbstract;
import clase.SpectatorVip;

public class Program {

	public static void main(String[] args) {
		Spectator spectator1=new Spectator("Gigel");
		SpectatorAbstract spectator2=new Spectator("Popescu");
		
		spectator1.intrareSpectatorStadion();
		spectator2.intrareSpectatorStadion();
		
		System.out.println(spectator1);
		System.out.println(spectator2);
		
		SpectatorVip spectator3=new SpectatorVip("Andrei");
		spectator3.intrareSpectatorStadion();
		System.out.println(spectator3);

	}

}
