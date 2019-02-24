package personPackage;

import personalItemsPackage.PersonalItem;
import javax.management.InstanceAlreadyExistsException;
import java.util.*;


/**
 * 
 * @author Tomás González Martín
 * @author Alberto Delgado Soler
 *
 */
public class Segredo extends Sensei{

	private ArrayList<PersonalItem> personalItems_;
	private static int segredoCounter_ = 0;
	
	public Segredo(int age, double height, double weight, double experience) throws InstanceAlreadyExistsException {
		
		super("Segredo", age, height, weight, experience);
		segredoCounter_++;
		if (segredoCounter_ != 1)
			throw new InstanceAlreadyExistsException();
		personalItems_ = new ArrayList<PersonalItem>();
		
	}
	
	public Segredo(Segredo otherSegredo) throws InstanceAlreadyExistsException {
		super("0",0,0,0, 0);
		segredoCounter_++;
		throw new InstanceAlreadyExistsException();
		
	}
	
	public void setPersonalItem(PersonalItem personalItem) {
		personalItems_.add(personalItem);
	}
	
	public ArrayList<PersonalItem> getPersonalItems(){
		return personalItems_;
	}
	
	
}
