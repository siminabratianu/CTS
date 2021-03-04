package sem1;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello");

		Zoo zoo= new Zoo();
		Zookeeper keeper=new Zookeeper();
		
		keeper.setName("Marcel");
		
		zoo.setKeeper(keeper);
		
		Zebra zebra1=new Zebra("zebra1");
		Zebra zebra2=new Zebra("zebra2");
		
		Girafa girafa1=new Girafa("Lily");
		Girafa girafa2=new Girafa("Kiki");
		
		zoo.add(zebra1);
		zoo.add(zebra2);
		zoo.add(girafa1);
		zoo.add(girafa2);
		zoo.feedAll();
	}

}
