package personalItemsPackage;

public class Motorcicle extends WheeledVehicle{

	protected String model_;
	
	public Motorcicle(Vehicle vehicle, int numberOfWheels, String model) {
		super(vehicle, numberOfWheels);
		
		if (numberOfWheels < 2 || numberOfWheels > 4)
			throw new IllegalArgumentException();
		
		model_ = model;
		
	}
	
	
	public String getModel() {	return model_;	}
	
	public String toString() {	return super.toString() + " Also, I'm a " + model_ + " Motorcicle";	}
	
	
	
}
