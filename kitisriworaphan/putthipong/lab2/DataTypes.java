/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: December 9, 2022
 *
 *This program is an example of variable declarations
 *which contain string, char, boolean, int, long, float, double.
 *And using octal format on line 16, hexadecimal format on line 17
 *when displaying the results, it will display in decimal format 
**/

package kitisriworaphan.putthipong.lab2;

public class DataTypes {
    public static void main(String[] args) {
        String name = "Putthipong Kitisriworaphan";
        String id = "6530404580";
        char firstletter_name = name.charAt(0);
        Boolean boolean1 = true;
        int myIDInOctal = 0120;
        int myIDInHexaDecimal = 0x50;
        long lastTwoID = 80L;
        float lastTwoID_FirstTwoID = 80.65f;
        double lastTwoID_LastTwoYear = 80.22d;
        System.out.println("My name is " + name);
        System.out.println("My student ID was " + id);
        System.out.println(firstletter_name + " " + boolean1 + " " + myIDInOctal + " " + myIDInHexaDecimal);
        System.out.println(myIDInHexaDecimal + " " + lastTwoID + " " + lastTwoID_FirstTwoID + " " + lastTwoID_LastTwoYear);
    }
}