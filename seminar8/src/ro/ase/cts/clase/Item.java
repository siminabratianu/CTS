package ro.ase.cts.clase;

public class Item implements ComponentaAbstracta{
	private String nume;

	public Item(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("item: "+nume);
		
	}

	@Override
	public void addComponenta(ComponentaAbstracta componentaAbstracta) throws Exception {
		throw new Exception("Nu este implementat");
		
	}

	@Override
	public void stergeComponenta(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException();
		
	}

	@Override
	public ComponentaAbstracta getComponenta(int pozitie) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException();
		
	}
	
	
}
