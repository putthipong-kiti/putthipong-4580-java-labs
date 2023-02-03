/**
 *Author: Putthipong Kitisriworaphan
 *ID: 653040458-0
 *Sec: 1
 *Date: February 3, 2023
 *
 * This is abstract class Competition which has two protected variables as name and region
 * This class has public getter and setter methods for name and region variables
 * And also has two abstract methods which is called setDescription and setSponsorship
**/

package kitisriworaphan.putthipong.lab6;

import java.util.ArrayList;

public abstract class Competition {
    protected String name;
    protected String region;

    public Competition(String name, String region) {
        this.name = name;
        this.region = region;
    }

    public Competition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public abstract void setDescription(String description);

    public abstract void setSponsorship(ArrayList<String> sponsorship);
}
