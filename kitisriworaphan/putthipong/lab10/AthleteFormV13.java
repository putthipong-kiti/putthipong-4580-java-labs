/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 16, 2023
 * 
 * This is Java program named AthleteFormV13 which extends from AthleteFormV12
 * In this version, the program will check whether weight and height are valid double numbers
 * In addition, the weight value needs to be in the range (0, 200] and the height value needs to be in the range (0, 300]
 * If the program finds that weight or height is not a number text or within the specified range,
 * the program will display the dialog with the error message
**/

package kitisriworaphan.putthipong.lab10;

import javax.swing.*;
import java.awt.event.*;

public class AthleteFormV13 extends AthleteFormV12 {
    final protected Double MAX_WEIGHT = 200D, MAX_HEIGHT = 300D;
    protected int weight, height;
    protected String weightTextFieldName, heightTextFieldName, weightText, heightText;

    public AthleteFormV13(String title) {
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
        AthleteFormV13 windowAthleteFormV13 = new AthleteFormV13("Athlete Form V13");
        windowAthleteFormV13.addComponents();
        windowAthleteFormV13.initValues();
        windowAthleteFormV13.addMenus();
        windowAthleteFormV13.addListeners();
        windowAthleteFormV13.setFrameFeatures();
    }

    // override method addComponents to set name of weight textfield and height textfield
    @Override
    protected void addComponents() {
        super.addComponents();
        weighTextField.setName("Weight");
        heighTextField.setName("Height");
    }

    // If the weight input or height input is invalid or out of range, that's mean getValidNumber return -1
    // The program will display the dialog with the error message
    @Override
    public void actionPerformed(ActionEvent eActionEvent) {
        getWeightHeightValue();
        if (eActionEvent.getSource() == weighTextField) {
            weight = getValidNumber(weightTextFieldName, weightText, MAX_WEIGHT);
            if (weight == -1) {
                return;
            }
        }
        if (eActionEvent.getSource() == heighTextField) {
            height = getValidNumber(heightTextFieldName, heightText, MAX_HEIGHT);
            if (height == -1) {
                return;
            }
        }
        super.actionPerformed(eActionEvent);
    }

    // If the weight input or height input is invalid or out of range, it means getValidNumber return -1
    // The program will display the dialog with the error message and method will return without any further processing
    @Override
    protected void addAthlete() {
        getWeightHeightValue();
        weight = getValidNumber(weightTextFieldName, weightText, MAX_WEIGHT);
        if (weight == -1) {
            return;
        }
        height = getValidNumber(heightTextFieldName, heightText, MAX_HEIGHT);
        if (height == -1) {
            return;
        } 
        super.addAthlete();
    }

    // If the weight input or height input is invalid or out of range, it means getValidNumber return -1
    // The program will display the dialog with the error message and method will return without any further processing
    protected void getWeightHeightValue() {
        weightTextFieldName = weighTextField.getName();
        heightTextFieldName = heighTextField.getName();
        weightText = weighTextField.getText();
        heightText = heighTextField.getText();
    }

    // define method getValidNumber to check if the weight or height is not a number text or not within the specified range
    // If the weight or height is not a number text or not within the specified range, 
    // this method will return -1 and display the dialog with the error message
    protected int getValidNumber(String textFieldName, String numberText, Double MAX_NUMBER) {
        if (isNumber(numberText)) {
            Double number = Double.parseDouble(numberText);
            if (number <= 0) {
                JOptionPane.showMessageDialog(this, textFieldName + " should be greater than 0");
                return -1;
            } else if (number > MAX_NUMBER) {
                JOptionPane.showMessageDialog(this, textFieldName + " should be less than " + MAX_NUMBER);
                return -1;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for " + textFieldName);
            return -1;
        }
        return 1;
    }

    // define method isNumber to check if text is numeric will return true
    // If text end with "D", "d", "F", "f" means suffix indicates "double" literal and "float" literal, this method will return false
    protected boolean isNumber(String numberString) {
        if (numberString.endsWith("D") || numberString.endsWith("d") 
               || numberString.endsWith("F") ||numberString.endsWith("f")) {
            return false;
        } else {
            try {
                Double.parseDouble(numberString);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }
}
