/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 16, 2023
 * 
 * This is Java program named AthleteFormV11 which extends from AthleteFormV10
 * In this program, there is a menu named "Data" which has menu items "Add", "Display", "Clear", "Search"
 * and a menu named "Sort" which has menu items "By Name", "By Height", and "By Height and Weight"
 * In this program, user can add the information of each athlete into a list which you can implement by using class ArrayList
 * When the user clicks menu item "Add", the program will display the information of the athlete
 * When the user clicks menu item "Display", the program will display the list of mobile devices in the athletes
 * When the user clicks the menu item "Clear", the program will remove all athletes in the list 
 * When the user clicks the menu item "Search", the program will accept the athlete name to search and display the result
**/

package kitisriworaphan.putthipong.lab10;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import kitisriworaphan.putthipong.lab5.Athlete.Gender;
import kitisriworaphan.putthipong.lab6.AthleteV2;
import kitisriworaphan.putthipong.lab9.AthleteFormV10;

public class AthleteFormV11 extends AthleteFormV10 {
    protected JMenu dataMenu, sortMenu;
    protected JMenuItem addMenuItem, displayMenuItem, clearMenuItem, searchMenuItem, sortByNameMenuItem, sortByHeightMenuItem,
            sortByHeightAndWeightMenuItem;
    protected ArrayList<AthleteV2> athletes = new ArrayList<AthleteV2>();
    protected Gender gender;

    public AthleteFormV11(String title) {
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
        AthleteFormV11 windowAthleteFormV11 = new AthleteFormV11("Athlete Form V11");
        windowAthleteFormV11.addComponents();
        windowAthleteFormV11.initValues();
        windowAthleteFormV11.addMenus();
        windowAthleteFormV11.addListeners();
        windowAthleteFormV11.setFrameFeatures();
    }

    @Override
    protected void addMenus() {
        super.addMenus();
        // creating menu data and menu item of menu data
        dataMenu = new JMenu("Data");
        addMenuItem = new JMenuItem("Add");
        displayMenuItem = new JMenuItem("Display");
        clearMenuItem = new JMenuItem("Clear");
        searchMenuItem = new JMenuItem("Search");
        sortMenu = new JMenu("Sort");
        sortByNameMenuItem = new JMenuItem("By Name");
        sortByHeightMenuItem = new JMenuItem("By Height");
        sortByHeightAndWeightMenuItem = new JMenuItem("By Height and Weight");
        sortMenu.add(sortByNameMenuItem);
        sortMenu.add(sortByHeightMenuItem);
        sortMenu.add(sortByHeightAndWeightMenuItem);
        dataMenu.add(addMenuItem);
        dataMenu.add(displayMenuItem);
        dataMenu.add(clearMenuItem);
        dataMenu.add(searchMenuItem);
        dataMenu.add(sortMenu);
        // set font of menu item
        dataMenu.setFont(sanSerifBold14);
        addMenuItem.setFont(sanSerifBold14);
        displayMenuItem.setFont(sanSerifBold14);
        clearMenuItem.setFont(sanSerifBold14);
        searchMenuItem.setFont(sanSerifBold14);
        sortMenu.setFont(sanSerifBold14);
        sortByNameMenuItem.setFont(sanSerifBold14);
        sortByHeightMenuItem.setFont(sanSerifBold14);
        sortByHeightAndWeightMenuItem.setFont(sanSerifBold14);
        // add menu data to manu bar
        menuBar.add(dataMenu);
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        addMenuItem.addActionListener(this);
        displayMenuItem.addActionListener(this);
        clearMenuItem.addActionListener(this);
        searchMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent eActionEvent) {
        if (eActionEvent.getSource() == addMenuItem) {
            addAthlete();
        }
        if (eActionEvent.getSource() == displayMenuItem) {
            displayAthlete();
        }
        if (eActionEvent.getSource() == clearMenuItem) {
            clearAthlete();
        }
        if (eActionEvent.getSource() == searchMenuItem) {
            searchAthlete();
        } else {
            super.actionPerformed(eActionEvent);
        }
    }

    // add athlete to ArrayList and display the information of the athlete
    protected void addAthlete() {
        String name = nameTextField.getText();
        Double weight = Double.parseDouble(weighTextField.getText());
        Double height = Double.parseDouble(heighTextField.getText());
        if (maleButton.isSelected()) {
            gender = Gender.MALE;
        }
        if (femaleButton.isSelected()) {
            gender = Gender.FEMALE;
        }
        String nationality = nationalityComboBox.getSelectedItem().toString();
        String birthDate = dateOfBirthTextField.getText();
        AthleteV2 athlete = new AthleteV2(name, weight, height, gender, nationality, birthDate);
        athletes.add(athlete);
        String athleteInfo = athlete.toString();
        JOptionPane.showMessageDialog(this, athleteInfo);
    }

    // display the list of mobile devices in the athletes
    protected void displayAthlete() {
        if (athletes.size() == 0) {
            JOptionPane.showMessageDialog(this, "There is no athlete in the list");
        } else if (athletes.size() == 1) {
            String displayAthletesInfo = "There is one athlete as follows:" + "\n" + "1. " + athletes.get(0);
            JOptionPane.showMessageDialog(this, displayAthletesInfo);
        } else {
            String displayAthletesInfo = "There are " + athletes.size() + " athletes as follows:" + "\n";
            for (int i = 0; i < athletes.size(); i++) {
                displayAthletesInfo += Integer.toString(i + 1) + ". " + athletes.get(i) + "\n";
            }
            JOptionPane.showMessageDialog(this, displayAthletesInfo);
        }
    }

    // remove all athletes in the list 
    protected void clearAthlete() {
        athletes.clear();
    }

    // open the input dialog to accept the athlete name to search and display the result
    protected void searchAthlete() {
        String searchingName = JOptionPane.showInputDialog(this, "Please enter athlete name:");
        if (search(athletes, searchingName)) {
            for (AthleteV2 athlete : athletes) {
                if (searchingName.equalsIgnoreCase(athlete.getName())) {
                    JOptionPane.showMessageDialog(this, athlete.toString() + " is found");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Athlete " + searchingName + " is NOT found");
        }
    }

    // check if the athlete with that name is found
    protected boolean search(ArrayList<AthleteV2> athletes, String searchingName) {
        boolean isItemFound = false;
        for (AthleteV2 athlete : athletes) {
            if (searchingName.equalsIgnoreCase(athlete.getName())) {
                isItemFound = true;
                return isItemFound;
            }
        }
        return isItemFound;
    }
}
