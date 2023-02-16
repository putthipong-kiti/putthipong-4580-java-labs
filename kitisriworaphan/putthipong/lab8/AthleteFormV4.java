/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: February 16, 2023
 *
 * This program called AthleteFormV4 which extends from AthleteFormV3
 * There are five checkbox variable named readingCheckBox, gardeningCheckBox, movieCheckBox, shoppingCheckBox, othersCheckBox
 * two protected variables for label named hobbiesLabel and yearLabel
 * three protected variables for panel named hobbyPanel, hobbiesPanel, yearPanel
 * and one slider variable named yearSlider
 * five checkbox will add to hobbiesPanel then hobbiesLabel and hobbiesPanel will add to hobbyPanel at north and center of hobbyPanel
 * yearLabel and yearSlider will add to yearPanel in same column of yearPanel
 * then add hobbyPanel and yearPanel to north and south of midPanel
**/

package kitisriworaphan.putthipong.lab8;

import javax.swing.*;
import java.awt.*;

import kitisriworaphan.putthipong.lab7.AthleteFormV3;

public class AthleteFormV4 extends AthleteFormV3 {
    protected JCheckBox readingCheckBox, gardeningCheckBox, movieCheckBox, shoppingCheckBox, othersCheckBox;
    protected JLabel hobbiesLabel, yearLabel;
    protected JPanel hobbyPanel, hobbiesPanel, yearPanel;
    protected JSlider yearSlider;

    public AthleteFormV4(String title) {
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
        AthleteFormV4 msw = new AthleteFormV4("Athlete Form V4");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }   
    
    @Override
    protected void addComponents() {
        // super from AthleteFormV3
        super.addComponents();
        // create hobbiesLabel and 5 checkboxes for hobbies
        hobbiesLabel = new JLabel("Hobbies:");
        readingCheckBox = new JCheckBox("Reading");
        gardeningCheckBox = new JCheckBox("Gardening");
        movieCheckBox = new JCheckBox("Watching movies");
        shoppingCheckBox = new JCheckBox("Shopping");
        othersCheckBox = new JCheckBox("Others");
        movieCheckBox.setSelected(true);
        // create hobbiesPanel and add 5 hobby checkboxes to hobbiesPanel 
        hobbiesPanel = new JPanel();
        hobbiesPanel.add(readingCheckBox);
        hobbiesPanel.add(gardeningCheckBox);
        hobbiesPanel.add(movieCheckBox);
        hobbiesPanel.add(shoppingCheckBox);
        hobbiesPanel.add(othersCheckBox);
        // create hobbyPanel to add hobbiesLabel to north and hobbiesPanel to center
        hobbyPanel = new JPanel(new BorderLayout());
        hobbyPanel.add(hobbiesLabel, BorderLayout.NORTH);
        hobbyPanel.add(hobbiesPanel, BorderLayout.CENTER);
        // create yearLabel and yearSlider
        yearLabel = new JLabel("Year of experience in this sport:");
        yearSlider = new JSlider(0, 20, 0);
        yearSlider.setPaintTrack(true);
        yearSlider.setPaintTicks(true);
        yearSlider.setPaintLabels(true);
        yearSlider.setMinorTickSpacing(1);
        yearSlider.setMajorTickSpacing(5);
        // create yearPanel as GridLayout to add yearLabel and yearSlider in same column
        yearPanel = new JPanel(new GridLayout(2, 1));
        yearPanel.add(yearLabel);
        yearPanel.add(yearSlider);
        // add hobbyPanel to north of midPanel and add yearPanel to south of midPanel
        midPanel.add(hobbyPanel, BorderLayout.NORTH);
        midPanel.add(yearPanel, BorderLayout.SOUTH);
    }
}
