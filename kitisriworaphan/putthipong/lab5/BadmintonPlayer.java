/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 19, 2022 
 *
 * This is Java class named BadmintonPlayer which is subclass of Athlete class.
 * This class has three private instance variables: static sport, racketLength, and worldRanking.
 * The class has a public constructor which accepts values
 * for the fields name, weight, height, gender, nationality, birthdate, racketLength and worldRanking as parameters.
 * using the super() keyword in the constructor for the fields:
 * name, weight, height, gender, nationality, and birthdate as parameters from Athlete class.
 * And also has getter and setter methods for each instance attribute.
 * this class overrides the toString method to display each instance attribute seperated by comma.
**/

package kitisriworaphan.putthipong.lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BadmintonPlayer extends Athlete {
    private static String sport = "Badminton";
    private double racketLength;
    private int worldRanking;

    public BadmintonPlayer(String name, double weight, double height, Gender gender, String nationality,
            String birthdate, double racketLength, int worldRanking) {
        super(name, weight, height, gender, nationality, birthdate);
        this.racketLength = racketLength;
        this.worldRanking = worldRanking;
    }

    public static String getSport() {
        return sport;
    }

    public static void setSport(String sport) {
        BadmintonPlayer.sport = sport;
    }

    public double getRacketLength() {
        return racketLength;
    }

    public void setRacketLength(double racketLength) {
        this.racketLength = racketLength;
    }

    public int getWorldRanking() {
        return worldRanking;
    }

    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return name + ", " + weight + "kg, " + height + "m, " + gender
                + ", " + nationality + ", "
                + LocalDate.parse(birthdateString, formatter) + ", " + sport + ", "
                + racketLength + "cm, rank:" + worldRanking;
    }
}