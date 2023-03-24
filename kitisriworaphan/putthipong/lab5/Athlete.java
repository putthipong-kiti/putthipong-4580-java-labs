/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 19, 2022 
 *
 * This is a Java class named Athlete.
 * This class has six instance variables: name, weight, height, gender, nationality, and birthdate.
 * It also has an enum called Gender that contains two values: 
 * MALE and FEMALE, which is used as a value for the variable gender.
 * The class has a public constructor which accepts values 
 * for the fields name, height, gender, nationality, and birthdate as parameters.
 * It has getter and setter methods for each instance attribute of the Athlete class.
 * It also has a method called compareAge that accepts another athlete, 
 * then compares the age of the instance athlete using java.time.LocalDate, 
 * java.time.format.DateTimeFormatter and java.time.temporal.ChronoUnit.
 * And this class overrides the toString method to display the information of an athlete.
**/

package kitisriworaphan.putthipong.lab5;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

// implement Serializable for lab11
public class Athlete implements Serializable {
    protected String name;
    protected double weight;
    protected double height;

    public enum Gender {
        MALE, FEMALE
    }

    protected Gender gender;
    protected String nationality;
    protected String birthdateString;
    protected LocalDate birthDate;

    public Athlete(String name, double weight, double height, Gender gender, String nationality,
            String birthdateString) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.nationality = nationality;
        this.birthdateString = birthdateString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getBirthdateString() {
        return birthdateString;
    }

    public void setBirthdateString(String birthdate) {
        this.birthdateString = birthdate;
    }

    public void compareAge(BadmintonPlayer athleteB) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateBefore = LocalDate.parse(birthdateString, formatter);
        LocalDate dateAfter = LocalDate.parse(athleteB.getBirthdateString(), formatter);
        long yearDiff = ChronoUnit.YEARS.between(dateBefore, dateAfter);
        if (yearDiff > 0) {
            System.out.println(athleteB.name + " is " + yearDiff + " years younger than " + name);
        } else if (yearDiff < 0) {
            System.out.println(athleteB.name + " is " + Math.abs(yearDiff) + " years older than " + name);
        } else if (yearDiff == 0) {
            System.out.println(athleteB.name + " is as old as " + name);
        }
    }

    public void compareAge(Boxer athleteB) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateBefore = LocalDate.parse(birthdateString, formatter);
        LocalDate dateAfter = LocalDate.parse(athleteB.birthdateString, formatter);
        long yearDiff = ChronoUnit.YEARS.between(dateBefore, dateAfter);
        if (yearDiff > 0) {
            System.out.println(athleteB.name + " is " + yearDiff + " years younger than " + name);
        } else if (yearDiff < 0) {
            System.out.println(athleteB.name + " is " + Math.abs(yearDiff) + " years older than " + name);
        } else if (yearDiff == 0) {
            System.out.println(athleteB.name + " is as old as " + name);
        }
    }

    public void compareAge(Footballer athleteB) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateBefore = LocalDate.parse(birthdateString, formatter);
        LocalDate dateAfter = LocalDate.parse(athleteB.getBirthdateString(), formatter);
        long yearDiff = ChronoUnit.YEARS.between(dateBefore, dateAfter);
        if (yearDiff > 0) {
            System.out.println(athleteB.name + " is " + yearDiff + " years younger than " + name);
        } else if (yearDiff < 0) {
            System.out.println(athleteB.name + " is " + Math.abs(yearDiff) + " years older than " + name);
        } else if (yearDiff == 0) {
            System.out.println(athleteB.name + " is as old as " + name);
        }
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        birthDate = LocalDate.parse(birthdateString, formatter);
        return "Athlete [" + name + ", " + weight + "kg, " + height + "m, " + gender + ", " + nationality + ", "
                + birthDate + "]";
    }
}
