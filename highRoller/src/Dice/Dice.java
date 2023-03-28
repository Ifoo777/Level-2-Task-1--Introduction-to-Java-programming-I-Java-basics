package Dice;

import java.util.Random;

public class Dice {
	// Instance variables / attributes
	private int numOfSides;

	private int faceValue;

	// Constructor sets the Dice attributes - in order to call in this constructor
	// we have to pass in numberOfSides
	public Dice(int numberOfSides) {

		numOfSides = numberOfSides;

		Random myRandomNumGenerator = new Random();

		faceValue = myRandomNumGenerator.nextInt(numOfSides) + 1;

	} // end of constructor

	/**
	 * This method will simulate rolling the dice
	 */

	public void rollDice() {

		Random myRandomNumGenerator = new Random();

		faceValue = myRandomNumGenerator.nextInt(numOfSides) + 1;

	} // end of method rollDice()

	/**
	 * This method will return the current face value of the dice object
	 */

	public int getFaceValue() {

		return faceValue;
	}

}
