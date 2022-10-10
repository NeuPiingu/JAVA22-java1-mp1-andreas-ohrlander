package miniprojekt1;
import java.util.Scanner;
public class RandomGenerator {
	static int randomNumber;
	static int guessNumber;
	static int guessAmount = 1;
	static boolean restart = true;
	public static void numberGen() {
		randomNumber = (int) Math.floor(Math.random()* 100);
	}
	public static void guessCompare() {
		switch(Integer.compare(guessNumber, randomNumber)) {
		case 0: System.out.println("Correct guess!"); System.out.println("Total guesses: " + guessAmount);
		break;
		case 1: System.out.println("Too high, try again");
		break;
		case -1: System.out.println("Too low, try again");
		}
	} 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Creates new instance of Scanner
		do {
			numberGen(); //Calls the numberGen method to generate a random number
//			System.out.println(randomNumber); //Prints the generated number, for testing purposes
			System.out.println("New number generated, try to guess it!");
			do {
				guessNumber = scanner.nextInt(); //awaits a guessed number input in console
				guessCompare(); //compares guess to generated number
				guessAmount++;
			}while(guessNumber != randomNumber);
			guessAmount = 1;
		}while(restart = true);
		scanner.close(); //Closes the scanner
	}
}
