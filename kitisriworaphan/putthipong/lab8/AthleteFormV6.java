/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: February 16, 2023
 *
 * This program called AthleteFormV6 which extends from AthleteFormV5
 * This program has Java class called OlympicSymbol extends from JPanel 
 * In class OlympicSymbol has override the method paintComponent() to draw the Olympic symbol
 * and override addComponents method to declare an instance of the class OlympicSymbol 
 * and declare an instance of JPanel to place the instance of the class OlympicSymbol
**/

package kitisriworaphan.putthipong.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV6 extends AthleteFormV5 {
    protected JPanel olympicPanel;
    OlympicSymbol olympicSymbol;

    public AthleteFormV6(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV6 msw = new AthleteFormV6("Athlete Form V6");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    @Override
    protected void addComponents() {
        super.addComponents();
        // declare an instance of the class OlympicSymbol named olympicSymbol
        olympicSymbol = new OlympicSymbol();
        olympicSymbol.setPreferredSize(new Dimension(200, 100));
        // declare olympicPanel to place the instance of the class OlympicSymbol
        olympicPanel = new JPanel(new BorderLayout());
        olympicPanel.add(olympicSymbol, BorderLayout.NORTH);
        // add olympicPanel to frame at north
        add(olympicPanel, BorderLayout.NORTH);
    }

    protected class OlympicSymbol extends JPanel {
        @Override
        protected void paintComponent(Graphics circles) {
            // cast Graphics object to Graphics2D
            Graphics2D circle = (Graphics2D) circles;
            // set stroke of line to 5
            BasicStroke lineStroke = new BasicStroke(5);
            circle.setStroke(lineStroke);
            // draw Olympic symbol
            circle.setColor(Color.BLUE);
            circle.drawOval(20, 10, 50, 50);
            circle.setColor(Color.RED);
            circle.drawOval(70, 10, 50, 50);
            circle.setColor(Color.YELLOW);
            circle.drawOval(120, 10, 50, 50);
            circle.setColor(Color.GREEN);
            circle.drawOval(45, 35, 50, 50);
            circle.setColor(Color.BLACK);
            circle.drawOval(95, 35, 50, 50);
        }
    }


}
