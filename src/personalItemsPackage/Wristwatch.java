package personalItemsPackage;

public class Wristwatch extends Watch{
	
	protected String brand_;
	
	public Wristwatch(String name, double value, double weight, String brand) {
		super(name, value, weight);
		brand_ = brand;
	}
	
	
	public String toString() {	return super.toString() + "\nI saw it in my wristwatch (" + brand_ + ")"; 	};

}
