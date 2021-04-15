package ro.ase.cts.program;

import ro.ase.cts.clase.facade.Facade;

import ro.ase.cts.clase.facade.Masa;


public class MainFacade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GestionatMese gestionatMese= new GestionatMese();
//		Picolo picolo=new Picolo();
//		Masa masa=new Masa(4, 4);
//		
//		if(gestionatMese.estaMasaLibera(masa.getCod()))
//		{
//			if(picolo.esteMasaDebarasata(masa.getCod()))
//			{
//				if(picolo.areMasaServetele(masa.getCod()))
//				{
//					System.out.println("Poftiti la masa cu codul "+masa.getCod());
//				}
//				
//			}
//		}
//
//	}
	Masa masa=new Masa(5,10);
	if(Facade.potAsezaLaMasa(masa))
	{
		System.out.println("Poftiti la masa");
	}
	
	else {System.out.println("Mai asteptati");}
	
	}
}
