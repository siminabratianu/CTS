package ro.ase.cts.state.Main;

import ro.ase.cts.state.Masa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Masa masa=new Masa(7);
		masa.eliberareMasa();
		masa.rezervaMasa();
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.ocupaMasa();
		masa.eliberareMasa();
	}

}
