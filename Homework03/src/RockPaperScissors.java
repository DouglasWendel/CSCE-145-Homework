/*
 * Douglas Wendel
 * Homework 03
 * CSCE 145 SL1
 */




import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static final int VALUE =(3);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to Rock paper Scissors! Best 2 out of 3");
		
		int computerwin = 0;
		int personwin = 0;
		
		while(computerwin <2 && personwin <2)
		{
			System.out.println("Rock paper or Scissors");
			String rps = key.next();
			
			Random r = new Random();
			int Answer = r.nextInt(VALUE)+1;
			String computermove = "";
			switch (Answer)
			{
			case 1:
				computermove = "Rock";
				break;
			case 2:
				computermove = "Paper";
				break;
			case 3:
				computermove = "Scissors";
				break;
			}
			
				if((Answer == 1) && rps.equalsIgnoreCase("Rock"))
				{
					System.out.println("You chose " +rps+ ". The computer chose "+computermove+""
							+ "\nNobody won that round!"
							+ "\nThe computer has "+computerwin+" wins and you have " +personwin+ " wins.");
				}
				else if((Answer == 1) && rps.equalsIgnoreCase("Paper"))
				{
					System.out.println("You chose " +rps+ ". The computer chose "+computermove+""
							+ "\nYou won that round!");
					personwin = personwin +1;
					System.out.println("The computer has " +computerwin+" wins and you have " +personwin+ " wins.");
				}
				else if((Answer == 1) && rps.equalsIgnoreCase("Scissors"))
				{
					System.out.println("You chose " +rps+ ". The computer chose "+computermove+""
							+ "\nThe computer won that round!");
					computerwin = computerwin +1;
					System.out.println("The computer has " +computerwin+" win(s) and you have "+personwin+ " win(s)");
				}
				else if((Answer == 2) && rps.equalsIgnoreCase("Rock"))
				{
					System.out.println("You chose " +rps+ ". The computer chose "+computermove+""
							+ "\nThe computer won that round!");
					computerwin = computerwin +1;
					System.out.println("The computer has "+computerwin+ " win(s) and you have " +personwin+ " win(s)");
				}
				else if((Answer == 2) && rps.equalsIgnoreCase("Paper"))
				{
					System.out.println("You chose " +rps+ ". The computer chose " +computermove+""
							+ "\nKnowone won that round!"
							+ "\nThe computer has "+computerwin+" win(s) and you have" +personwin+ " win(s)");
				}
				else if((Answer == 2) && rps.equalsIgnoreCase("Scissors"))
				{
					System.out.println("You chose "+rps+ ". The computer chose " +computermove+""
							+ "\nYou won that round!");
					personwin = personwin +1;
					System.out.println("The computer has "+computerwin+" win(s) and you have " +personwin+ " win(s)");
				}
				else if((Answer == 3) && rps.equalsIgnoreCase("Rock"))
				{
					System.out.println("You chose " +rps+ ". The computer chose " +computermove+ ""
							+ "\nYou won that round!");
					personwin = personwin +1;
					System.out.println("The computer has " +computerwin+ " win(s) and you have " +personwin+ " win(s).");
				}
				else if((Answer == 3) && rps.equalsIgnoreCase("Paper"))
				{
					System.out.println("You chose " +rps+ ". The computer chose "+computermove+""
							+ "\nThe computer won that round!");
					computerwin = computerwin +1;
					System.out.println("The computer has " +computerwin+ " win(s) and you have " +personwin+ " win(s).");
				}
				else if((Answer == 3) && rps.equalsIgnoreCase("Scissors"))
				{
					System.out.println("You chose " +rps+ ". The computer chose " +computermove+""
							+ "\nKnowone won that round!");
					System.out.println("The computer has " +computerwin+ " win(s) and you have " +personwin+ " win(s).");
				}	
				if(computerwin == 2)
				{
					System.out.println("The computer has won!");
				}
				if(personwin == 2)
				{
					System.out.println("You have won!");
				}
				
				
		}	

	}

}
