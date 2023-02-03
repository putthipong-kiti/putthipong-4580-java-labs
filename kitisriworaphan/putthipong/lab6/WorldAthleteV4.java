/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: February 3, 2023
 *
 * This is Java program named WorldAthleteV4
 * Two objects are created in this program amed akane and ratchanok
 * setWorldRanking method and setSpeed method are used, and also toString method of both objects
**/

package kitisriworaphan.putthipong.lab6;

import kitisriworaphan.putthipong.lab5.*;
import java.util.*;

public class WorldAthleteV4 {
    public static void main(String[] args) {
        BadmintonPlayerV3 akane = new BadmintonPlayerV3("Akane Yamaguchi", 55, 1.68, Athlete.Gender.FEMALE,
                "Japan", "05/02/1997");
        BadmintonPlayerV3 ratchanok = new BadmintonPlayerV3("Ratchanok Intanon", 55.0, 1.68, Athlete.Gender.FEMALE,
                "Thai", "05/02/1995");
        akane.setWorldRanking(1);
        ratchanok.setWorldRanking(6);
        akane.setSpeed(4);
        ratchanok.setSpeed(6);
        ArrayList<BadmintonPlayerV3> badmintonPlayers = new ArrayList<BadmintonPlayerV3>();
        badmintonPlayers.add(akane);
        badmintonPlayers.add(ratchanok);
        for (BadmintonPlayerV3 badmintonPlayer : badmintonPlayers) {
            System.out.println(badmintonPlayer);
        }
    }
}
