// Douglas Wendel
import java.util.Scanner;

public class CollectingInformation {
	
	public static void main(String[] args ) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter name here:"); 
		
		String name = input.nextLine();
		
		System.out.println("Enter age here:");
		
		String age = input.nextLine();
		
		System.out.println("Enter Height(in meters) here");
		
		String height = input.nextLine();
		
		System.out.println("Enter blood type here:");
		
		String blood = input.nextLine();
		
		System.out.println("Are you a cat person? True or False");
		
		String cat = input.nextLine();
		
		System.out.println("Are you a dog person? True or False");
		
		String dog = input.nextLine();
		
		System.out.println("Are you a shape shifting reptilian? True or False");
		
		String shape = input.nextLine();
		
		System.out.println("How much gold is buried on your land? (in kilograms)");
		
		String gold = input.nextLine();
		
		
		// \n puts an enter space after a text. 
			
		System.out.println("Name:  " + name + "\nAge: " + age + "\nHeight: " + height + "\nBlood Type:  " + blood + "\nCat Person: " + cat + "\nDog Person: " + dog + "\nReptillian shape shifter: " +shape+ "\nAmount of gold buried on your land: " + gold + " ");          
		
	}

}
