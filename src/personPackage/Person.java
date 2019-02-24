package personPackage;

/**
 * 
 * @author Tomás González Martín
 * @author Alberto Delgado Soler
 *
 */
public abstract class Person {
	
	protected String name_;
	protected int age_;
	protected double height_;
	protected double weight_;
	
	public Person(String name, int age, double height, double weight) {
		name_ 	= name;
		age_ 	= age;
		height_ = height;
		weight_ = weight;
	}
	
	public abstract String getName();
	public abstract int getAge();
	public abstract double getHeight();
	public abstract double getWeight();
	
}
