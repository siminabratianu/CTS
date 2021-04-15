package ro.ase.cts.clase.proxy;

public class ProxyOperatorRezervari implements OperatorRezervare{
	private OperatorRezervare operator;
	private int nrMinimPersoane;
	
	




	public ProxyOperatorRezervari(OperatorRezervare operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane = nrMinimPersoane;
	}






	@Override
	public void realizeazaRezervare(int nrPersoane) {
	if(nrPersoane>=nrMinimPersoane)
	{
		operator.realizeazaRezervare(nrPersoane);
	}
	else {
		System.out.println("Va rugam veniti la restaurant fara rezervare!");
	}
		
	}

}
