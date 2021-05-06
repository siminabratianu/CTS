package clase.chian;

public class ContCurent extends Handler {

	public ContCurent(float sold) {
	
		super(sold);
		
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold()>=suma)
		{
			System.out.println("S-a realizat plata in suma de  "+suma+"din contul curent");
			//super.setSold(suma)=super.getSold()-suma;
			float soldActual=super.getSold();
			soldActual=super.getSold()-suma;
			super.setSold(soldActual);
			//super.setSold(super.getSold()-suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
