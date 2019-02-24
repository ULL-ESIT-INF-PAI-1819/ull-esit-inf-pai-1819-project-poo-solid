package personalItemsPackage;

public class WaterVehicle extends Vehicle{

	protected double lenght_;
	protected double keelLenght_;
	
	public WaterVehicle(Vehicle vehicle, double lenght, double keelLenght) {
		super(vehicle);
		lenght_ = lenght;
		keelLenght_ = keelLenght;
	}
	
	public double getLenght() 		{	return lenght_; }
	public double getKeelLenght()	{	return keelLenght_;	}
	public String toString()		{	return super.toString() + " and I'm a boat";	}
}
