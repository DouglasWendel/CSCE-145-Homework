/*
 * Douglas Wendel
 * Homework 06
 */
public class Dresser extends Clothing {
	
	private Clothing Clothes [][] = new Clothing [5][10];
	
	public Dresser()
	{
		this.Clothes = new Clothing[5][10];
	}
	
	//methods
	/*
	 * this allows the user to add clothing to each drawer they are specificially assigned to. Drawers 0-4 all have assigned clothing
	 * types and this will allow the user to then in the output message see what clothes are where and what colors they are. 
	 */
	public void Add(Clothing xClothing)
	{
		if(xClothing != null)
		{
			if(xClothing.getType().equalsIgnoreCase("Undergarment"))//undergarment class
			{
				for(int i = 0; i<=10; i++)
				{
					if(i>=9)
					{
						System.out.println("You cant fit any more clothes"); //this prints that the user cannot put any more clothes in the drawers once they are full.
						return;
					}
					else
					{
						if(Clothes[0][i] == null)
						{
							Clothes[0][i] = xClothing;
							return;
						}
							
					}
				}
			}
			else if(xClothing.getType().equalsIgnoreCase("Socks")||xClothing.getType().equalsIgnoreCase("Stockings"))//stockings and socks class
			{				{
					for(int i = 1; i<=10;i++)
					{
						if(i>=9)
						{
							System.out.println("You cant fit any more clothes");//when the maximum number of stockings and socks are in the drawer this will print
							return;
						}
						else
						{
							if(Clothes[1][i] == null)
							{
								Clothes [1][i] = xClothing;
								return;
							}
						}
					}
				}
			}
			
			else if(xClothing.getType().equalsIgnoreCase("Top"))//tops class
			{
				for(int i = 2; i<=10;i++)
				{
					if(i>=9)
					{
						System.out.println("You cant fit any more clothes");//when the maximum number of tops are in the drawer this message is outputted
					}
					else
					{
						if(Clothes[2][i] == null)
						{
							Clothes [2][i] = xClothing;
							return;
						}
					}
				}
				
			}
			
			else if(xClothing.getType().equalsIgnoreCase("Bottom"))
			{
				for(int i = 3; i <=10; i++)
				{
					if(i>=9)
					{
						System.out.println("You cannot fit any more clothes"); //when the maximum numbe rof bottoms are in the drawer this message is outputted
					}
					else
					{
						if(Clothes[3][i] == null)
						{
							Clothes [3][i] = xClothing;
							return;
						}
					}
				}
			}
			
			else if(xClothing.getType().equalsIgnoreCase("Cape"))
			{
				for(int i = 4; i <=10; i++)
				{
					if(i>=9)
					{
						System.out.println("You cannot fit any more clothes"); //when the maximum number of capes are in the drawer this message is outputted
					}
					else
					{
						if(Clothes[4][i] == null)
						{
							Clothes [4][i] = xClothing;
							return;
						}
					}
				}
			}		
		}
	}
		
	/*
	 * This is the remove method
	 * this allows the user to successfully remove clothes from the drawers and the clothes are removed from the correct drawers
	 * assigned to each pair of clothing. 
	 */
		
		public void Remove(Clothing xClothing)
		{
			if(xClothing != null)
			{
				if(xClothing.getType().equalsIgnoreCase("Undergarment"))
				{
					for(int i = 0; i<=10; i++)
					{
						if(xClothing.getColor().equals(Clothes[0][i].getColor()))
						{
							Clothes[0][i] = null;
							break;
						}
						

					}
				}
				else if(xClothing.getType().equalsIgnoreCase("Socks")||xClothing.getType().equalsIgnoreCase("Stockings"))
				{
					for(int i = 0; i<=10; i++)
					{
						if(xClothing.getColor().equals(Clothes[1][i].getColor()))
						{
							Clothes[1][i] = null;
							break;
						}
					}
				}
				else if(xClothing.getType().equalsIgnoreCase("Top"))
				{
					for (int i = 0; i<=10; i++)
					{
						if(xClothing.getColor().equals(Clothes[2][i].getColor()))
						{
							Clothes[2][i] = null;
							break;
						}
					}
				}
				else if(xClothing.getType().equalsIgnoreCase("Bottom"))
				{
					for(int i = 0; i <=10; i++)
					{
						if(xClothing.getColor().equals(Clothes[3][i].getColor()))
						{
							Clothes[3][i] = null;
							break;
						}
					}
				}
				else if(xClothing.getType().equalsIgnoreCase("Cape"))
				{
					for(int i = 0; i<=10; i++)
					{
						if(xClothing.getColor().equals(Clothes[4][i].getColor()))
						{
							Clothes[4][i] = null;
							break;
						}
					}
				}	
			}
		}
		
		/*
		 * Main Output Statement
		 * This prints out the clothes in drawer 0-4. This also categorizes the clothes within the drawers. 
		 */
		
		
		public void MainOutput()
		{
			System.out.println("Drawer 0");
			for(int i = 0; i<10; i++)
			{
				if(this.Clothes[0][i] != null)
				{
					System.out.println(Clothes[0][i].getType() + " " + Clothes[0][i].getColor());
				}
			}
			System.out.println("Drawer 1");
			for(int i = 0; i<10; i++)
			{
				if(this.Clothes[1][i]!= null)
				{
					System.out.println(Clothes[1][i].getType() + " " + Clothes[1][i].getColor());
				}
			}
			System.out.println("Drawer 2");
			for(int i = 0; i<10; i++)
			{
				if(this.Clothes[2][i]!=null)
				{
					System.out.println(Clothes[2][i].getType()+ " "+ Clothes[2][i].getColor());
				}
					
			}
			System.out.println("Drawer 3");
			for(int i = 0; i<10; i++)
			{
				if(this.Clothes[3][i]!=null)
				{
					System.out.println(Clothes[3][i].getType()+ " " + Clothes[3][i].getColor());
				}
			}
			System.out.println("Drawer 4");
			for(int i = 0; i < 10; i++)
			{
				if(this.Clothes[4][i]!=null)
				{
					System.out.println(Clothes[4][i].getType()+ " " + Clothes[4][i].getColor());
				}
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	


