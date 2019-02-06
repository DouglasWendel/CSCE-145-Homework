

//done

public class Lepord extends Cat {

	private int NumberOfSpots;
	
	///////////////////////////////////
	///////////////////////////////////
	////		 Default		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////
	
	public Lepord()
	{
		super();
		this.NumberOfSpots = 0;
	}
	
	///////////////////////////////////
	///////////////////////////////////
	////	  Parameterized		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////	
	
	public Lepord(String xName, int xWeight, String xMood ,int xNumberOfSpots)
	{
		super(xName, xWeight, xMood);
		this.setNumberOfSpots(xNumberOfSpots);
	}
	
	//accessors and mutators
	
	public int getNumberOfSpots()
	{
		return this.NumberOfSpots;
	}
	
	public void setNumberOfSpots(int xNumberOfSpots)
	{
		if(NumberOfSpots > 0) //if the number of spots is greater than 0
		{
			this.NumberOfSpots = xNumberOfSpots;
		}
	}
	
	//method 
	
	public String toString()//print method
	{
		return "Name: " +this.getName() + "\nWeight: " +this.getWeight() + "\nMood: " +this.getMood()
				+ "\nNumber of Spots: " +this.getNumberOfSpots();
	}
	
	public boolean Equals(Lepord xLepord) //number of spots boolean
	{
		if(this.NumberOfSpots == xLepord.getNumberOfSpots())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
