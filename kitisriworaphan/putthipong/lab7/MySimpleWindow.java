/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: February 10, 2023
 *
 * This program called MySimpleWindow which extends from class JFrame
 * There are three protected variables for button named cancelButton, resetButton, submitButton
 * and one protected variables for panel named buttonPanel
 * Each button will contain their own text such as "Cancel" in cancelButton
 * then all button will contain in buttonPanel and then buttonPanel will add to south of frame
**/

package kitisriworaphan.putthipong.lab7;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    protected JButton cancelButton, resetButton, submitButton;
    protected JPanel buttonPanel;

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
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

    public MySimpleWindow(String title) {
        super(title);
    }

    protected void addComponents() {
        // create mainPanel with borderlayout
        // create buttonPanel with flow layout 
        buttonPanel = new JPanel();
        // create button with their own text
        cancelButton = new JButton("Cancel");
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");
        // add all button to button panel
        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);
        // add button panel to main panel
        add(buttonPanel, BorderLayout.SOUTH);
        // add main panel to frame
    }

    protected void setFrameFeatures() {
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

}
