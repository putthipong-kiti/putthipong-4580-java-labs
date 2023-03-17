/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 16, 2023
 * 
 * This is Java program named AthleteFormV12 which extends from AthleteFormV11
 * In this version, the program can sort athletes according to their names, their height, and their height and then weight
 * After the user clicks menu Sort >> By Name, the program will show the list of athletes sorted by names
 * After the user clicks menu Sort >> By Height, the program will show show the list of athletes sorted by heights
 * After the user clicks menu Sort >> By Height and Weight, the program will show the list of athletes sorted by height and then weight
**/

package kitisriworaphan.putthipong.lab10;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class AthleteFormV12 extends AthleteFormV11 {

    public AthleteFormV12(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        AthleteFormV12 windowAthleteFormV12 = new AthleteFormV12("Athlete Form V12");
        windowAthleteFormV12.addComponents();
        windowAthleteFormV12.initValues();
        windowAthleteFormV12.addMenus();
        windowAthleteFormV12.addListeners();
        windowAthleteFormV12.setFrameFeatures();
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        sortByNameMenuItem.addActionListener(this);
        sortByHeightMenuItem.addActionListener(this);
        sortByHeightAndWeightMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent eActionEvent) {
        super.actionPerformed(eActionEvent);
        if (eActionEvent.getSource() == sortByNameMenuItem) {
            sortName();
        }
        if (eActionEvent.getSource() == sortByHeightMenuItem) {
            sortHeight();
        }
        if (eActionEvent.getSource() == sortByHeightAndWeightMenuItem) {
            sortHeightAndWeight();
        }
    }

    // define sortName method to create instance of NameComparator class and sorted by names then display the result
    protected void sortName() {
        NameComparator sortingName = new NameComparator();
        Collections.sort(athletes, sortingName);
        displayAthlete();
    }

    // define sortHeight method to create instance of HeightComparator class and sorted by heights then display the result
    protected void sortHeight() {
        HeightComparator sortingHeight = new HeightComparator();
        Collections.sort(athletes, sortingHeight);
        displayAthlete();
    }

    // define sortHeightAndWeight method to create instance of HeightWeightComparator class 
    // and sorted by height and then weight then display the result
    protected void sortHeightAndWeight() {
        HeightWeightComparator sortingHeightWeight = new HeightWeightComparator();
        Collections.sort(athletes, sortingHeightWeight);
        displayAthlete();
    }
}
