/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 24, 2023
 * 
 * This is Java program named AthleteFormV16 which extends from AthleteFormV15
 * In this problem, when the user chooses menu Save, the program not only saves hobbies in the first text file 
 * and experience years in the second binary file, but also the object athlete in the Java type AthleteV2 in the third binary file
 * when the user chooses menu Open, the program not only reads hobbies from the first text file 
 * and reads the experiences year from the second binary file 
 * but also the object athlete from the third binary file 
 * and displays hobbies, experience years, and the athlete object in the text area
**/

package kitisriworaphan.putthipong.lab11;

import java.io.*;
import javax.swing.*;
import kitisriworaphan.putthipong.lab5.Athlete.Gender;
import kitisriworaphan.putthipong.lab6.AthleteV2;

public class AthleteFormV16 extends AthleteFormV15 {
    public AthleteFormV16(String title) {
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
        AthleteFormV16 windowAthleteFormV16 = new AthleteFormV16("Athlete Form V16");
        windowAthleteFormV16.addComponents();
        windowAthleteFormV16.initValues();
        windowAthleteFormV16.addMenus();
        windowAthleteFormV16.addListeners();
        windowAthleteFormV16.setFrameFeatures();
    }

    @Override
    protected void handleSaveMenuItem() {
        super.handleSaveMenuItem();
        fileChooser.setSelectedFile(new File(""));
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                FileOutputStream fileOutput = new FileOutputStream(file);
                ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
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
                // create instance of class AthleteV2 to write object
                AthleteV2 athlete = new AthleteV2(name, weight, height, gender, nationality, birthDate);
                objectOutput.writeObject(athlete);
                JOptionPane.showMessageDialog(this, athlete);
                JOptionPane.showMessageDialog(this, "Saving the athlete in the file " + file.getAbsolutePath());
                fileOutput.close();
                objectOutput.close();
            } catch (Exception exception) {
                exception.printStackTrace(System.err);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Save menu cancelled by user");
        }
    }

    @Override
    protected void handleOpenMenuItem() {
        super.handleOpenMenuItem();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                FileInputStream fileInput = new FileInputStream(selectedFile);
                ObjectInputStream objectInput = new ObjectInputStream(fileInput);
                AthleteV2 athleteData = (AthleteV2) objectInput.readObject();
                bioTextArea.append(athleteData + "\n");
                fileInput.close();
                objectInput.close();

            } catch (Exception exception) {
                exception.printStackTrace(System.err);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Open menu cancelled by user");
        }
    }
}
