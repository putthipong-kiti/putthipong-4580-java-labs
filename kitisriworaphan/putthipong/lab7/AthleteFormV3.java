/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: February 10, 2023
 *
 * This program called AthleteFormV3 which extends from AthleteFormV2
 * There are one method named addMenus to add all components in the menu
 * Menu "File" has four menu items which are New, Open, Save and Exit
 * The menu items New, Open, and Save will have their own icon
 * Menu "Config" has two menu items which are Color and Size 
 * Menu "Color" has three menu items Red, Green and Blue
 * Menu "Size" also has three menu items 16, 20 and 24
**/

package kitisriworaphan.putthipong.lab7;

import javax.swing.*;

public class AthleteFormV3 extends AthleteFormV2 {
    protected JMenu fileMenu, configMenu, colorMenu, sizeMenu;
    protected JMenuBar menuBar;
    protected JMenuItem newItem, openItem, saveItem, exitItem, redItem, greenItem, blueItem, sixteenItem, twentyItem,
            twentyFourItem;
    protected JSeparator exitSeparator;

    public AthleteFormV3(String title) {
        super(title);
    }

    protected void addMenus() {
        // create fileMenu and add menu items
        fileMenu = new JMenu("File");
        ImageIcon newIcon = new ImageIcon(getClass().getResource("/images/New-icon.png"));
        newItem = new JMenuItem("New", newIcon);
        ImageIcon openIcon = new ImageIcon(getClass().getResource("/images/Open-icon.png"));
        openItem = new JMenuItem("Open", openIcon);
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("/images/Save-icon.png"));
        saveItem = new JMenuItem("Save", saveIcon);
        exitSeparator = new JSeparator();
        exitSeparator.setOrientation(SwingConstants.HORIZONTAL);
        exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitSeparator);
        fileMenu.add(exitItem);
        //create configMenu and add menu items
        configMenu = new JMenu("Config");
        colorMenu = new JMenu("Color");
        redItem = new JMenuItem("Red");
        greenItem = new JMenuItem("Green");
        blueItem = new JMenuItem("Blue");
        sizeMenu = new JMenu("Size");
        sixteenItem = new JMenuItem("16");
        twentyItem = new JMenuItem("20");
        twentyFourItem = new JMenuItem("24");
        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);
        sizeMenu.add(sixteenItem);
        sizeMenu.add(twentyItem);
        sizeMenu.add(twentyFourItem);
        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);
        // create menuBar then add fileMenu and configMenu to menuBar
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        setJMenuBar(menuBar);
    }

    public static void createAndShowGUI() {
        AthleteFormV3 msw = new AthleteFormV3("Athlete Form V3");
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
}
