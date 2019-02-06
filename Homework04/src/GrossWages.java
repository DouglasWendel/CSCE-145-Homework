/*
 * Douglas Wendel
 * CSCE 245 Sl1
 * Homework 04
 */

import java.util.Scanner;
public class GrossWages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the number of employees whose gross wages you wish to calculate.");
		int amount = key.nextInt();
		
		int[] PeopleArr = new int[amount]; //amount of people
		double[] HoursArr = new double [amount];// hours person worked
		double[] WageArr = new double [amount]; // amount person gets paid.
		
		String[] NameArr = new String[amount]; // names of people
		
		
		for(int i = 0; i < PeopleArr.length; i++) //asking the numbers for the next index starting at 1
		{
			System.out.println("Enter the name of employee " +(i+1));
			key.nextLine();
			NameArr[i]=key.nextLine(); // where you input the number at the index
			
			System.out.println("Enter the amount of hours "+NameArr[i]+ " worked this week");
			HoursArr[i] = key.nextDouble(); // allowing user to input the amount of hours a person worked
			
			System.out.println("Enter the hourly wage of " +NameArr[i]); // allows user to enter the amount of money a person gets paid per hour
			WageArr[i] = key.nextDouble();
			
			
		}
		
		System.out.println("Name       Hours Worked   		  Hourly Pay Rate 		   Gross Wages Earned");// output message chart
		
		for(int i = 0; i < PeopleArr.length; i++)
		{
			System.out.println(NameArr[i] + "\t \t" + HoursArr[i] + "\t \t \t \t$" + WageArr[i] + "\t \t \t \t$" +(HoursArr[i]*WageArr[i]));//output message including all informationn and calculations

		}
		
		
	}

}
