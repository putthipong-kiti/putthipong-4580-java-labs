/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 13, 2023 
**/

package kitisriworaphan.putthipong.lab4;

import java.util.Scanner;

/**
 * This program is SicBoV4 that simulates the Sic Bo game and has all the features of SicBoV3.
 * In the end of the program will display all the game plays and the results at the end of the game.
 * 
 * @author Putthipong Kitisriworaphan
 * @version 1.0, 13/01/2023
 * 
 */
public class SicBoV4 {
    static int choice;
    final static int MAX_INPUT = 100;
    static String[] gamePlay = new String[MAX_INPUT];
    static String[] gameResult = new String[MAX_INPUT];
    static int currentInput = 0;
    static String highOrLow;
    static Scanner scanner = new Scanner(System.in);

    /**
     * The main method will run the Sic Bo game.
     * The player can gets to choose to play the game again or stop the game at the end.
     * 
     * @param args Program arguments
     */
    public static void main(String[] args) {
        getChoice();
        playGame();
        while (currentInput <= MAX_INPUT) {
            System.out.println("Press A to play agian. Press the other keys to exit.");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("A")) {
                getChoice();
                playGame();
            } else {
                System.out.println("### Game Play Summary ###");
                for (int i = 0; i < currentInput; i++) {
                    System.out.println("Game " + (i + 1) + " :");
                    System.out.println("You have bet on " + gamePlay[i]);
                    System.out.println(gameResult[i]);
                }
                System.out.println("Good Bye!");
                scanner.close();
                System.exit(0);
            }
        }
        System.out.println("### Game Play Summary ###");
        for (int i = 0; i < currentInput; i++) {
            System.out.println("Game " + (i + 1) + " :");
            System.out.println("You have bet on " + gamePlay[i]);
            System.out.println(gameResult[i]);
        }
        System.out.println("Good Bye!");
        scanner.close();
        System.exit(0);
    }

    /**
     * This method will reads a choice from the player.
     */
    public static void getChoice() {
        System.out.println("Welcome to พุฒิพงศ์ กิติศรีวรพันธุ์ (653040458-0) Game:");
        while (true) {
            System.out.println("Choose how do you want to bet:");
            System.out.println("Type 1 for choosing high or low numbers.");
            System.out.println("Type 2 for choosing number between 1-6.");
            System.out.print("Enter your choice: ");
            String choiceString = scanner.next();
            if (choiceString.equals("1") || choiceString.equals("2")) {
                choice = Integer.parseInt(choiceString);
                break;
            } else {
                System.err.println("Enter only 1 or 2:");
            }
        }
    }

    /**
     * This method will play the game according to the choice that player chooses.
     */
    public static void playGame() {
        if (choice == 1) {
            while (true) {
                System.out.print("Type in h for high and l for low: ");
                String highOrLow = scanner.next();
                if (highOrLow.equalsIgnoreCase("h") || highOrLow.equalsIgnoreCase("l")) {
                    int dice1 = 1 + (int) (Math.random() * 6);
                    int dice2 = 1 + (int) (Math.random() * 6);
                    int dice3 = 1 + (int) (Math.random() * 6);
                    System.out.println("Dice 1 : " + dice1 + ", Dice 2 : " + dice2 + ", Dice 3 : " + dice3);
                    int totalDice = dice1 + dice2 + dice3;
                    System.out.println("Total is " + totalDice);
                    if (highOrLow.equalsIgnoreCase("h") && totalDice >= 11) {
                        System.out.println("You win 20 Baht.");
                        gamePlay[currentInput] = highOrLow;
                        gameResult[currentInput] = "You win 20 Baht.";
                        currentInput++;
                    } else if (highOrLow.equalsIgnoreCase("l") && totalDice <= 10) {
                        System.out.println("You win 20 Baht.");
                        gamePlay[currentInput] = highOrLow;
                        gameResult[currentInput] = "You win 20 Baht.";
                        currentInput++;
                    } else {
                        System.out.println("You lose 10 Baht.");
                        gamePlay[currentInput] = highOrLow;
                        gameResult[currentInput] = "You lose 10 Baht.";
                        currentInput++;
                    }
                    break;
                } else {
                    System.out.println("Incorrect input. Enter h for high and l for low only.");
                }
            }
        } else if (choice == 2) {
            while (true) {
                System.out.print("Type in a number to bet on (1-6): ");
                String userBet = scanner.next();
                if (userBet.equals("1") || userBet.equals("2") || userBet.equals("3") || userBet.equals("4")
                        || userBet.equals("5") || userBet.equals("6")) {
                    int bet = Integer.parseInt(userBet);
                    int dice1 = 1 + (int) (Math.random() * 6);
                    int dice2 = 1 + (int) (Math.random() * 6);
                    int dice3 = 1 + (int) (Math.random() * 6);
                    System.out.println("Dice 1 : " + dice1 + ", Dice 2 : " + dice2 + ", Dice 3 : " + dice3);
                    int diceMatch = 0;
                    if (bet == dice1) {
                        diceMatch += 1;
                    }
                    if (bet == dice2) {
                        diceMatch += 1;
                    }
                    if (bet == dice3) {
                        diceMatch += 1;
                    }
                    if (diceMatch > 0) {
                        System.out.println("You win " + (10 * diceMatch * ((0 % 5) + 1)) + " Baht.");
                        gamePlay[currentInput] = userBet;
                        gameResult[currentInput] = "You win " + (10 * diceMatch * ((0 % 5) + 1)) + " Baht.";
                        currentInput++;
                    } else {
                        System.out.println("You lose 10 Baht.");
                        gamePlay[currentInput] = userBet;
                        gameResult[currentInput] = "You lose 10 Baht.";
                        currentInput++;
                    }
                    break;
                } else {
                    System.out.println("Incorrect input. Enter a number between 1-6.");
                }
            }
        }
    }
}
