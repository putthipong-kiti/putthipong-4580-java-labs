/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 19, 2022 
 *
 * This is Java program named WorldAthlete.
 * Three objects are created in this program, named ratchanok, wisaksil, and tom.
 * The setter for the height attribute is called and used to set a new height for the ratchanok object.
 * The toString method is also used to display the information of each athlete.
**/

package kitisriworaphan.putthipong.lab5;

import kitisriworaphan.putthipong.lab5.Athlete.Gender;

public class WorldAthlete {
        public static void main(String[] args) {
                Athlete ratchanok = new Athlete("Ratchanok Intanon", 55, 1.68, Gender.FEMALE,
                                "Thai", "05/02/1995");
                Athlete wisaksil = new Athlete("Wisaksil Wangek", 51.5, 1.60, Gender.MALE,
                                "Thai", "08/12/1986");
                Athlete tom = new Athlete("Tom Brady", 102, 1.93, Gender.MALE,
                                "American", "03/08/1977");
                System.out.println(ratchanok.getName() + "'s height is " + ratchanok.getHeight());
                ratchanok.setHeight(1.70);
                System.out.println(ratchanok.getName() + "'s height has increaded to " + ratchanok.getHeight());
                System.out.println(ratchanok);
                System.out.println(wisaksil);
                System.out.println(tom);
        }
}
