package clase;

public abstract class SpectatorAbstract {
	public abstract void asezareCoada();
	public abstract void prezintaBilet();
	public abstract void realizareControlComporal();
	public abstract void intraStadion();
	public abstract void ocupaLoc();
	//este final ca sa nu se schimbe metodele
	public final void intrareSpectatorStadion() {
		//aici se prezinta samblonul, se apeleaza metodele conform ordinii stabilita de catre template
		asezareCoada();
		prezintaBilet();
		realizareControlComporal();
		intraStadion();
		ocupaLoc();
		
	}

}
