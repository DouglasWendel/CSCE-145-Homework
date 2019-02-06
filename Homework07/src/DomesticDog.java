//douglas


public class DomesticDog extends Dog {

	private String Type;
	
	///////////////////////////////////
	///////////////////////////////////
	////		 Default		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////
	
	public DomesticDog()
	{
		super();
		this.Type = "nothing";
		
	}
	
	///////////////////////////////////
	///////////////////////////////////
	////	  Parameterized		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////	
	
	public DomesticDog(String xName, int xWeight, int xEnergyLevel ,String xType)
	{
		super(xName, xWeight, xEnergyLevel);
		this.setType(xType);
	}
	
	//accessors and mutators
	
	public String getType()
	{
		return this.Type;
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Retriever")||xType.equalsIgnoreCase("Terrier")||xType.equalsIgnoreCase("Husky")||xType.equalsIgnoreCase("Yappy")&& xType.equalsIgnoreCase("Mutt"))
		{
			this.Type = xType;
		}
	}
	
	
	//methods
	
	public String toString() //prints name weight energy level and pack leader name
	{
		return "Name: "+this.getName()+"\nWeight: " +this.getWeight()+"\nEnergy Level: " +this.getEnergyLevel() + "\nType " +this.Type;
	}
	
	public boolean Equals(DomesticDog xDomesticDog)
	{
		if(this.Type == xDomesticDog.getType())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
