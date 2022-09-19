import java.util.Random;

import java.util.Scanner;

public class rock_paper_scissors{

    //Function to generate the computer choice
    public static String generateComputerChoice(Random random) {

        int wordNumber;
        //Choosing a random number using the inbuilt function
        wordNumber = random.nextInt(3) + 1;
        String computerChoice = "";

        if (wordNumber == 1) {
            computerChoice = "rock";
        } 
        else if (wordNumber == 2) {
            computerChoice = "paper";
        } 
         else if (wordNumber == 3) {
            computerChoice = "scissors";
        }

        System.out.println("\nThe Computer already made it's choice");
        return computerChoice;

    }

    public static void showMenu() {

        System.out.println("Options to choose from :\n1.Rock\n2.Paper\n3.Scissors");

    }

    public static String getUserChoice(Scanner scanner) {

        String userWordChoice = "";
        System.out.print("\nPlease make yours : ");
        userWordChoice = scanner.nextLine();
        //Returning the user choice
        return userWordChoice;

    }

    //Function to get the user
    public static String chooseWinner(String computerChoice, String userChoice) {

        String winner = "No Winner";

        if (computerChoice=="rock" && userChoice=="scissors") {
            winner = "Computer";
        }
        else if (userChoice=="rock" && computerChoice=="scissors") {
            winner = "User";
        }

        if (computerChoice=="scissors" && userChoice=="paper") {
            winner = "Computer";
        }
        else if (userChoice=="scissors" && computerChoice=="paper") {
            winner = "User";
        }
        if (computerChoice=="paper" && userChoice=="rock") {
            winner = "Computer";
        }
        else if (userChoice=="paper" && computerChoice=="rock") {
            winner = "User";
        }
        return winner;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String computerChoice;
        String userChoice;
        String winner;
        int i = 0;
        while (i < 5) {
            showMenu();
            computerChoice = generateComputerChoice(random);
            userChoice = getUserChoice(scanner);
            winner = chooseWinner(computerChoice, userChoice);

            System.out.println("\nYou choose : " + userChoice + "\nComputer choose : " + computerChoice);
            System.out.println(winner);
            System.out.println("***************************");
        }
    }
}