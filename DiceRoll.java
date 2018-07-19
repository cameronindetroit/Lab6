package diceroll;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// continue program variable
		String continueYesOrNo;
		int numTimesDiceRoll = 0;
		do {
			// Prompt user to enter sides of dice
			System.out.println("Welcome to the Grand Circus Casino! \n \n");
			System.out.println("How many sides should each dice have?");
			// Class variables
			int userNum = scnr.nextInt();
			scnr.nextLine();
			System.out.println();

			// User Dice Rolls generated randomly
			int firstDiceRoll = rollDie(userNum);
			int secondDiceRoll = rollDie(userNum);

			// Conditional Statement to determine Snake eyes
			if (firstDiceRoll == 1 && secondDiceRoll == 1) {
				System.out.println("Snake Eyes!");
			}

			// Conditional Statement to determine Box Cars
			if (firstDiceRoll == 6 && secondDiceRoll == 6) {
				System.out.println("Box Cars!");
			}

			// increase the number of times the dice is rolled
			numTimesDiceRoll += 1;

			System.out.println("Roll " + numTimesDiceRoll + ": \n");
			System.out.println(firstDiceRoll);
			System.out.println(secondDiceRoll);

			System.out.println("\nRoll again? Y/N");
			continueYesOrNo = scnr.nextLine();

		} while (continueYesOrNo.trim().toLowerCase().startsWith("y"));

		System.out.println("Exiting Program");

		// Close Scanner
		scnr.close();
	}

	// Method to generate random number
	public static int rollDie(int numSides) {
		Random rand = new Random();
		int randomNum = rand.nextInt(numSides) + 1;

		return randomNum;
	}

}