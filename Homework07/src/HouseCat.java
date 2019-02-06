
//Douglas Wendel
public class HouseCat extends Cat{

	private String Type;
	
	///////////////////////////////////
	///////////////////////////////////
	////		 Default		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////
	
	public HouseCat()
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
	public HouseCat(String xName, int xWeight, String xMood, String xType)
	{
		super(xName, xWeight, xMood);
		this.setType(xType);
	}
	
	public String getType()
	{
		return this.Type;
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Short Hair")||xType.equalsIgnoreCase("Bombay")||xType.equalsIgnoreCase("Ragdoll")||
				xType.equalsIgnoreCase("Sphinx")||xType.equalsIgnoreCase("Scottish Fold"))
		{
			this.Type = xType;
		}
		else
		{
			this.Type = null;
		}
				
	}
	
	public String toString()
	{
		return "Name: " +this.getName() + "\nWeight: "+this.getWeight()+"\nMood: "+this.getMood() + "\nType: " +this.getType();
	}
	
	public boolean Equals(HouseCat xHouseCat)
	{
		if(this.Type == xHouseCat.getType())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
}
