package executePackage;
import personalItemsPackage.*;

import java.util.Scanner;


public class Inheritance {

	public static void main(String[] args) {

		Scanner enter = new Scanner(System.in);
		
		System.out.println("We create a vehicle");
		System.out.println("Vehicle vehicle = new Vehicle(\"My vehicle\", 13799, 312, \"Kawasaki\");");
		Vehicle vehicle = new Vehicle("My vehicle", 13799, 312, "Kawasaki");
		enter.nextLine();
		
		System.out.println("Then, create a Motorcicle");
		System.out.println("Motorcicle motorcicle = new Motorcicle(vehicle, 2, \"Z1000\");");
		Motorcicle motorcicle = new Motorcicle(vehicle, 2, "Z1000");
		enter.nextLine();

		
		
		System.out.println("What are you? (vehicle)");
		enter.nextLine();
		System.out.println(vehicle.toString());
		enter.nextLine();
		System.out.println("What are you? (motorcicle)");
		enter.nextLine();
		System.out.println(motorcicle.toString());
		enter.nextLine();

		
		System.out.println("\n\nEND");
		
			
		enter.close();

		
	}

}
