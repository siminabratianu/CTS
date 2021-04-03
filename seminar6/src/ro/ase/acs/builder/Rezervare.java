package ro.ase.acs.builder;

public class Rezervare {

	private int cod;
	private boolean mancareInclusa;
	private boolean bauturaRacoritoareInclusa;
	private boolean scaunErgonomic;
	private boolean muzicaAmbientalaPersonalizata;
	private String genMuzica;
	
	
	
	
	
	
	public Rezervare(int cod, boolean mancareInclusa, boolean bauturaRacoritoareInclusa, boolean scaunErgonomic,
			boolean muzicaAmbientalaPersonalizata, String genMuzica) {
		super();
		this.cod = cod;
		this.mancareInclusa = mancareInclusa;
		this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
		this.genMuzica = genMuzica;
	}
	
	






	public void setCod(int cod) {
		this.cod = cod;
	}








	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}








	public void setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
		this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
	}








	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}








	public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
	}








	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}








	@Override
	public String toString() {
		return "Rezervare [cod=" + cod + ", mancareInclusa=" + mancareInclusa + ", bauturaRacoritoareInclusa="
				+ bauturaRacoritoareInclusa + ", scaunErgonomic=" + scaunErgonomic + ", muzicaAmbientalaPersonalizata="
				+ muzicaAmbientalaPersonalizata + ", genMuzica=" + genMuzica + "]";
	}
	
	
}
