/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: February 3, 2023
 *
 * This is FootballerV2 class which is a subclass of AthleteV2 class
 * This class has a constructor like AthleteV2 class which accepts values 
 * for the fields name, weight, height, gender, nationality, and birthdate as parameters
 * And this class override the method practice() in class BadmintonPlayerV2 with the output message 
 * as <name> + " runs for 10 km and catches a football"
**/

package kitisriworaphan.putthipong.lab6;

public class FootballerV2 extends AthleteV2 {
    public FootballerV2(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    @Override
    public void practice() {
        super.practice();
        System.out.println("and catches a football");
    }
}
