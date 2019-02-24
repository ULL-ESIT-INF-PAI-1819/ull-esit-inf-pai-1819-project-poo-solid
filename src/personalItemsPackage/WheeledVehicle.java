package personalItemsPackage;

public class WheeledVehicle extends Vehicle{
	
	protected int numberOfWheels_;
	
	public WheeledVehicle(Vehicle vehicle, int numberOfWheels) {
		super(vehicle);
		numberOfWheels_ = numberOfWheels;
	}
	
	public int getNumberOfWheels() 	{	return numberOfWheels_; }
	public String toString()		{	return super.toString() + " and I have " + numberOfWheels_ + " wheels.";	}

}
