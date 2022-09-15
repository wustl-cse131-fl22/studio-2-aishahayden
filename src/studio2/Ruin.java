package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the starting amount of money: ");
		int startAmount = input.nextInt();
		
		System.out.println("Enter the probability you win a single play: ");
		double winChance = input.nextDouble();
		
		System.out.println("Enter the amount of money you would happily walk away with: ");
		double winLimit = input.nextDouble();
		
		int totalSimulations = 500;
		int simulationCount = 0;
		
		
		for (simulationCount = 0; simulationCount < totalSimulations; simulationCount++) 
		{
			int currentBalance = startAmount;
			int gambleCount = 0;
			String gambleOutcome = "Bad";
			while (currentBalance > 0 && currentBalance < winLimit)
			{
				double randomOdds = Math.random() + 0.1;
				if (winChance <= randomOdds)
				{
					currentBalance++;
				}
				else 
				{
					currentBalance--;
				}
				gambleCount++;
				
				if (currentBalance == 0)
				{
				gambleOutcome = "LOSE";
				}
				else 
				{
				gambleOutcome = "WIN";
				}
			}
			System.out.println("Simulation " + simulationCount + ": " + gambleCount + " " + gambleOutcome);
			
			
		}

	}

}
