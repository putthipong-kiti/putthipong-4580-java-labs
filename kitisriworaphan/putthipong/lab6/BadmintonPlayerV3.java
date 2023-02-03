/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: February 3, 2023
 *
 * This is Java class named BadmintonPlayerV3 which is a subclass of BadmintonPlayerV2 
 * and implements interface BadmintonPlayable and Sprinter
 * This class has three protected attributes: racketLength, worldRanking, and speed
 * And override the method toString() by having the same output as the Athlete object has and also has its own string as 
 * "<name> is a Badminton player whose world ranking is <worldRanking> and has sprint speed as <speed>"
**/

package kitisriworaphan.putthipong.lab6;

public class BadmintonPlayerV3 extends BadmintonPlayerV2 implements BadmintonPlayable, Sprinter {
    protected double racketLength;
    protected int worldRanking;
    protected double speed;

    @Override
    public String toString() {
        return super.toString() + "\n" + name + " is a Badminton player whose world ranking is " + worldRanking
                + " and has sprint speed as " + speed;
    }

    public BadmintonPlayerV3(String name, double weight, double height, Gender gender, String nationality,
            String birthdate) {
        super(name, weight, height, gender, nationality, birthdate);
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public double getRacketLength() {
        return racketLength;
    }

    @Override
    public void setRacketLength(double racketLength) {
        this.racketLength = racketLength;
    }

    @Override
    public int getWorldRanking() {
        return worldRanking;
    }

    @Override
    public void setWorldRanking(int worldRanking) {
        this.worldRanking = worldRanking;
    }
}
