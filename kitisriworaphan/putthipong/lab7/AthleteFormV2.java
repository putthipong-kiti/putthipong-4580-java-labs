/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: February 10, 2023
 *
 * This program called AthleteFormV2 which extends from AthleteForm
 * There are one string combo box variable named nationalityComboBox
 * three protected variables for label named nationalityLabel, sportLabel, bioLabel
 * one string list variable named sportList
 * six protected variables for panel named midPanel, nationSportPanel, nationSportBioPanel, nationalityPanel, sportPanel, bioPanel
 * one protected variables for scroll pane named bioScrollPane
 * and one text area variable named bioTextArea
 * add component to their own panel such as nationality components add to nationalityPanel
 * then get together in same panel such as nationalityPanel and sportPanel add to nationSportPanel
**/

package kitisriworaphan.putthipong.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV2 extends AthleteForm {
    protected JComboBox<String> nationalityComboBox;
    protected JLabel nationalityLabel, sportLabel, bioLabel;
    protected JList<String> sportList;
    protected JPanel midPanel, nationSportPanel, nationSportBioPanel, nationalityPanel, sportPanel, bioPanel;
    protected JScrollPane bioScrollPane;
    protected JTextArea bioTextArea;

    public static void createAndShowGUI() {
        AthleteFormV2 msw = new AthleteFormV2("Athlete Form V2");
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

    public AthleteFormV2(String title) {
        super(title);
    }

    protected void addComponents() {
        super.addComponents();
        // create component for nationalityPanel
        nationalityLabel = new JLabel("Nationality : ");
        String nation[] = { "American", "Chinese", "Indonesian", "Japanese", "Thai", "Vietnamese" };
        nationalityComboBox = new JComboBox<String>(nation);
        nationalityComboBox.setSelectedItem("Thai");
        // create nationalityPanel with GridLayout 1 row, 2 colomns and add component
        // for nationalityPanel
        nationalityPanel = new JPanel(new GridLayout(1, 2));
        nationalityPanel.add(nationalityLabel);
        nationalityPanel.add(nationalityComboBox);
        // create component for sportPanel
        sportLabel = new JLabel("Sport : ");
        String sport[] = { "Badminton", "Boxing", "Football", "Running" };
        sportList = new JList<String>(sport);
        sportList.setSelectedIndex(2);
        // create sportPanel with GridLayout 1 row, 2 colomns and add component for
        // sportPanel
        sportPanel = new JPanel(new GridLayout(1, 2));
        sportPanel.add(sportLabel);
        sportPanel.add(sportList);
        // create nationSportPanel with BorderLayout to add nationalityPanel at north
        // and add sportPanel to center
        nationSportPanel = new JPanel(new BorderLayout());
        nationSportPanel.add(nationalityPanel, BorderLayout.NORTH);
        nationSportPanel.add(sportPanel, BorderLayout.CENTER);
        // create component for bioPanel
        bioLabel = new JLabel("Bio : ");
        bioTextArea = new JTextArea(5, 20);
        bioTextArea.setLineWrap(true);
        bioTextArea.setWrapStyleWord(true);
        bioScrollPane = new JScrollPane(bioTextArea);
        // create bioPanel with BorderLayout to add bioLabel at north and add
        // bioScrollPane to center
        bioPanel = new JPanel(new BorderLayout());
        bioPanel.add(bioLabel, BorderLayout.NORTH);
        bioPanel.add(bioScrollPane, BorderLayout.CENTER);
        // create nationSportPanel with BorderLayout to add nationSportPanel at north
        // and add bioPanel to center
        nationSportBioPanel = new JPanel(new BorderLayout());
        nationSportBioPanel.add(nationSportPanel, BorderLayout.NORTH);
        nationSportBioPanel.add(bioPanel, BorderLayout.CENTER);
        // create midPanel with BorderLayout to add nationSportBioPanel to center
        midPanel = new JPanel(new BorderLayout());
        midPanel.add(nationSportBioPanel, BorderLayout.CENTER);
        // add midPanel to mainPanel at center
        mainPanel.add(midPanel, BorderLayout.CENTER);
    }

}
