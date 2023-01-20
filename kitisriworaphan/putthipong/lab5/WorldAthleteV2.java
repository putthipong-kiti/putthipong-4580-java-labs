/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: January 19, 2022 
 *
 * This is Java program named WorldAthleteV2.
 * Four objects are created in this program, named ratchanok, wisaksil, tom and nitchaon.
 * The compareAge method is called to compare the age of the ratchanok with tom and nitchaon.
 * And isTaller method is created and called to compare the height of wisaksil and tom.
**/

package kitisriworaphan.putthipong.lab5;

public class WorldAthleteV2 {
    public static void main(String[] args) {
        BadmintonPlayer ratchanok = new BadmintonPlayer("Ratchanok Intanon", 55, 1.68, Athlete.Gender.FEMALE,
                "Thai", "05/02/1995", 66.5, 4);
        Boxer wisaksil = new Boxer("Wisaksil Wangek", 51.5, 1.60, Athlete.Gender.MALE,
                "Thai", "08/12/1986", "Super Flyweight", "M");
        Footballer tom = new Footballer("Tom Brady", 102, 1.93, Athlete.Gender.MALE,
                "American", "03/08/1977", "Quarterback", "New England Patriots");
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
        BadmintonPlayer nitchaon = new BadmintonPlayer("Nitchaon Jindapol", 52, 1.63, Athlete.Gender.FEMALE, "Thailand",
                "31/03/1998", 67, 11);
        System.out.println(
                "Both " + ratchanok.getName() + " and " + nitchaon.getName() + " play " + BadmintonPlayer.getSport());
        ratchanok.compareAge(tom);
        ratchanok.compareAge(nitchaon);

        if (isTaller(wisaksil, tom)) {
            System.out.println(wisaksil.getName() + " is taller than " + tom.getName());
        } else {
            System.out.println(wisaksil.getName() + " is not taller than " + tom.getName());
        }
    }

    public static boolean isTaller(Athlete athleteA, Athlete athleteB) {
        if (athleteA.height > athleteB.height) {
            return true;
        } else {
            return false;
        }
    }
}
