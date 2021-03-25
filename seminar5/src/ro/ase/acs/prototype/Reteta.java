package ro.ase.acs.prototype;

public class Reteta implements RetetaMedicament {
	private String solutie;
	private int cantitate;
	
	
	
	
	public Reteta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reteta(String solutie, int cantitate) {
		super();
		this.solutie = solutie;
		this.cantitate = cantitate;
	}
	public String getSolutie() {
		return solutie;
	}
	public int getCantitate() {
		return cantitate;
	}
	@Override
	public String toString() {
		return "Reteta [solutie=" + solutie + ", cantitate=" + cantitate + "]";
	}
	
	@Override
	public RetetaMedicament copiaza() {
		
		Reteta reteta=new Reteta();
		reteta.solutie=this.solutie;
		reteta.cantitate=this.cantitate;
		return reteta;
	}

	
	
}
