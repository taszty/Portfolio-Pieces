/**
 * Author: Dylan Nelson
 * File Name: StockPriceAverageCalcualtor
 * Date Created: 2/21/22
 * Last Edited: 2/21/22
 * Description: 
 */
package CalculatorPrograms;
import java.util.Scanner;

public class StockPriceAverageCalculator {

	public static void main(String[] args) {
	
		// Declare Variables and scanner
		String stockName = "";
		double ownedShares =  0;
		double ownedAverage = 0;
		double ownedCostBasis = 0;
		
		double newShares = 0;
		double newAverage = 0;
		double newCostBasis = 0;
		
		double finalShareNumber = 0;
		double finalAverageCost = 0;
		
		Scanner input = new Scanner(System.in);
		
		// Begin collecting variables
		System.out.println("Please enter the Ticker name (OPTIONAL - ex. TSLA): ");
		stockName = input.nextLine();
		System.out.println("Please enter the ammount of currently owned shares: ");
		ownedShares = input.nextDouble();
		System.out.println("Please enter the current average cost per share: ");
		ownedAverage = input.nextDouble();
		System.out.println("Please enter the new ammount of shares being purchased: ");
		newShares = input.nextDouble();
		System.out.println("Please enter price per share of the new shares: ");
		newAverage = input.nextDouble();
		
		// Begin calculations
		ownedCostBasis = ownedShares * ownedAverage;
		newCostBasis = newShares * newAverage;
		
		finalShareNumber = ownedShares + newShares;
		finalAverageCost = (ownedCostBasis + newCostBasis) / finalShareNumber;
		
		// Print final
		System.out.printf("Your new average share price for %s is $%,.2f with a total of %,.2f shares.", 
				stockName, finalAverageCost, finalShareNumber);
		
		// Close Input
		input.close();
	}
}