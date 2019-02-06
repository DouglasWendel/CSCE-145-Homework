//DouglasWendel 


public class Cat extends Animal{

	private String Mood;
	
	///////////////////////////////////
	///////////////////////////////////
	////		 Default		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////
	
	public Cat()
	{
		super();
		this.Mood = "happy";
	}
	
	///////////////////////////////////
	///////////////////////////////////
	////	  Parameterized		  /////
	////       Constructor	      /////
	///////////////////////////////////
	///////////////////////////////////	
	
		public Cat(String xName, int xWeight, String xMood)
	{
		super(xName, xWeight);
		this.setMood(xMood);
	}
	
	//accessors and mutators 
	public String getMood()
	{
		return this.Mood;
	}
	
	public void setMood(String xMood)
	{
		if(xMood.equalsIgnoreCase("Sleepy") || xMood.equalsIgnoreCase("Playful")|| xMood.equalsIgnoreCase("Hungry"))
		{
			this.Mood = xMood;
		}
		else
		{
			this.Mood = null;
		}
	}
	
	public String toString()
	{
		return "Mood: " +this.Mood;
	}
	
	public boolean Equals(Cat xCat)
	{
		if(this.Mood == xCat.getMood())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
