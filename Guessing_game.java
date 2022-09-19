import java.util.Scanner;

public class Guessing_game {

	public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int) (100 * Math.random());
        int trials = 5;
        int i, guess;

        System.out.println("A number is chossen between 1 to 100."+ "Guess the number"+ " within 5 trials.");

        // Iterate over K Trials
        for (i = 0; i < trials; i++) {

            System.out.println("Guess the number:");

            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess ) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess ) {
                System.out.println("The number is" + " less than " + guess);
            }
        }

        if (i == trials) {
            System.out.println("You have exhausted " +trials +" trials.");

            System.out.println("The number was " + number);
        }
    }
    
	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
