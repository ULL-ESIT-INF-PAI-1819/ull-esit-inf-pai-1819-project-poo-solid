package executePackage;
import java.util.Scanner;
import javax.management.InstanceAlreadyExistsException;
import personPackage.*;
import personalItemsPackage.Motorcicle;
import personalItemsPackage.Vehicle;
import personalItemsPackage.Wristwatch;

public class Abstraction {

	public static void main(String[] args) {
		try {
			Scanner enter = new Scanner(System.in);
			
			System.out.println("We create the segredo Object");
			System.out.println("Segredo segredo = new Segredo(20, 1.68, 60, 75);");
			Segredo segredo = new Segredo(20, 1.68, 60, 75);
			enter.nextLine();
			
			System.out.println("Now Segredo has 2 personal items:");
			System.out.println(" · Kawasaki Z1000");
			System.out.println(" · A Wristwatch");
			enter.nextLine();
			// Kawasaki Z1000
			Vehicle vehicle = new Vehicle("My vehicle", 13799, 312, "Kawasaki");
			Motorcicle motorcicle = new Motorcicle(vehicle, 2, "Z1000");
	
			// Wristwatch
			Wristwatch wristwatch = new Wristwatch("Watch", 73.95, 0.85, "Ruhla Gardé");
			
			segredo.setPersonalItem(wristwatch);
			segredo.setPersonalItem(motorcicle);
			
			System.out.println("Segredo... what time is it?");
			enter.nextLine();
			System.out.println(segredo.getPersonalItems().get(0));			
			
			System.out.println("\n\nEND");
			
			//Segredo otroSegredo = new Segredo(22, 1.68, 60, 75);
			enter.close();
			
		}
		catch (InstanceAlreadyExistsException e) {
			System.err.println("You can't instance more than one Segredo!");
		}
	

		
	}

}
