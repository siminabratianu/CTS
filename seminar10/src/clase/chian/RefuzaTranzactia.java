package clase.chian;

public class RefuzaTranzactia extends Handler{

	public RefuzaTranzactia() {
		super(0);
	
	}

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Plata nu poate sa fie realizata!");
		
	}
	

}
