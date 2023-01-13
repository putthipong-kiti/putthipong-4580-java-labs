/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 13, 2023 
**/

package kitisriworaphan.putthipong.lab4;

import java.util.Scanner;

/**
 * This program is SicBoV2 that simulates the Sic Bo game.
 * The player can gets to choose to play the game again or stop the game at the
 * end.
 * 
 * @author Putthipong Kitisriworaphan
 * @version 1.0, 13/01/2023
 * 
 */
public class SicBoV2 {
    static int choice;
    static Scanner scanner = new Scanner(System.in);

    /**
     * The main method will run the Sic Bo game.
     * The player can gets to choose to play the game again or stop the game at the
     * end.
     * 
     * @param args Program arguments
     */
    public static void main(String[] args) {
        getChoice();
        playGame();
        while (true) {
            System.out.println("Press A to play agian. Press the other keys to exit.");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("A")) {
                getChoice();
                playGame();
            } else {
                System.out.println("Good Bye!");
                scanner.close();
                System.exit(0);
            }
        }
    }

    /**
     * This method will reads a choice from the player.
     */
    public static void getChoice() {
        System.out.println("Welcome to พุฒิพงศ์ กิติศรีวรพันธุ์ (653040458-0) Game:");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
    }

    /**
     * This method will play the game according to the choice that player chooses.
     */
    public static void playGame() {
        if (choice == 1) {
            System.out.print("Type in h for high and l for low: ");
            String userBet = scanner.next();
            int dice1 = 1 + (int) (Math.random() * 6);
            int dice2 = 1 + (int) (Math.random() * 6);
            int dice3 = 1 + (int) (Math.random() * 6);
            if (userBet.equalsIgnoreCase("h") || userBet.equalsIgnoreCase("l")) {
                System.out.println("Dice 1 : " + dice1 + ", Dice 2 : " + dice2 + ", Dice 3 : " + dice3);
                int totalDice = dice1 + dice2 + dice3;
                System.out.println("Total is " + totalDice);
                if (userBet.equalsIgnoreCase("h") && totalDice >= 11) {
                    System.out.println("You win 20 Baht.");
                } else if (userBet.equalsIgnoreCase("l") && totalDice <= 10) {
                    System.out.println("You win 20 Baht.");
                } else {
                    System.out.println("You lose 10 Baht.");
                }
            } else {
                System.out.println("Incorrect input. Enter h for high and l for low only.");
            }
        } else if (choice == 2) {
            System.out.print("Type in a number to bet on (1-6): ");
            int userBet = scanner.nextInt();
            int dice1 = 1 + (int) (Math.random() * 6);
            int dice2 = 1 + (int) (Math.random() * 6);
            int dice3 = 1 + (int) (Math.random() * 6);
            if (userBet >= 1 && userBet <= 6) {
                System.out.println("Dice 1 : " + dice1 + ", Dice 2 : " + dice2 + ", Dice 3 : " + dice3);
                int diceMatch = 0;
                if (userBet == dice1) {
                    diceMatch += 1;
                }
                if (userBet == dice2) {
                    diceMatch += 1;
                }
                if (userBet == dice3) {
                    diceMatch += 1;
                }
                if (diceMatch > 0) {
                    System.out.println("You win " + (10 * diceMatch * ((0 % 5) + 1)) + " Baht.");
                } else {
                    System.out.println("You lose 10 Baht.");
                }
            } else {
                System.out.println("Incorrect input. Enter a number between 1-6 only.");
            }
        } else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
        }
    }
}