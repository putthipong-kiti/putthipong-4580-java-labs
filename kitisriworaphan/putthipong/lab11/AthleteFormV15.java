/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 24, 2023
 * 
 * This is Java program named AthleteFormV15 which extends from AthleteFormV14
 * In this problem, when the user chooses menu Save,  the program not only saves hobbies 
 * but also saves the number of experience years in another binary file
 * when the user chooses menu Open, the program not only reads hobbies from the text file 
 * but also reads another binary file and displays both the hobbies and the experience years in the text area
**/

package kitisriworaphan.putthipong.lab11;

import java.io.*;
import javax.swing.*;

public class AthleteFormV15 extends AthleteFormV14 {

    public AthleteFormV15(String title) {
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
        AthleteFormV15 windowAthleteFormV15 = new AthleteFormV15("Athlete Form V15");
        windowAthleteFormV15.addComponents();
        windowAthleteFormV15.initValues();
        windowAthleteFormV15.addMenus();
        windowAthleteFormV15.addListeners();
        windowAthleteFormV15.setFrameFeatures();
    }

    @Override
    protected void handleSaveMenuItem() {
        super.handleSaveMenuItem();
        fileChooser.setSelectedFile(new File(""));
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();
                FileOutputStream fileOutput = new FileOutputStream(file);
                DataOutputStream dataOutput = new DataOutputStream(fileOutput);
                String name = nameTextField.getText();
                int year = yearSlider.getValue();
                dataOutput.writeUTF(name);
                dataOutput.writeInt(year);
                JOptionPane.showMessageDialog(this, "Saving experiences year in file " + file.getAbsolutePath());
                fileOutput.close();
                dataOutput.close();
            } catch (IOException exception) {
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
                DataInputStream dataInput = new DataInputStream(fileInput);
                try {
                    while (true) {
                        String name = dataInput.readUTF();
                        int year = dataInput.readInt();
                        if (year == 0 && year == 1) {
                            bioTextArea.append(name + " has " + year + " year of experiences" + "\n");
                        } else {
                            bioTextArea.append(name + " has " + year + " years of experiences" + "\n");
                        }
                    }
                } catch (EOFException exception) {
                    fileInput.close();
                    dataInput.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace(System.err);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Open menu cancelled by user");
        }
    }
}
