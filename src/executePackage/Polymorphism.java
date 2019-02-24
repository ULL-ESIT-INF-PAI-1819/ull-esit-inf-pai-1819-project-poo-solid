package executePackage;
import java.util.Scanner;
import javax.management.InstanceAlreadyExistsException;
import personPackage.*;

public class Polymorphism {

	public static void main(String[] args) {
		try {
			Scanner enter = new Scanner(System.in);
			
			System.out.println("We create the segredo Object");
			System.out.println("Segredo segredo = new Segredo(20, 1.68, 60, 75);");
			Segredo segredo = new Segredo(20, 1.68, 60, 75);
			enter.nextLine();
			System.out.println("Who are you?");
			enter.nextLine();
		
			System.out.println(segredo.toString());
			
			enter.nextLine();
			
			
			//Can we do this?
			System.out.println("Can we do this?");
			System.out.println("Sensei nuevoSensei = segredo;");
			enter.nextLine();
			Sensei nuevoSensei = segredo;
			System.out.println(nuevoSensei.toString());
			
			enter.nextLine();
			
			System.out.println("\n\nEND");
			
			Segredo otroSegredo = new Segredo(22, 1.68, 60, 75);
			enter.close();
			
		}
		catch (InstanceAlreadyExistsException e) {
			System.err.println("You can't instance more than one Segredo!");
		}

		
	}

}
