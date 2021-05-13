package clase;

public class ManagerSala extends ManagerSalaAbstracta{
	
//	private String tipMeci;
//
//	public ManagerSala(String tipMeci) {
//		super();
//		this.tipMeci = tipMeci;
//	}
	
	public void anuntaMeci(String tipMeci)
	{
		super.trimiteNotificare("Incepe meciul de "+tipMeci);
	}
	

}
