
public class Wolf extends Dog {

	private String PackLeaderName;
	
	///////////////////////////////////
	///////////////////////////////////
	////		 Default		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////
	public Wolf()
	{
		super();
		this.PackLeaderName = "nothing";
	}
	
	///////////////////////////////////
	///////////////////////////////////
	////	  Parameterized		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////	
	
	public Wolf(String xName, int xWeight, int xEnergyLevel ,String xPackLeaderName)
	{
		super(xName, xWeight, xEnergyLevel);
		this.setPackLeaderName(xPackLeaderName);
	}
	
	//accessors and mutators
	public String getPackLeaderName()
	{
		return this.PackLeaderName;
	}
	
	public void setPackLeaderName(String xPackLeaderName)
	{
		this.PackLeaderName = xPackLeaderName;
	}
	
	//methods
	public String toString() //prints message of name weight energy level and pack learder name
	{
		return "Name: "+this.getName()+"\nWeight: " +this.getWeight()+"\nEnergy Level: " +this.getEnergyLevel() + "\nPack Leader Name: " +this.PackLeaderName;
	}
	
	
	
	
	
	
	
}
