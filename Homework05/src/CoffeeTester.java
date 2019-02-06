
/*
 * Douglas Wendel
 * CSCE 145 SL1
 * HOMEWORK 05
 */
import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {		
		Scanner key = new Scanner(System.in);
		Scanner key1 = new Scanner(System.in); 
		/*
		 * i Had to add this second scanner because for some reason it would not let me put a key.nextLine(); 
		 * in front of line 32
		 */
		
		//welcome statement
		System.out.println("Welcome to coffee hour!");
		

		
		Coffee p1 = new Coffee();
		

		
		System.out.println(p1.toString2()); //prints toString2
		String name1 = key.nextLine(); //allows user to input name 1
		System.out.println(p1.toString201()); //prints toString201
		double caffine1 = key.nextDouble(); //Allows user to input caffine content
		

		
		Coffee p2 = new Coffee(name1,caffine1); //consists of p2
		
		
		System.out.println(p1.toString22()); //prints default toString22
		String name2 = key1.nextLine(); //allows user to input the name of coffee number 2
		
		System.out.println(p1.toString201()); //prints default 
		double caffine2 = key.nextDouble(); //allows user to input caffine content
		

		
		Coffee p3 = new Coffee (name2, caffine2);
		
		double random1 = p2.CaffineContent();
		double random2 = p3.CaffineContent();
		
		
		System.out.println(p2.toString01());
		System.out.println(p3.toString01());
		
	
		
		
		
	
		
		
		
		
	}

}
