/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: December 9, 2022
 *
 *This program is accept three arguments: footballer name,
 *the nationality of footballer, and the football club that the footballer plays.
 *Output format is
 *My Favorite football player is <footballer_name>
 *His nationality as <footballer_nationality>
 *He plays for <club_name>
**/

package kitisriworaphan.putthipong.lab2;

public class Footballer {
    public static void main(String[] args) {
        if (args.length == 3) {
            String name = args[0];
            String nation = args[1];
            String club = args[2];
            System.out.println("My favorite football player is " +name);
            System.out.println("His nationality is " +nation);
            System.out.println("He plays for " +club);
        } else {
            System.out.println("Usage: <footballer name> <nationality> <club name>");
        }
    }
}
