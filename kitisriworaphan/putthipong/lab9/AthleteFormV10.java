/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 10, 2023
 *
 * This program named AthleteFormV10 which extends from AthleteFormV9 and implements ListSelectionListener and ChangeListener
 * In this program will write code to detect the change in the JList component that handled by ListSelectionListener
 * And the change in the JSlider component that handled by ChangeListener
 * The program will display the sports that the user selects in the list in the JOptionPane message dialog
 * When the user moves the slider knob and stop the moving at some integer then the program displays the message dialog
**/

package kitisriworaphan.putthipong.lab9;

import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class AthleteFormV10 extends AthleteFormV9 implements ListSelectionListener, ChangeListener {
    protected String selectedSport;
    protected List<String> selectedSportList;

    public AthleteFormV10(String title) {
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
        AthleteFormV10 windowAthleteFormV10 = new AthleteFormV10("Athlete Form V10");
        windowAthleteFormV10.addComponents();
        windowAthleteFormV10.initValues();
        windowAthleteFormV10.addMenus();
        windowAthleteFormV10.addListeners();
        windowAthleteFormV10.setFrameFeatures();
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        sportList.addListSelectionListener(this);
        yearSlider.addChangeListener(this);
    }

    @Override
    protected void removeListener() {
        super.removeListener();
        sportList.removeListSelectionListener(this);
        yearSlider.removeChangeListener(this);
    }
    
    // define valueChanged method to handle event of sport list
    @Override
    public void valueChanged(ListSelectionEvent eListSelectionEvent) {
        ListSelectionModel listSelectionModel = sportList.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        boolean isAdjusting = eListSelectionEvent.getValueIsAdjusting();
        if (!isAdjusting) {
            selectedSport = "";
            selectedSportList = sportList.getSelectedValuesList();
            for (int i = 0; i < selectedSportList.size(); i++) {
                selectedSport += " " + selectedSportList.get(i);
            }
            if (!listSelectionModel.isSelectionEmpty()) {
                JOptionPane.showMessageDialog(this, "Selected sports are" + selectedSport);
            }      
        }
    }

    // define stateChanged method to handle event of slider
    @Override
    public void stateChanged(ChangeEvent eChangeEvent) {
        JSlider changeYearSlider = (JSlider) eChangeEvent.getSource();
        if (!changeYearSlider.getValueIsAdjusting()) {
            JOptionPane.showMessageDialog(this, "# of experience years is " + changeYearSlider.getValue());
        }
    }

}
