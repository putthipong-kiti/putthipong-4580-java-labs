/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: February 3, 2023
 *
 * This is AFFChampionship class which is a subclass of Competition class
 * This class has four protected variables as teamA, teamB, description and sponsorship
 * And has two constructors : 
 * The first one accepts all variables of class Competition and also teamA and teamB.  
 * The second constructor accepts name, teamA, and teamB.
 * This class also overrides the toString method such that it gives the output as
 * <name of competition> + " in the final round was the game between " + <teamA> + " vs. " + <teamB> + "."
 * And has setPlace method such that it gives the output message as "<competition name> plays at these stadiums <places>"
 * And also has setSponsorship method such that it gives the output as 
 * "<sponsor> is a sponsor of <competition name>" in case if there is only one sponsor
 * "Sponsors of <competition name> are <sponsors>" in case if there are more than one sponsor
 * The setDescription method is an method as it does not have a body, similar to abstract methods.
**/

package kitisriworaphan.putthipong.lab6;

import java.util.ArrayList;

public class AFFChampionship extends Competition {
    protected String teamA;
    protected String teamB;
    protected String description;
    protected String sponsorship;

    public AFFChampionship(String name, String region, String teamA, String teamB) {
        super(name, region);
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public AFFChampionship(String name, String teamA, String teamB) {
        super(name);
        this.teamA = teamA;
        this.teamB = teamB;
    }

    @Override
    public String toString() {
        return name + " in the final round was the game between " + teamA + " vs. " + teamB + ".";
    }

    public void setPlaces(ArrayList<String> places) {
        System.out.println(name + " plays at these stadiums");
        System.out.println(places);
    }

    public void setDescription(String description) {
    }

    public void setSponsorship(ArrayList<String> sponsors) {
        if (sponsors.size() == 1) {
            System.out.println(sponsors.get(0) + " is a sponsor of " + name);
        } else {
            System.out.print("Sponsors of " + name + " are ");
            System.out.println(sponsors);
        }
    }
}
