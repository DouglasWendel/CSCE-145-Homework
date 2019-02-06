/*
 * Douglas Wendel
 * Homework 06
 */
public class Clothing {
	
	
	private String Type;
	private String Color;
	
	
	
	
	//Default Constructor
	public Clothing()
	{
		this.Type = "Nothing";
		this.Color = "Black";
	}
	
	//Parameterized constructor
	
	public Clothing(String xType, String xColor)
	{
		this.setType(xType);
		this.setColor(xColor);
		
	}
	
	//accessors and mutators
	
	public String getType()
	{
		return this.Type;
	}
	public String getColor()
	{
		return this.Color;
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Undergarment") || xType.equalsIgnoreCase("Socks")|| 
				xType.equalsIgnoreCase("Stockings")||xType.equalsIgnoreCase("Top")|| 
				xType.equalsIgnoreCase("Bottom")||xType.equalsIgnoreCase("Cape"))
		{
			this.Type = xType;
		}
		else
		{
			this.Type = null;
		}
	}
	
	public void setColor(String xColor)
	{
		if(xColor.equalsIgnoreCase("Brown")||xColor.equalsIgnoreCase("Red")||xColor.equalsIgnoreCase("Pink")||xColor.equalsIgnoreCase("Orange")
				||xColor.equalsIgnoreCase("Green")||xColor.equalsIgnoreCase("Blue")||xColor.equalsIgnoreCase("Purple")||xColor.equalsIgnoreCase("Grey"))
		{
			this.Color = xColor;
		}
		else
		{
			this.Color = null;
		}
	}
	
	
	//Methods
	
	public String toString(Clothing xClothing)
	{
		return "Type: "+this.Type+ "Color" +this.Color;
	}
	
	public boolean equals(Clothing xClothing)
	{
		return xClothing!=null && this.Type.equals(xClothing.getType()) && this.Color.equals(xClothing.getColor());
	}


	
	
	
	
	
	

}
