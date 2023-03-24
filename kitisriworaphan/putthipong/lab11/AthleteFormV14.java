/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 24, 2023
 * 
 * This is Java program named AthleteFormV14 which extends from AthleteFormV13
 * In this problem, when the user chooses menu Save, the program saves hobbies in the file
 * when the user chooses menu Open, the program reads the file and displays hobbies in the Bio text area
 * After the user chooses menu Save, the program will open the save file dialog to ask the user to enter the filename in extension .txt
**/

package kitisriworaphan.putthipong.lab11;

import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import kitisriworaphan.putthipong.lab10.AthleteFormV13;

public class AthleteFormV14 extends AthleteFormV13 {
    protected JFileChooser fileChooser;
    protected int selectedHobbySize;

    public AthleteFormV14(String title) {
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
        AthleteFormV14 windowAthleteFormV14 = new AthleteFormV14("Athlete Form V14");
        windowAthleteFormV14.addComponents();
        windowAthleteFormV14.initValues();
        windowAthleteFormV14.addMenus();
        windowAthleteFormV14.addListeners();
        windowAthleteFormV14.setFrameFeatures();
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        fileChooser = new JFileChooser();
    }

    @Override
    public void actionPerformed(ActionEvent eActionEvent) {
        if (eActionEvent.getSource() == saveItem) {
            handleSaveMenuItem();
        } else if (eActionEvent.getSource() == openItem) {
            handleOpenMenuItem();
        } else {
            super.actionPerformed(eActionEvent);
        }
    }

    protected void handleSaveMenuItem() {
        // define file name as ".txt" so that user can understand easily that the file saves text characters
        fileChooser.setSelectedFile(new File(".txt"));
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                PrintWriter hobbiesFileWriter = new PrintWriter(new FileWriter(file.getAbsolutePath()));
                ArrayList<String> selectedHobbies = new ArrayList<String>();
                JCheckBox[] hobbiesCheckBoxs = { readingCheckBox, gardeningCheckBox, movieCheckBox, shoppingCheckBox,
                        othersCheckBox };
                for (JCheckBox hobby : hobbiesCheckBoxs) {
                    if (hobby.isSelected()) {
                        selectedHobbies.add(hobby.getActionCommand());
                    }
                }
                // assign selected hobby size for the difference in the display
                selectedHobbySize = selectedHobbies.size();
                hobbiesFileWriter.println(nameTextField.getText());
                hobbiesFileWriter.println(String.join(", ", selectedHobbies));
                if (selectedHobbySize == 1) {
                    JOptionPane.showMessageDialog(this, "Saving a hobby in file " + file.getAbsolutePath());
                } else {
                    JOptionPane.showMessageDialog(this, "Saving hobbies in file " + file.getAbsolutePath());
                }
                hobbiesFileWriter.close();
            } catch (IOException exception) {
                exception.printStackTrace(System.err);
            }
        } else {
            // handle when user clicks cancel button on save dialog
            JOptionPane.showMessageDialog(this, "Save menu cancelled by user");
        }
    }

    protected void handleOpenMenuItem() {
        // set text of bio text area to empty every time the user chooses to open
        bioTextArea.setText("");
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                FileReader selectedFileReader = new FileReader(selectedFile);
                BufferedReader selectedFileBufferedReader = new BufferedReader(selectedFileReader);
                ArrayList<String> data = new ArrayList<String>();
                String line;
                while ((line = selectedFileBufferedReader.readLine()) != null) {
                    data.add(line);
                }
                if (selectedHobbySize == 0) {
                    bioTextArea.append(data.get(0) + " does not have any hobby" + "\n");
                } else if (selectedHobbySize == 1) {
                    bioTextArea.append(data.get(0) + " has a hobby as " + data.get(1) + "\n");
                } else {
                    bioTextArea.append(data.get(0) + " has hobbies as " + data.get(1) + "\n");
                }
                selectedFileBufferedReader.close();
                selectedFileReader.close();
            } catch (IOException exception) {
                exception.printStackTrace(System.err);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Open menu cancelled by user");
        }
    }
}
