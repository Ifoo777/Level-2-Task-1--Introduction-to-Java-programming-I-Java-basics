package Dice;

import java.util.Scanner;

public class TestDice {

	public static void main(String[] args) {

		// Declare a variable value 6 indicates the sides of a dice
		Dice cpuDie1 = new Dice(6);
		Dice userDie2 = new Dice(6);
		// Declare win variables for the user and CPU
		int userWins = 0;
		int cpuWins = 0;
		// invoke a scanner object
		Scanner scan = new Scanner(System.in);
		// Initialize a empty string
		String userInput = "";

		while (userWins != 3 && cpuWins != 3) {

			// Initial value of the dice indicates face value before the dice is rolled
			System.out.println("Best out of three");
			System.out.println("User Score " + userWins);
			System.out.println("CPU Score " + cpuWins);
			System.out.println("The initial value of our cpuDie1 is " + cpuDie1.getFaceValue());

			cpuDie1.rollDice();

			// Display output
			System.out.println("The value after rolling of our cpuDie1 is " + cpuDie1.getFaceValue());
			System.out.println("The initial value of our userDie2 is " + userDie2.getFaceValue());
			System.out.println("User would you like to roll the dice yes or no ");

			// reads the content of the scanner object
			userInput = scan.nextLine();

			// Condition if user chooses yes or no to roll the dice
			if (userInput == "yes") {
				userDie2.rollDice();
				System.out.println("The value after rolling of our userDie2 is " + userDie2.getFaceValue());

			} else {
				System.out.println(" Using face value");
			}

			System.out.println("The value after rolling of our userDie2  is " + userDie2.getFaceValue());

			// condition if CPU result is greater than user value CPU wins else if user is greater than CPU then user wins
			if (cpuDie1.getFaceValue() > userDie2.getFaceValue()) {
				System.out.println("Cpu wins");
				cpuWins++;
			}

			else if (userDie2.getFaceValue() > cpuDie1.getFaceValue()) {
				System.out.println("User wins");
				// If the user won this round the userWins will increase by one
				userWins++;
			}

			else {
				System.out.println("Draw");
			}

		}
		scan.close();

		// Conditional statement for best out of 3 for user and CPU
		if (userWins == 3 && cpuWins < 3) {
			// Display output
			System.out.println("User wins ");
		} else if (cpuWins == 3 && userWins < 3) {
			System.out.println("Cpu wins");
		} else {
			System.out.println("Draw");
		}

	}
}
