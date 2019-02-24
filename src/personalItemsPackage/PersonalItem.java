package personalItemsPackage;

public abstract class PersonalItem {
	
	protected String name_;
	protected double value_;
	protected double weight_;

	
	
	public PersonalItem(String name, double value, double weight) {
		name_ 	= name;
		value_ 	= value;
		weight_ = weight;
	}
	
	public abstract String getName();
	public abstract double getValue();
	public abstract double getWeight();
	

}
