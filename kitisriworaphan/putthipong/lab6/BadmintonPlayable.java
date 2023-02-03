/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: February 3, 2023
 *
 * This is interface called BadmintonPlayable
 * This interface contains two attributes which are racketLength and worldRanking
 * And has public getter and setter methods for racketLength and worldRanking variables
 * but these methods in this interface do not have a body because they are part of an interface
**/

package kitisriworaphan.putthipong.lab6;

public interface BadmintonPlayable {
    double racketLength = 0.00;
    int worldRanking = 0;

    public double getRacketLength();

    public void setRacketLength(double racketLength);
    
    public int getWorldRanking();

    public void setWorldRanking(int worldRanking);
}
