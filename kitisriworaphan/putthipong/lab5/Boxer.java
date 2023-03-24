/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 19, 2022 
 *
 * This is Java class named Boxer which is subclass of Athlete class.
 * This class has three private instance variables: static sport, division, and golveSize.
 * The class has a public constructor which accepts values
 * for the fields name, weight, height, gender, nationality, birthdate, division and golveSize as parameters.
 * using the super() keyword in the constructor for the fields:
 * name, weight, height, gender, nationality, and birthdate as parameters from Athlete class.
 * And also has getter and setter methods for each instance attribute.
 * this class overrides the toString method to display each instance attribute seperated by comma.
**/

package kitisriworaphan.putthipong.lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Boxer extends Athlete {
    private static String sport = "Boxing";
    private String division;
    private String golveSize;

    public static String getSport() {
        return sport;
    }

    public static void setSport(String sport) {
        Boxer.sport = sport;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getGolveSize() {
        return golveSize;
    }

    public void setGolveSize(String golveSize) {
        this.golveSize = golveSize;
    }

    public Boxer(String name, double weight, double height, Gender gender, String nationality,
            String birthdate, String division, String golveSize) {
        super(name, weight, height, gender, nationality, birthdate);
        this.division = division;
        this.golveSize = golveSize;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return name + ", " + weight + "kg, " + height + "m, " + gender
                + ", " + nationality + ", "
                + LocalDate.parse(birthdateString, formatter) + ", " + sport + ", "
                + division + ", " + golveSize;
    }
}
