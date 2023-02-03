/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: February 3, 2023
 *
 * This is Java program named WorldAthleteV3.
 * There were 3 objects created from classes BadmintonPlayerV2, FootballerV2, and BoxerV2
 * The values of all 3 objects were stored in an arraylist 
 * The toString method and the practice method of each object will execute when the program runs.
**/

package kitisriworaphan.putthipong.lab6;

import java.util.ArrayList;

import kitisriworaphan.putthipong.lab5.Athlete;

public class WorldAthleteV3 {
    public static void main(String[] args) {
        ArrayList<AthleteV2> athletes = new ArrayList<AthleteV2>();
        BadmintonPlayerV2 ratchanok = new BadmintonPlayerV2("Ratchanok Intanon", 55.0, 1.68, Athlete.Gender.FEMALE,
                "Thai", "05/02/1995");
        FootballerV2 tom = new FootballerV2("Tom Brady", 102, 1.93, Athlete.Gender.MALE,
                "American", "03/08/1977");
        BoxerV2 wisaksil = new BoxerV2("Wisaksil Wangek", 51.5, 1.60, Athlete.Gender.MALE,
                "Thai", "08/12/1986");
        athletes.add(ratchanok);
        athletes.add(tom);
        athletes.add(wisaksil);

        for (AthleteV2 athlete : athletes) {
            System.out.println(athlete);
            athlete.practice();
        }
    }
}
