/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: December 9, 2022  
**/

package kitisriworaphan.putthipong.lab2;

public class MoneyProcessor {
    public static void main(String[] args) {
        if (args.length == 4) {
            int thousand = Integer.parseInt(args[0]);
            int five_hundred = Integer.parseInt(args[1]);
            int hundred = Integer.parseInt(args[2]);
            int twenty = Integer.parseInt(args[3]);
            double total = thousand*1000 + five_hundred*500 + hundred*100 + twenty*20;
            System.out.println("Total money is " + total);
        } else {
            System.out.println("Usage: MoneyProcessor <# of 1,000 Baht Notes> <# of 500 Baht Notes> <# of 100 Baht Notes> <# of 20 Baht Notes>");
        }
    }
}

/**
 *This program is accept four arguments: 
 *number of notes of 1,000 Baht, 500 Baht, 100 Baht and 20 Baht
 *to compute total amount of money.
 *Output format is
 *Total money is <total>
**/