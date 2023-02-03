/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: February 3, 2023
 *
 * This is interface called Sprinter
 * This interface contains one attributes which are speed
 * And has public getter and setter methods for speed variable
 * but these methods in this interface do not have a body because they are part of an interface
**/

package kitisriworaphan.putthipong.lab6;

public interface Sprinter {
    double speed = 0.00;

    public double getSpeed();

    public void setSpeed(double speed);
}
