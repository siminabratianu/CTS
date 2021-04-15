package ro.ase.cts.clase.facade;
class Picolo {
	public boolean esteMasaDebarasata(int cod)
	{
		if(cod%4==0)
		{
			return true;
		}
		return false;
		
	}
	public boolean areMasaServetele(int cod)
	{
		if(cod%3==0)
		{
			return true;
		}
		return false;
	}

}
