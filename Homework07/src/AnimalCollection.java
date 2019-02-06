
public class AnimalCollection {

	//add animal
	//remove animal
	//print animal
	
	private Animal AC [][] = new Animal [4][100]; //new array
	
	public void AC()
	{
		this.AC = new Animal [4][100]; //aray set for 4
	}
	public void AddDomesticDog(DomesticDog xDomesticDog)
	{
		for(int i = 0; i <= 99; i++)
		{
			if(i>=100)  //i is greater than or equal to 100
			{
				System.out.println("You cannot do this");
				return;
			}
			else
			{
				if(AC[0][i] == null)
				{
					AC[0][i]= xDomesticDog;
					return;
				}
			}
		}
	}
	public void RemoveDomesticDog(DomesticDog xDomesticDog) //remove domestic dog
	{
		for(int i = 0; i <= 99; i++)
		{
			if(AC[0][i].getName().equalsIgnoreCase(xDomesticDog.getName()))
			{
				AC[0][i] = null;
				break;
			}
		}
	}
	public void AddWolf(Wolf xWolf) //add wolf
	{
		for(int i = 0; i <= 99; i++)
		{
			if(i>=100)
			{
				System.out.println("You cannot do this");
				return;
			}
			else
			{
				if(AC[1][i] == null)
				{
					AC[1][i]= xWolf;
					return;
				}
			}
		}
	}
	public void RemoveWolf(Wolf xWolf)//remove wolf
	{
		for(int i = 0; i <= 99; i++)
		{
			if(AC[1][i].getName().equalsIgnoreCase(xWolf.getName()))
			{
				AC[1][i] = null;
				break;
			}
		}
	}
	public void AddHouseCat(HouseCat xHouseCat) //add housecat class
	{
		for(int i = 0; i <= 99; i++)
		{
			if(i>=100)
			{
				System.out.println("You cannot do this");
				return;
			}
			else
			{
				if(AC[2][i] == null)
				{
					AC[2][i]= xHouseCat;
					return;
				}
			}
		}
	}
	public void RemoveHouseCat(HouseCat xHouseCat) //remove housecat class
	{
		for(int i = 0; i <= 99; i++)
		{
			if(AC[2][i].getName().equalsIgnoreCase(xHouseCat.getName()))
			{
				AC[2][i] = null;
				break;
			}
		}
	}
	public void AddLepord(Lepord xLepord) //add lepord class
	{
		for(int i = 0; i <= 99; i++)
		{
			if(i>=100)
			{
				System.out.println("You cannot do this");
				return;
			}
			else
			{
				if(AC[3][i] == null)
				{
					AC[3][i]= xLepord;
					return;
				}
			}
		}
	}
	public void RemoveLepord(Lepord xLepord) //remove lepord class
	{
		for(int i = 0; i <= 99; i++)
		{
			if(AC[3][i].getName().equalsIgnoreCase(xLepord.getName()))
			{
				AC[3][i] = null;
				break;
			}
		}
	}
	
	
	
	
	
	public void WriteOutput() //write output class assigned to each array
	{
		//domestic dog
		for(int i =0; i<=99; i++)
		{
			if(AC[0][i] != null)
			{
				System.out.println(AC[0][i].toString()); //write output assigned to array 0
			}
			else
			{
				
			}
			
		}
		for(int i =0; i<=99; i++)
		{
			if(AC[1][i] != null)
			{
				System.out.println(AC[1][i].toString()); //write output assigned to array 1
			}
			else
			{
				
			}
		}
		for(int i =0; i<=99; i++)
		{
			if(AC[2][i] != null)
			{
				System.out.println(AC[2][i].toString()); //write output assigned to array 2
			}
			else
			{
				
			}
		}
		for(int i = 0; i<=99; i++)
		{
			if(AC[3][i] != null)
			{
				System.out.println(AC[3][i].toString()); //write output assigned to array 3
			}
			else
			{
				
			}
		}
		

	}
	
	/*public void Remove(Animal xAnimal)
	{
		for(int i = 0; i <=99; i++)
		{
			if(AC[0][i].getName().equalsIgnoreCase(xAnimal.getName()))
			{
				AC[0][i]=null;
				break;
			}
			
		}
	}
	
	*/
	
	
	
	
	
	
	
}
