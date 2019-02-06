//Douglas Wendel

public class Animal {

	private String Name;
	private double Weight;
	
	
	///////////////////////////////////
	///////////////////////////////////
	////		 Default		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////
	
	public Animal()
	{
		this.Name = "Doug";
		this.Weight = 0;
		
	}
	
	///////////////////////////////////
	///////////////////////////////////
	////	  Parameterized		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////	
		
	public Animal(String xName, double xWeight)
	{
		this.setName(xName);
		this.setWeight(xWeight);
	}
	
	//accessors
	
	public String getName()
	{
		return this.Name;
		
	}
	
	public double getWeight()
	{
		return this.Weight;
		
	}
	
	//mutators
	
	public void setName(String xName)
	{
		this.Name = xName;
	}
	
	
	public void setWeight(double xWeight)
	{
		if(xWeight > 0)
		{
			this.Weight = xWeight;
		}
	}
	
	//methods
	public String toString(Animal xWeight, Animal xName) //prints name and weight
	{
		return "Name: "+ Name + "\nWeight: " +Weight;
		
	}
	
	public boolean Equals(Animal xAnimal) //boolean to test
	{
		if(this.Name.equalsIgnoreCase(xAnimal.getName()) && this.Weight == xAnimal.getWeight())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
}
