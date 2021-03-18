package ro.ase.cts.clase;

public class Biserica {

	private String slujba;
	private int nrPomelnic;
	private int nrLumanari;
	
	private static Biserica biserica=null;
	 
	public static synchronized Biserica getInstBiserica(String slujba,int nrPomelnic, int nrLumanari) {
		if(biserica==null)
		{
			biserica=new Biserica(slujba, nrPomelnic, nrLumanari);
		}
		return biserica;
	}
	
	
	private Biserica(String slujba, int nrPomelnic, int nrLumanari) {
		super();
		this.slujba = slujba;
		this.nrPomelnic = nrPomelnic;
		this.nrLumanari = nrLumanari;
	}



	public void setSlujba(String slujba) {
		this.slujba = slujba;
	}
	public void setPomelnic(int pomelnic) {
		this.nrPomelnic = pomelnic;
	}
	public void setLumanari(int lumanari) {
		this.nrLumanari = lumanari;
	}
	@Override
	public String toString() {
		return "Biserica [slujba=" + slujba + ", pomelnic=" + nrPomelnic + ", lumanari=" + nrLumanari + "]";
	}
	
	
	
}
