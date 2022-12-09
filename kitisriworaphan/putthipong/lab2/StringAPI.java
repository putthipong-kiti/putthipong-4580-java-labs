/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: December 9, 2022  
**/

package kitisriworaphan.putthipong.lab2;

public class StringAPI {
    public static void main(String[] args) {
        String schoolName = args[0];
        String lowerCase = schoolName.toLowerCase();
        if (lowerCase.contains("college")) {
            System.out.println(schoolName + " is a college");
        } else if (lowerCase.contains("university")) {
            System.out.println(schoolName + " is a university");
        } else {
            System.out.println(schoolName + " is neither a university nor a college");
        }
    }
}

/**
 *This program is accept an argument: school name as String
 *to determine if it is a college or a university
 *by using operations on strings: toUpperCase() on line 13
 *to convert the school name to lowercase 
 *and check if it contains the word "college" or "university".
 *Output format is
 *"<schoolname> is a college" or
 *"<schoolname> is a university" or
 *"<schoolname> is neither a university nor a college"
**/