/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 19, 2022 
 *
 * This is Java class named Footballer which is subclass of Athlete class.
 * This class has three private instance variables: static sport, position, and team.
 * The class has a public constructor which accepts values
 * for the fields name, weight, height, gender, nationality, birthdate, position and team as parameters.
 * using the super() keyword in the constructor for the fields:
 * name, weight, height, gender, nationality, and birthdate as parameters from Athlete class.
 * And also has getter and setter methods for each instance attribute.
 * this class overrides the toString method to display each instance attribute seperated by comma.
**/

package kitisriworaphan.putthipong.lab5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Footballer extends Athlete {
    private static String sport = "American Football";
    private String position;
    private String team;

    public static String getSport() {
        return sport;
    }

    public static void setSport(String sport) {
        Footballer.sport = sport;
    }

    public String getPosision() {
        return position;
    }

    public void setPosision(String position) {
        this.position = position;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Footballer(String name, double weight, double height, Gender gender, String nationality,
            String birthdate, String position, String team) {
        super(name, weight, height, gender, nationality, birthdate);
        this.position = position;
        this.team = team;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return name + ", " + weight + "kg, " + height + "m, " + gender
                + ", " + nationality + ", "
                + LocalDate.parse(birthdate, formatter) + ", " + sport + ", "
                + position + ", " + team;
    }
}
