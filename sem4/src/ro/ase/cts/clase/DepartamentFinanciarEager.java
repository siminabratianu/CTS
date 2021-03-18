package ro.ase.cts.clase;

public class DepartamentFinanciarEager {

	private int nrAngajati;
	private String director;
	private double salariuDeBaza;
	
	private static DepartamentFinanciarEager departamnetulFinanciarEager=new DepartamentFinanciarEager(10, "Popescu", 3000);
	
	private DepartamentFinanciarEager(int nrAngajati, String director, double salariuDeBaza) {
		super();
		this.nrAngajati = nrAngajati;
		this.director = director;
		this.salariuDeBaza = salariuDeBaza;
	}
	
	public static DepartamentFinanciarEager getInstance() {
		return departamnetulFinanciarEager;
	}

	@Override
	public String toString() {
		return "DepartamentFinanciarEager [nrAngajati=" + nrAngajati + ", director=" + director + ", salariuDeBaza="
				+ salariuDeBaza + "]";
	}

	public void setNrAngajati(int nrAngajati) {
		this.nrAngajati = nrAngajati;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setSalariuDeBaza(double salariuDeBaza) {
		this.salariuDeBaza = salariuDeBaza;
	}

	
	
	
	
}
