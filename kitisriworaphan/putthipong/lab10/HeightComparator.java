/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 16, 2023
 * 
 * This is Java class named HeightComparator which implements interface Comparator of objects in type AthleteV2
 * In this class, the method compare has been implemented to compare two athletes using their heights
**/

package kitisriworaphan.putthipong.lab10;

import java.util.Comparator;
import kitisriworaphan.putthipong.lab6.AthleteV2;

public class HeightComparator implements Comparator<AthleteV2> {
    @Override
    public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
        if (athlete1.getHeight() < athlete2.getHeight()) {
            return -1;
        } else if (athlete1.getHeight() == athlete2.getHeight()) {
            return 0;
        } else {
            return 1;
        }
    }
}
