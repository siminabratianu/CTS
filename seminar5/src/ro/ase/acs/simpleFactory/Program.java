package ro.ase.acs.simpleFactory;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			FactoryPersonal factory=new FactoryPersonal();
			PersonalSpital personal1;
			PersonalSpital personal2;
			personal1=factory.createPersonal(TipPersonal.Medic, "Ion", 15000);
			personal2=factory.createPersonal(TipPersonal.Asistent, "Maria", 17000);
			System.out.println(personal1);
			System.out.println(personal2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
