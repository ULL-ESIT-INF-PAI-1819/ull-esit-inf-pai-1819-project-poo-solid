package personalItemsPackage;

public class Vehicle extends PersonalItem{
	
	public final String KIND = "Vehicle";
	protected String brand_;
	
	public Vehicle(String name, double value, double weight, String brand) {
		super(name, value, weight);
		brand_ = brand;
	}
	
	
	public Vehicle(Vehicle vehicle) {
		super(vehicle.name_, vehicle.value_, vehicle.weight_);
		brand_ = vehicle.brand_;
	}
	
	
	public String getName() 	{	return name_;	}
	public double getValue() 	{	return value_;	}
	public double getWeight()	{	return weight_;	}
	public String getBrand()	{	return brand_;	}
	
	public String toString()	{	return "I'm a " + brand_ + " " + KIND; }
	
	

}
