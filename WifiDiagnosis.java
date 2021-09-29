import java.util.Scanner;
/*

* Class: CMSC203

* Instructor: Professor Eivazi

* Description: Create a wifi diagnosis program using scanner and conditional statements

* Due: 9/28/2021

* Platform/compiler: Java

* I pledge that I have completed the programming assignment independently.

I have not copied the code from a student or any source.

I have not given my code to any student.

Print your Name here: Diego Moreno

*/



public class WifiDiagnosis {

	public static void main(String[] args) {
		// Here I input my scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Hello! This is a Wifi Diagnosis that might help with your problem with intenet connectivity. ");
		System.out.println("First step: reboot your computer, and try to connect ");
		System.out.println("Did that fix the problem? Yes = y or No = n ");
		// Here is my wifiDiagonsis String 
		String wifiDiagnosis = input.nextLine();
		// Here I used the if else statement to make the program ask input from the user
		if (wifiDiagnosis.equalsIgnoreCase("y"))
		{
			System.out.println("Great! Thanks for using my program!");
			System.out.println("Programmer: Diego Moreno");
		}
		// Here is another solution given by the program 
		else 
		{
			System.out.println("Let's try something else..." );
			System.out.println("Second step: reboot the router and try to connect ");
			System.out.println("Did that fix the problem? Yes = y or No = n ");
			wifiDiagnosis = input.nextLine();
			// here I use the if statement to verify if the user needs any more help or no
			if (wifiDiagnosis.equalsIgnoreCase("y"))
			{
				System.out.println("Great! Thanks for using my program!");
				System.out.println("Programmer: Diego Moreno");
			}
			// Here if the help didn't work the program gives for another solution
			else 
			{
				System.out.println("Let's try something else... ");
				System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router" );
				System.out.println("Did that fix the problem? Yes = y or No = n ");
				wifiDiagnosis = input.nextLine();
		
			}
			
	        // Here I used the if statement to ask if the solution worked if not, it'll go for next solution 
			if (wifiDiagnosis.equalsIgnoreCase("y")) 
			{
				System.out.println("Great! Thanks for using my program!");
				System.out.println("Programmer: Diego Moreno");
				
			}
			// If last solution did not work, the program will give another solution.
			else 
			{
				System.out.println("Let's try something else... ");
				System.out.println("Try moving the computer closer to the router and try to connect" );
				System.out.println("Did that fix the problem? Yes = y or No = n ");
				wifiDiagnosis = input.nextLine();
				// If the solution worked it will end the program, else it will go for another solution
				if (wifiDiagnosis.equalsIgnoreCase("y")) 
				{
					System.out.println("Great! Thanks for using my program!");
					System.out.println("Programmer: Diego Moreno");
					
				}
				// Here is the next solution if the last one did not work 
				else 
				{
					System.out.println("Let's try something else... ");
					System.out.println("As last, try contacting your ISP, that will help. ");
					System.out.println("Thanks for using my program ");
					System.out.println("Programmer: Diego Moreno");
					
				}
			}
		}
		
		input.close();
	}
     
    	
	
}
