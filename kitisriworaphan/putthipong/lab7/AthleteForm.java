/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: February 10, 2023
 *
 * This program called AthleteForm which extends from MySimpleWindow
 * There are five protected variables for label named nameLabel, weightLabel, heightLabel, dateOfBitrhLabel, genderLabel
 * three protected variables for panel named mainPanel, topPanel, genderPanel
 * two protected variables for radio button named maleButton and femaleButton
 * and four protected variables for text field named nameTextField, weighTextField, heighTextField, dateOfBirthTextField
 * maleButton and femaleButton will add to genderPanel
 * label, text field and gender panel will add to topPanel
 * then topPanel will add to mainPanel at north of mainPanel
**/

package kitisriworaphan.putthipong.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteForm extends MySimpleWindow {
    protected JLabel nameLabel, weightLabel, heightLabel, dateOfBitrhLabel, genderLabel;
    protected JPanel mainPanel, topPanel, genderPanel;
    protected JRadioButton maleButton, femaleButton;
    protected JTextField nameTextField, weighTextField, heighTextField, dateOfBirthTextField;
        
    public static void createAndShowGUI() {
        AthleteForm msw = new AthleteForm("Athlete Form");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    public AthleteForm(String title) {
        super(title);
    }

    protected void addComponents() {
        // super from MySimpleWindow
        super.addComponents();
        mainPanel = new JPanel(new BorderLayout());
        // create topPanel with grid layout: 5 rows and 2 columns
        topPanel = new JPanel(new GridLayout(5, 2));
        // create component
        nameLabel = new JLabel("Name : ");
        nameTextField = new JTextField(15);
        weightLabel = new JLabel("Weight : ");
        weighTextField = new JTextField(15);
        heightLabel = new JLabel("Height : ");
        heighTextField = new JTextField(15);
        dateOfBitrhLabel = new JLabel("Date of Birth (dd-mm-yyyy) : ");
        dateOfBirthTextField = new JTextField(15);
        genderLabel = new JLabel("Gender : ");
        genderPanel = new JPanel();
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        // add component
        topPanel.add(nameLabel);
        topPanel.add(nameTextField);
        topPanel.add(weightLabel);
        topPanel.add(weighTextField);
        topPanel.add(heightLabel);
        topPanel.add(heighTextField);
        topPanel.add(dateOfBitrhLabel);
        topPanel.add(dateOfBirthTextField);
        topPanel.add(genderLabel);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        topPanel.add(genderPanel);
        // create genderGroup using class ButtonGroup to group maleButton and femaleButton 
        // to allow a user to choose only one radio button at a time
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        // add topPanel at north of mainPanel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        // add mainPanel to frame
        add(mainPanel);
    }


}
