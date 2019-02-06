
/*
 * Douglas Wendel
 * CSCE 145 SL1
 * HOMEWORK 05
 */

import java.util.Scanner;
public class Coffee {


	Scanner key = new Scanner(System.in);

	
	//instance variables
	private String Name;
	private double Caffine;
	private double CaffineContent;
	 
	
	//constructors
	public Coffee() 
	{
		this.Name = "Default Coffee"; //assigning default name
		this.Caffine = 100; //assigning default value
	}
	
	
	//parameterized constructor
	public Coffee(String xName, double xCaffine)
	{
		
		this.setName(xName); //sets name of xName
		this.setCaffine(xCaffine); //sets caffine of xCaffine
		
		
	}

	//accessors -getters
	
	//return the name of the coffee
	public String getName()
	{
		return this.Name; 
	}
	
	public double getCaffine()
	{
		return this.Caffine;
	}
	
	//mutators modify the values of an instance variable if valid

	public void setName(String xName)
	{
		this.Name = xName;
	}
	
	public void setCaffine(double xCaffine)
	{
		if(xCaffine >= 50 && xCaffine <= 300) //if xCaffine is greater than or equal to 50 and less than or equal to 300
		{
			this.Caffine = xCaffine;
		}
		else
		{
			System.out.println("Invalid amount of caffine"); //prints invalid amount of caffine
		}
	}
	public double CaffineContent()
	{
		return (180.0/((this.Caffine / 100.0) * 6)); //equation to calculate caffinecontent
	}
	
	public String toString()
	{
	
		return "Name: " + this.Name + "\nCaffine: " +this.Caffine; //print statement in tostring
	}
	
	public String toString01()
	{
		return "It would take " + this.CaffineContent() + " cups of " + this.Name + " before it's too dangerous to drink more."; //caffine content print statement
	}
	
	public String toString2()
	{
		return "What is the name of the first coffee?"; //first name question
	}
	
	public String toString22()
	{
		return "What is the name of the second coffee?";//second name question
	}
	
	public String toString201()
	{
		return "What is the caffine content?"; //caffine content question
	}
	
	
	
	
	
}
