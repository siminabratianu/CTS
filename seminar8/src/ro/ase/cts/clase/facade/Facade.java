package ro.ase.cts.clase.facade;

public class Facade {

	public static boolean potAsezaLaMasa(Masa masa) {
	GestionatMese gestionatMese= new GestionatMese();
	Picolo picolo=new Picolo();
	
	
	if(gestionatMese.estaMasaLibera(masa.getCod()))
	{
		if(picolo.esteMasaDebarasata(masa.getCod()))
		{
			if(picolo.areMasaServetele(masa.getCod()))
			{
				return true;
			}
			return false;
			
		}
		return false;
	}
	return false;

}
}
