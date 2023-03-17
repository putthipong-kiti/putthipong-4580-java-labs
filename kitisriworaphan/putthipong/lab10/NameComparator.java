/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 16, 2023
 * 
 * This is Java class named NameComparator which implements interface Comparator of objects in type AthleteV2
 * In this class, the method compare has been implemented to compare two athletes using their names
**/

package kitisriworaphan.putthipong.lab10;

import java.util.Comparator;
import kitisriworaphan.putthipong.lab6.AthleteV2;

public class NameComparator implements Comparator<AthleteV2> {
    @Override
    public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
        return athlete1.getName().compareToIgnoreCase(athlete2.getName());
    }
}
