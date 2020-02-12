/*
 * Created by: Lana ZE
 * Created on: 11-Feb-2019
 * Created for: ICS4U
 * Day #3 (Logging Company)
 * This program will calculate the number of maple logs a truck can carry with a max capacity of 1100
 * depending on the length of the logs(the should be the same length). Options are 0.25m, 0.5m and 1m
*/

import java.util.Scanner; 

public class logging_company {
	static Scanner userInput = new Scanner(System.in);
	
	public static void main1(String[] args) {
	
		// each maple log weights 20kg
		// the maximum capacity for a truck is 1100kg
		//VARIABLES
		double weightPerLog;
		double smallLog = .25;
		double mediumLog = .5;
		double largeLog = 1;
		double numberLogs;
		final double carryWeight = 1100;
		final double weightOfLogs = 20;
				
		//initial displayed message
		System.out.println("Please enter your maple log lenghth in meters!");
				
		//user input get
		String userInputAsString = userInput.nextLine();
		double userInputAsDouble = Double.parseDouble(userInputAsString);
				
		//check if the input is valid
		if (userInputAsDouble == smallLog || userInputAsDouble == largeLog || userInputAsDouble == mediumLog) {
		     // calculate the amount of logs a truck can carry
		  	  weightPerLog = weightOfLogs * userInputAsDouble;
			  numberLogs = carryWeight / weightPerLog;
			  System.out.println("The truck could carry" + numberLogs + "logs");
				
		        }
		
				else {
					// if invalid input was received
					System.out.println("Please inter a valid number, (0.25, 0.5, 1)m");
				}
	}
}
