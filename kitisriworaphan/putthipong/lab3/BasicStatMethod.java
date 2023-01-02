/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: December 22, 2022 
 *
 * This program will find the minimum, the maximum, the average, the median, 
 * and the standard deviation of the list of numbers entered by user using method.
 * The program defines two methods :
 * Method 1 : getInput()
 * This method will read numbers from the user then returns that input as a string.
 * If no number input, the program will display an error message.
 * Method 2 : calculateStat()
 * This method will accepts one string input from method getInput()
 * then caluculates and displays sort numbers in an array in ascending order,
 * The minimum, The maximum, The average, The median, The standard deviation.
**/

package kitisriworaphan.putthipong.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BasicStatMethod {
    static String input;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = getInput();
        calculateStat(input);
    }

    public static String getInput() {
        System.out.print("Enter number (seperated by space): ");
        String input = scanner.nextLine();
        switch (input) {
            // check if number was input
            case "":
                System.err.println("Please enter at least one number.");
                System.exit(0);
            default:
                return input;
        }
    }

    public static void calculateStat(String input) {
        List<Double> list = new ArrayList<Double>();
        String inputList[] = input.split(" ");
        if (inputList.length > 10) {
            System.err.println("Please enter no more than 10 numbers.");
            System.exit(0);
        } else {
            // convert string input to double number
            for (int i = 0; i < inputList.length; i++) {
                Double number = Double.parseDouble(inputList[i]);
                list.add(number);
            }
            Collections.sort(list);
            System.out.print("Sorted numbers are ");
            // display numbers in ascending order
            for (double number : list) {
                System.out.print(number + " ");
            }
            System.out.println("");
            System.out.println("Minimum: " + String.format("%.2f", list.get(0)));
            System.out.println("Maximum: " + String.format("%.2f", list.get(inputList.length - 1)));
            double sum = 0;
            // sum total number in list
            for (double number : list) {
                sum += number;
            }
            double avg = sum / inputList.length;
            System.out.println("Average: " + String.format("%.2f", avg));
            // check if length list is even
            if (inputList.length % 2 == 0) {
                double median = (list.get((inputList.length - 2) / 2) + list.get((inputList.length) / 2)) / 2;
                System.out.println("Median: " + String.format("%.2f", median));
                // when length list is odd
            } else {
                double median = list.get((inputList.length - 1) / 2);
                System.out.println("Median: " + String.format("%.2f", median));
            }
            double sigma = 0;
            // sum each number minus average and square them
            for (double number : list) {
                double numMinusAvg = Math.pow((number - avg), 2);
                sigma += numMinusAvg;
            }
            double sdSqrt = sigma / inputList.length;
            double sd = Math.sqrt(sdSqrt);
            System.out.println("Standard deviation: " + String.format("%.2f", sd));
        }
    }
}
