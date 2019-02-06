/*
 * Douglas Wendel
 * CSCE 145
 * Homework 07
 * Some of the notes are the same for the many cases and if loops, which is why they arent all labeled. 
 */
import java.util.Scanner;
public class AnimalFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner key = new Scanner(System.in);	
		Animal a1 = new Animal(); //new animal
		AnimalCollection anicol = new AnimalCollection(); //esatblishes animal collection anicol variable
		Dog D = new Dog(); //new dog
		Cat C = new Cat(); //new cat
		DomesticDog DD = new DomesticDog(); //new domestic dog
		HouseCat HC = new HouseCat(); //new housecat
		Wolf W = new Wolf(); //new wolf
		Lepord L = new Lepord(); //new lepord
		String input = "blank"; //input is blank unless otherwise
		System.out.println("Welcome to the cat and dog collection!"); //welcome statement
		
		do
		{
			System.out.println("Enter 1: to add a cat or dog.\nEnter 2: to remove a cat or dog.\nEnter 3: to quit."); //instructions
			int answer = key.nextInt(); //allows user to input number
			
			switch(answer)
			{
			case 1:
				System.out.println("Would you like to add 1. House cat, 2. A Lepard, 3. Domestic Dog, 4. A Wolf"); //animal creation statement
				int answer1 = key.nextInt(); //allows user to input a  number
				if(answer1 == 1)
				{
					a1 = new Animal(); //new animal	
					C = new Cat(); //new cat
					HC = new HouseCat(); //new house cat
					System.out.println("Enter the name");
					a1.setName(key.next()); //sets name as user input
					System.out.println("Enter the weight");
					a1.setWeight(key.nextInt()); //sets weight as user input
					System.out.println("Enter the mood");
					C.setMood(key.next()); //sets mood as user input
					System.out.println("Enter the type");
					HC.setType(key.next()); //sets type as user input
					HC.setName(a1.getName());
					HC.setWeight(a1.getWeight()); //sets the weight and brings it into the house cat
					HC.setMood(C.getMood()); //sets the mood and brings it into the house cat
					anicol.AddHouseCat(HC); //adds it to the house cat
					anicol.WriteOutput(); //writes output
					break;
				}
				
				if(answer1 == 2)
				{
					a1 = new Animal();
					C = new Cat();
					L = new Lepord();
					System.out.println("Enter the name");
					a1.setName(key.next());
					System.out.println("Enter the weight");
					a1.setWeight(key.nextInt());
					System.out.println("Enter the mood");
					C.setMood(key.next());
					System.out.println("Enter the number of spots");
					L.setNumberOfSpots(key.nextInt());
					L.setName(a1.getName());
					L.setWeight(a1.getWeight());
					L.setMood(C.getMood());
					anicol.AddLepord(L);
					anicol.WriteOutput();
					break;
				}
				if(answer1 == 3)
				{
					a1 = new Animal();
					D = new Dog();
					DD = new DomesticDog();
					System.out.println("Enter the name");
					a1.setName(key.next());
					System.out.println("Enter the weight");
					a1.setWeight(key.nextInt());
					System.out.println("Enter the energy level");
					D.setEnergyLevel(key.nextInt());
					System.out.println("Enter the type");
					DD.setType(key.next());
					DD.setName(a1.getName());
					DD.setWeight(a1.getWeight());
					DD.setEnergyLevel(D.getEnergyLevel());
					
					anicol.AddDomesticDog(DD);
					anicol.WriteOutput();
					break;
				}
				if(answer1 == 4)
				{
					a1 = new Animal();
					D = new Dog();
					W = new Wolf();
					
					System.out.println("Enter the name");
					a1.setName(key.next());
					System.out.println("Enter the weight");
					a1.setWeight(key.nextInt());
					System.out.println("Enter the energy level");
					D.setEnergyLevel(key.nextInt());
					System.out.println("Pack Leader Name");
					W.setPackLeaderName(key.next());
					W.setName(a1.getName());
					W.setWeight(a1.getWeight());
					W.setEnergyLevel(D.getEnergyLevel());
					
					anicol.AddWolf(W);
					anicol.WriteOutput();
					break;
				}
				
			case 2: 
				System.out.println("Enter the animals name that is to be removed");
				int answer2 = key.nextInt();
				if(answer2 == 1)
				{
					a1 = new Animal();
					C = new Cat();
					HC = new HouseCat();
					System.out.println("Enter the name");
					a1.setName(key.next());
					HC.setName(a1.getName());
					HC.setWeight(10);
					HC.setMood("hungry");
					HC.setType("bombay");
					anicol.RemoveHouseCat(HC); //Removes it from the house cat
					anicol.WriteOutput();
					break;
				}
				if(answer2 == 2)
				{
					a1 = new Animal();
					C = new Cat();
					L = new Lepord();
					System.out.println("Enter the name");
					a1.setName(key.next());
					L.setName(a1.getName());
					anicol.RemoveLepord(L);
					anicol.WriteOutput();
					break;
				}
				if(answer2 == 3)
				{
					a1 = new Animal();
					D = new Dog();
					DD = new DomesticDog();
					System.out.println("Enter the name"); //output message
					a1.setName(key.next()); //sets animal name
					DD.setName(a1.getName()); //sets dd name
					anicol.RemoveDomesticDog(DD); //removes domestic dog
					anicol.WriteOutput(); //writes output
					break;
					
				}
				if(answer2 == 4)
				{
					a1 = new Animal(); //new animal
					D = new Dog(); //new dog
					W = new Wolf(); //new wolf
					System.out.println("Enter the name"); //output message
					a1.setName(key.next()); //sets the name
					W.setName(a1.getName()); //sets the name to the wolf input
					anicol.RemoveWolf(W); //removes designated name from the list of animals
					anicol.WriteOutput(); //writes the output
					break;
				}
			case 3:
				System.exit(0);//quits the program
				break;
				
			}
			
		}
		while(input == "blank");
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
