/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: February 3, 2023
 *
 * This is AthleteV2 class which is a subclass of Athlete class
 * This class has a constructor like Athlete class which accepts values 
 * for the fields name, weight, height, gender, nationality, and birthdate as parameters
 * AthleteV2 class contains an instance method called practice()
 * The output message of practice method : <name> + “ runs for 10 km”
**/

package kitisriworaphan.putthipong.lab6;

import kitisriworaphan.putthipong.lab5.Athlete;

public class AthleteV2 extends Athlete {
    public AthleteV2(String name, double weight, double height, Gender gender, String nationality, String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    public void practice() {
        System.out.print(name + " runs for 10 km ");
    }
}
