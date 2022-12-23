/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: December 22, 2022 
 *
 * This program is simulate a Sic Bo game using method to write this code.
 * The program defines two methods :
 * Method 1 : getChoice() 
 * This method will reads a choice from the player. 
 * Choice 1 for playing high or low.
 * If the total is between 3-10 then the total is low.
 * If the total is between 11-18 then the total is high.
 * If the player bets correctly, they wins 20 Baht.
 * Choice 2 for choosing a number.
 * If the player bet correctly, they will receive 3 times of bet per dice.
 * Method 2 : playGame() 
 * This method will play the game according to the choice that player chooses.
**/

package kitisriworaphan.putthipong.lab3;

import java.util.Scanner;

public class SicBoMethod {
    static int choice;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        getChoice();
        playGame();
    }

    // Method 1
    public static void getChoice() {
        // display to user what to do
        System.out.println("Choose how do you want to bet:");
        System.out.println("Type 1 for choosing high or low numbers.");
        System.out.println("Type 2 for choosing number between 1-6.");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
    }

    // Method 2
    public static void playGame() {
        // choice 1 play high or low
        if (choice == 1) {
            // ask user if they want to play high or low
            Scanner select = new Scanner(System.in);
            System.out.print("Type in h for high and l for low: ");
            String user_Bet = select.next();
            // random 3 dices
            int dice1 = 1 + (int) (Math.random() * 6);
            int dice2 = 1 + (int) (Math.random() * 6);
            int dice3 = 1 + (int) (Math.random() * 6);
            // check if user input was correct
            if (user_Bet.equalsIgnoreCase("h") || user_Bet.equalsIgnoreCase("l")) {
                // display random dices
                System.out.println("Dice 1 : " + dice1 + ", Dice 2 : " + dice2 + ", Dice 3 : " + dice3);
                // sum the total of dices
                int total_Dice = dice1 + dice2 + dice3;
                System.out.println("Total is " + total_Dice);
                // win condition for high
                if (user_Bet.equalsIgnoreCase("h") && total_Dice >= 11) {
                    System.out.println("You win 20 Baht.");
                    // win condition for low
                } else if (user_Bet.equalsIgnoreCase("l") && total_Dice <= 10) {
                    System.out.println("You win 20 Baht.");
                    // lose condition
                } else {
                    System.out.println("You lose 10 Baht.");
                }
                // when user input is incorrect
            } else {
                System.out.println("Incorrect input. Enter h for high and l for low only.");
            }
            // close scanner
            select.close();
            // choice 2 play bet one number
        } else if (choice == 2) {
            // ask user what number they want to bet
            Scanner select = new Scanner(System.in);
            System.out.print("Type in a number to bet on (1-6): ");
            int user_Bet = select.nextInt();
            // random 3 dices
            int dice1 = 1 + (int) (Math.random() * 6);
            int dice2 = 1 + (int) (Math.random() * 6);
            int dice3 = 1 + (int) (Math.random() * 6);
            // check if user input was correct
            if (user_Bet >= 1 && user_Bet <= 6) {
                // display random dices
                System.out.println("Dice 1 : " + dice1 + ", Dice 2 : " + dice2 + ", Dice 3 : " + dice3);
                // declare receives amount
                int winBet = 0;
                // condition if user bet correct to dices
                if (user_Bet == dice1) {
                    winBet += 30;
                }
                if (user_Bet == dice2) {
                    winBet += 30;
                }
                if (user_Bet == dice3) {
                    winBet += 30;
                    // check receives amount
                }
                if (winBet > 0) {
                    System.out.println("You win " + winBet + " Baht.");
                } else {
                    System.out.println("You lose 10 Baht.");
                }
                // when user input is incorrect
            } else {
                System.out.println("Incorrect input. Enter a number between 1-6 only.");
            }
            // close scanner
            select.close();
            // when user input is incorrect
        } else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
        }
        // close scanner
        scanner.close();
    }
}