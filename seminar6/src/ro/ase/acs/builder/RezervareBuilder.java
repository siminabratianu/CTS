package ro.ase.acs.builder;

public class RezervareBuilder implements AbstractBuilder{

	public Rezervare rezervare;
	
	
	
	public RezervareBuilder() {
		rezervare=new Rezervare(0, false, false, false, false, "");
	}
	
	
	
	@Override
	public Rezervare buid() {
		
		return rezervare;
		
	}
	

	public RezervareBuilder setCod(int cod) {
		rezervare.setCod(cod);
		return this;
	}

	public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
		this.rezervare.setMancareInclusa(mancareInclusa);
		return this;
	}


	public RezervareBuilder setBauturaRacoritoareInclusa(boolean bauturaRacoritoareInclusa) {
		this.rezervare.setBauturaRacoritoareInclusa(bauturaRacoritoareInclusa);;
		return this;
	}

	public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
		this.rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}


	public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
	return this;
	}
		
		public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}




	

	
	
}
