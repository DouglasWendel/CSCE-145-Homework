/*
 * Douglas Wendel
 * Homework 06
 */
import java.util.Scanner;
public class DresserFrontEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner key = new Scanner(System.in);
		Dresser drs = new Dresser();
		Clothing clo = new Clothing();
		System.out.println("Welcome to the dresser!"); //welcome statement
		String input = "";
		while(input.equalsIgnoreCase("quit")!= true)
		{
			System.out.println("Enter 1: to add an item.\nEnter 2: to add an item.\nEnter 3: to print out the dresser contents."
					+ "\nEnter 9: to quit."); //first statement, instructions
		
		int choice = key.nextInt(); //allows user to input the number of the command they want the user to perform
		key.nextLine();
		switch(choice)
		{
		case 1: 
			clo = new Clothing();
			System.out.println("Enter the type\nIt may be undergrament, socks, stockings, top, bottom, or cape.");
			clo.setType(key.next());//allows the user to input the clothing type
			System.out.println("Enter a color\nIt may be brown, pink, orange, green, blue, purple, or grey.");
			clo.setColor(key.next());//allows the user to input the color
			drs.Add(clo);
			break;
			
		case 2: 
			clo = new Clothing();
			System.out.println("Enter the type.\nIt may be undergrament, socks, stockings, top, bottom, or cape. ");
			clo.setType(key.next());//allows the user to input the clothing type
			System.out.println("Enter a color\nIt may be brown, pink, orange, green, blue, purple, or grey.");
			clo.setColor(key.next()); //allows the user to input the color
			drs.Remove(clo); //for some reason this is where my error is happening. I cannot seem to figure this out. 
			
			
		case 3:
			drs.MainOutput(); //prints the MainOutput method in the Dresser class
			break;
			
		case 9:
			System.exit(0); //exit
			
			
		}
		
		}
		
		
		
		
		
		
		
		
		
	}

}
