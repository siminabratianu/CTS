package ro.ase.cts.clase;

public class DepartamentFinanciar {

	private int nrAngajati;
	private String director;
	private double salariuDeBaza;
	
	private static DepartamentFinanciar departamnetulFinanciar= null;
	
	private DepartamentFinanciar(int nrAngajati, String director, double salariuDeBaza) {
		super();
		this.nrAngajati = nrAngajati;
		this.director = director;
		this.salariuDeBaza = salariuDeBaza;
	}
	
	public static synchronized DepartamentFinanciar getInstance(int nrAngajati, String director, double salariuDeBaza) {
		if(departamnetulFinanciar==null)
		{
			departamnetulFinanciar=new DepartamentFinanciar(nrAngajati, director, salariuDeBaza);
		}
		
		return departamnetulFinanciar;
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

	@Override
	public String toString() {
		return "DepartamentFinanciar [nrAngajati=" + nrAngajati + ", director=" + director + ", salariuDeBaza="
				+ salariuDeBaza + "]";
	}
	
	
	
	
}
