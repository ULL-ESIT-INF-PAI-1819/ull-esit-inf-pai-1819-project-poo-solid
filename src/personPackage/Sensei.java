package personPackage;

/**
 * 
 * @author Tomás González Martín
 * @author Alberto Delgado Soler
 *
 */
public class Sensei extends Person{

	private double lvlOfExperience_;

	
	public Sensei(String name, int age, double height, double weight, double experience) {
		super(name, age, height, weight);
		lvlOfExperience_ = experience;
	}
	
	
	public String getName() 		{	return name_;	}
	public int getAge() 			{	return age_;	}
	public double getHeight() 		{	return height_;	}
	public double getWeight() 		{	return weight_;	}
	public double getExperience()	{	return lvlOfExperience_; }
	
	
	public String toString() {			return "I am " + name_ + " and I'm a Sensei";	}
	
}
