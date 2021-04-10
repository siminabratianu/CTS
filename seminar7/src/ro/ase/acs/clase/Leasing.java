package ro.ase.acs.clase;

public class Leasing {
private String numeClient;
private int suma;



public Leasing(String numeClient, int suma) {
	super();
	this.numeClient = numeClient;
	this.suma = suma;
}



public void oferaLeasing()
{
	System.out.println("Pentru clientul"+this.numeClient+"a fost oferit un lessing de "+this.suma+"euro");
	}

}