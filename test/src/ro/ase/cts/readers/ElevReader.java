package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends AplicantReader{
	public ElevReader(String numeFisier) {
		super(numeFisier);
		// TODO Auto-generated constructor stub
	}

	public  List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.numeFisier));
		input2.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			   
			Elev elev=new Elev();
			int clasa = input2.nextInt();
			String tutore = input2.next();
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		input2.close();
		return elevi;
	}
}