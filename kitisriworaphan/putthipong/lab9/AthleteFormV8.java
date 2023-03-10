/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 10, 2023
 *
 * This program named AthleteFormV8 which extends from AthleteFormV6 and implements ActionListener
 * AthleteFormV8 will handle three buttons which are the submit, cancel, and reset
 * When the user clicks submit button, the program gets all values from all components and displays in the Bio text area
 * When the user clicks cancel button, the program undo all settings as same as AthleteFormV6
 * When the user clicks reset button, the program reset all values and background color of all text fields to white color
**/

package kitisriworaphan.putthipong.lab9;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import kitisriworaphan.putthipong.lab8.AthleteFormV6;

public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {
    protected String resultText;

    public AthleteFormV8(String title) {
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
        AthleteFormV8 windowAthleteFormV8 = new AthleteFormV8("Athlete Form V8");
        windowAthleteFormV8.addComponents();
        windowAthleteFormV8.addMenus();
        windowAthleteFormV8.addListeners();
        windowAthleteFormV8.setFrameFeatures();
        windowAthleteFormV8.initValues();
    }

    // define initValues method to set the values in all components
    public void initValues() {
        nameTextField.setText("Manee");
        weighTextField.setText("50");
        heighTextField.setText("170");
        dateOfBirthTextField.setText("01/01/2000");
        nameTextField.setBackground(Color.PINK);
        weighTextField.setBackground(Color.PINK);
        heighTextField.setBackground(Color.PINK);
        dateOfBirthTextField.setBackground(Color.PINK);
        femaleButton.setSelected(true);
        yearSlider.setValue(10);
    }

    // add ActionListener to each button in addListeners method
    protected void addListeners() {
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    // define actionPerformed method to handle event of each button
    @Override
    public void actionPerformed(ActionEvent eActionEvent) {
        Object srcActionObject = eActionEvent.getSource();
        if (srcActionObject == submitButton) {
            handleSubmitButton();
        } else if (srcActionObject == cancelButton) {
            handleCancelButton();
        } else if (srcActionObject == resetButton) {
            handleResetButton();
        }
    }

    // define handleSubmitButton to handle event of submit button
    protected void handleSubmitButton() {
        getValues();
        bioTextArea.setText(resultText);
    }

    // define getValues method to get all values from all components in result text
    protected void getValues() {
        resultText = "";
        String nameText = "Name: " + nameTextField.getText() + "\n";
        String weightText = "Weight: " + weighTextField.getText() + "\n";
        String heightText = "Height:" + heighTextField.getText() + "\n";
        String dateOfBirthText = "Date of birth:" + dateOfBirthTextField.getText() + "\n";
        ArrayList<String> hobbies = new ArrayList<String>();
        JCheckBox[] hobbiesCheckBoxs = { readingCheckBox, gardeningCheckBox, movieCheckBox, shoppingCheckBox,
                othersCheckBox };
        for (int i = 0; i < hobbiesCheckBoxs.length; i++) {
            if (hobbiesCheckBoxs[i].isSelected()) {
                hobbies.add(hobbiesCheckBoxs[i].getActionCommand());
            }
        }
        String hobbiesString = Arrays.toString(hobbies.toArray()).replace("[", "").replace("]", "");
        String hobbiesText = "Hobbies:" + hobbiesString + "\n";
        String nationalityText = "Nationality:" + nationalityComboBox.getSelectedItem() + "\n";
        String sportText = "Sport:" + sportList.getSelectedValuesList() + "\n";
        String yearText = "Experience years:" + String.valueOf(yearSlider.getValue()) + "\n";
        resultText += nameText;
        resultText += weightText;
        resultText += heightText;
        resultText += dateOfBirthText;
        if (maleButton.isSelected()) {
            String maleText = "Gender:" + maleButton.getActionCommand() + "\n";
            resultText += maleText;
        }
        if (femaleButton.isSelected()) {
            String femaleText = "Gender:" + femaleButton.getActionCommand() + "\n";
            resultText += femaleText;
        }
        resultText += hobbiesText;
        resultText += nationalityText;
        resultText += sportText;
        resultText += yearText;
    }

    // define handleCancelButton method to handle event of cancel button
    protected void handleCancelButton() {
        nameTextField.setText("");
        weighTextField.setText("");
        heighTextField.setText("");
        dateOfBirthTextField.setText("");
        bioTextArea.setText("");
        genderGroup.clearSelection();
        readingCheckBox.setSelected(false);
        gardeningCheckBox.setSelected(false);
        movieCheckBox.setSelected(true);
        shoppingCheckBox.setSelected(false);
        othersCheckBox.setSelected(false);
        nationalityComboBox.setSelectedItem("Thai");
        sportList.setSelectedIndex(2);
        yearSlider.setValue(0);
        nameTextField.setBackground(kkuColor);
        weighTextField.setBackground(kkuColor);
        heighTextField.setBackground(kkuColor);
        dateOfBirthTextField.setBackground(kkuColor);
    }

    // define handleResetButton method to handle event of reset button
    protected void handleResetButton() {
        nameTextField.setText("");
        weighTextField.setText("");
        heighTextField.setText("");
        dateOfBirthTextField.setText("");
        bioTextArea.setText("");
        genderGroup.clearSelection();
        readingCheckBox.setSelected(false);
        gardeningCheckBox.setSelected(false);
        movieCheckBox.setSelected(false);
        shoppingCheckBox.setSelected(false);
        othersCheckBox.setSelected(false);
        nationalityComboBox.setSelectedItem(null);
        sportList.clearSelection();
        yearSlider.setValue(0);
        nameTextField.setBackground(Color.WHITE);
        weighTextField.setBackground(Color.WHITE);
        heighTextField.setBackground(Color.WHITE);
        dateOfBirthTextField.setBackground(Color.WHITE);
    }
}
