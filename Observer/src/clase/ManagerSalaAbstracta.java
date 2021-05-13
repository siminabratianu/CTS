package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSalaAbstracta {
	
	public List<Observer> clientiFideli;
	
	

	public ManagerSalaAbstracta() {
		super();
	}

	public ManagerSalaAbstracta(List<Observer> clientiFideli) {
		super();
		this.clientiFideli = new ArrayList<>();
	}
	
	public void adaugaAbonat(Observer abonat)
	{
		clientiFideli.add(abonat);
	}
	
	public void stergeAbonat(Observer abonat)
	{
		clientiFideli.remove(abonat);
	}
	
	public void trimiteNotificare(String mesaj)
	{
		for(Observer client: clientiFideli)
		{
			client.primesteMesaj(mesaj);
		}
	}
	
	

}
