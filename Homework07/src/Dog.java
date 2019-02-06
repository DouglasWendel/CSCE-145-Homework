/*
 * Douglas Wendel
 * CSCE 145
 * Homework 07
 */
public class Dog extends Animal{

	public int EnergyLevel;
	
	
	///////////////////////////////////
	///////////////////////////////////
	////		 Default		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////
	
	public Dog()
	{
		super();
		this.EnergyLevel = 0;
		
	}
	
	///////////////////////////////////
	///////////////////////////////////
	////	  Parameterized		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////	
	
	public Dog(String xName, int xWeight, int xEnergyLevel)
	{
		super(xName, xWeight);
		this.setEnergyLevel(xEnergyLevel);
	}
	
	//accessors and mutators
	
	public int getEnergyLevel()
	{
		return this.EnergyLevel;
	}
	
	public void setEnergyLevel(int xEnergyLevel)
	{
		if(xEnergyLevel > 0 && xEnergyLevel < 100)
		{
			this.EnergyLevel = xEnergyLevel;
		}
		else
		{
			this.EnergyLevel = 0; //resets
			System.out.println("Invalid"); //invalid output
		}
	}
	
	public String toString()
	{
		return "Energy Level: " +this.EnergyLevel;
	}
	
	
	public boolean Equals(Dog xDog)
	{
		if(this.EnergyLevel == xDog.getEnergyLevel())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
