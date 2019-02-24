package personalItemsPackage;

import java.time.*;

public class Watch extends PersonalItem{
	
	protected LocalTime localTime_;
	
	
	public Watch(String name, double value, double weight) {
		super(name, value, weight);
		localTime_ = LocalTime.now();
	}
	
	
	public String getName() 		{	return name_;	}
	public double getValue() 		{	return value_;	}
	public double getWeight()		{	return weight_;	}
	
	public String whatTimeIsIt()	{	return localTime_.getHour() + ":" + localTime_.getMinute();	}
	
	public String toString()		{	
		
		String output = "It's " + whatTimeIsIt();
		if (localTime_.getHour() < 12)
			output += " am";
		else
			output += " pm";
		
		return output;
	}
	
	

}
