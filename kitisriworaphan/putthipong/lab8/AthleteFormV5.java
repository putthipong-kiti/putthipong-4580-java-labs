/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: February 16, 2023
 *
 * This program called AthleteFormV5 which extends from AthleteFormV4
 * In this program will override the method addComponents() from AthleteFormV4:
 * - to change the background color of all the text fields to KKU color
 * - to change the font of all the labels to "Serif", bold, and size 14
 * - to change the font color of the sport list to blue
 * - to change the font of the buttons to "Serif", Bold and Italic, and size 16
 * - to change the background color of the bio text area to light gray color
 * - to set a tooltip text that will show a message when a mouse is moved over the buttons
 * - to change the font of all the menus and menu items to “SanSerif”, BOLD, and size 14
 * - to change the color of all the menus and menu items (except File and Config menu) to dark blue color
 * - to set a tooltip text that will show a message when a mouse is moved over the menu File and Config
**/

package kitisriworaphan.putthipong.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV5 extends AthleteFormV4 {
    protected Color kkuColor, blueColor, lightGrayColor, darkBlueColor;
    protected Font serifBold14, serifBoldItalic14, sanSerifBold14;

    public AthleteFormV5(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV5 msw = new AthleteFormV5("Athlete Form V5");
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
        // declare KKU color
        kkuColor = new Color(167, 59, 36);
        // change background color of all text fields to KKU color
        nameTextField.setBackground(kkuColor);
        weighTextField.setBackground(kkuColor);
        heighTextField.setBackground(kkuColor);
        dateOfBirthTextField.setBackground(kkuColor);
        // declare font "Serif" , bold, and size 14
        serifBold14 = new Font("Serif", Font.BOLD, 14);
        // change font of all the labels to "Serif" , bold, and size 14
        nameLabel.setFont(serifBold14);
        weightLabel.setFont(serifBold14);
        heightLabel.setFont(serifBold14);
        dateOfBitrhLabel.setFont(serifBold14);
        genderLabel.setFont(serifBold14);
        hobbiesLabel.setFont(serifBold14);
        nationalityLabel.setFont(serifBold14);
        sportLabel.setFont(serifBold14);
        bioLabel.setFont(serifBold14);
        yearLabel.setFont(serifBold14);
        // declare blue color defined in RGB format
        blueColor = new Color(35, 45, 222);
        // change font color of sport list to blue color
        sportList.setForeground(blueColor);
        // declare font "Serif", Bold and Italic, and size 16
        serifBoldItalic14 = new Font("Serif", Font.BOLD | Font.ITALIC, 14);
        // change font of buttons to "Serif", Bold and Italic, and size 16
        cancelButton.setFont(serifBoldItalic14);
        resetButton.setFont(serifBoldItalic14);
        submitButton.setFont(serifBoldItalic14);
        // declare light gray color defined in RGB format
        lightGrayColor = new Color(200, 200, 200);
        // change background color of bio text area to light gray color
        bioTextArea.setBackground(lightGrayColor);
        // set tooltip text that will show a message when a mouse is moved over the button
        cancelButton.setToolTipText("Press the cancel button to cancel this form");
        resetButton.setToolTipText("Press the reset button to reset this form");
        submitButton.setToolTipText("Press the submit button to submit this form");
    }

    @Override
    protected void addMenus() {
        super.addMenus();
        // declare font “SanSerif”, BOLD, and size 14
        sanSerifBold14 = new Font("SanSerif", Font.BOLD, 14);
        // change font of all menus and menu items to “SanSerif”, BOLD, and size 14
        fileMenu.setFont(sanSerifBold14);
        configMenu.setFont(sanSerifBold14);
        colorMenu.setFont(sanSerifBold14);
        sizeMenu.setFont(sanSerifBold14);
        newItem.setFont(sanSerifBold14);
        openItem.setFont(sanSerifBold14);
        saveItem.setFont(sanSerifBold14);
        exitItem.setFont(sanSerifBold14);
        redItem.setFont(sanSerifBold14);
        greenItem.setFont(sanSerifBold14);
        blueItem.setFont(sanSerifBold14);
        sixteenItem.setFont(sanSerifBold14);
        twentyItem.setFont(sanSerifBold14);
        twentyFourItem.setFont(sanSerifBold14);
        // declare dark blue color defined in RGB format
        darkBlueColor = new Color(6, 57, 112);
        // change color of menus and menu items (except File and Config menu) to dark blue color
        colorMenu.setForeground(darkBlueColor);
        sizeMenu.setForeground(darkBlueColor);
        newItem.setForeground(darkBlueColor);
        openItem.setForeground(darkBlueColor);
        saveItem.setForeground(darkBlueColor);
        exitItem.setForeground(darkBlueColor);
        redItem.setForeground(darkBlueColor);
        greenItem.setForeground(darkBlueColor);
        blueItem.setForeground(darkBlueColor);
        sixteenItem.setForeground(darkBlueColor);
        twentyItem.setForeground(darkBlueColor);
        twentyFourItem.setForeground(darkBlueColor);
        // set tooltip text that will show a message when a mouse is moved over the menu File and Config
        fileMenu.setToolTipText("To create new, open, save form or exit");
        configMenu.setToolTipText("To configure size and color of a component");
    }

    protected void setFrameFeatures() {
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

}
