package ro.ase.acs.builder;

public class RezervareBuilderV2 implements AbstractBuilder {
	
	private int cod;
	private boolean mancareInclusa;
	private boolean bauturaRacoritoareInclusa;
	private boolean scaunErgonomic;
	private boolean muzicaAmbientalaPersonalizata;
	private String genMuzica;
	
	public RezervareBuilderV2()
	{
		
	}

	public RezervareBuilderV2 setCod(int cod) {
		this.cod = cod;
		return this;
	}

	public RezervareBuilderV2 setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}

	public RezervareBuilderV2 setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
		this.bauturaRacoritoareInclusa = bauturaRacoritoareInclusa;
		return this;
	}

	public RezervareBuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}
	


	@Override
	public Rezervare buid() {
		// TODO Auto-generated method stub
		
		Rezervare rezervare=new Rezervare(cod, mancareInclusa, bauturaRacoritoareInclusa, scaunErgonomic, muzicaAmbientalaPersonalizata, genMuzica);
		return rezervare;
	}
	
	
}
