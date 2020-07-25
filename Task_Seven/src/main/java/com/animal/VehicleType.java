package com.animal;

public class VehicleType {
	public Vehicle getInstance(String s)
	{
		if(s.equals("small"))
			return new Bike();
		else if(s.equals("large"))
			return new Car();
		else
			return new Auto();
	}

}
