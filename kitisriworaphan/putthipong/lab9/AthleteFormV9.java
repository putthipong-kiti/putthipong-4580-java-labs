/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: March 10, 2023
 *
 * This program named AthleteFormV9 which extends from AthleteFormV8 and implements ItemListener
 * In this program will detect the change in text fields, combo boxes, and menus that handled by ActionListener 
 * and in checkboxes and radio buttons that handled by ItemListener
 * When the user chooses a New or Open or Save menu item, the program shows the message dialog "You choose menu <menu name>"
 * Also have accelerator key for New menu by typing CTRL-N, 
 * Open menu by typing CTRL-O, Save menu by typing CTRL-S, and Exit menu by typing CTRL-Q
 * When the user sees the menu File, the user can also choose New, Open, Save, Exit menu item by typing N or n, O or o, S or s, X or x
**/

package kitisriworaphan.putthipong.lab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AthleteFormV9 extends AthleteFormV8 implements ItemListener {

    public AthleteFormV9(String title) {
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
        AthleteFormV9 windowAthleteFormV9 = new AthleteFormV9("Athlete Form V9");
        windowAthleteFormV9.addComponents();
        windowAthleteFormV9.initValues();
        windowAthleteFormV9.addMenus();
        windowAthleteFormV9.addListeners();
        windowAthleteFormV9.setFrameFeatures();
    }

    @Override
    protected void addMenus() {
        super.addMenus();
        // set acceleratoe key for each menu item
        newItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        openItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_O, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        saveItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        exitItem.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_Q, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));
        // set mnemonic for each menu item
        newItem.setMnemonic(KeyEvent.VK_N);
        openItem.setMnemonic(KeyEvent.VK_O);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_X);
    }

    @Override
    protected void addListeners() {
        super.addListeners();
        nameTextField.addActionListener(this);
        weighTextField.addActionListener(this);
        heighTextField.addActionListener(this);
        dateOfBirthTextField.addActionListener(this);
        nationalityComboBox.addActionListener(this);
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        maleButton.addItemListener(this);
        femaleButton.addItemListener(this);
        readingCheckBox.addItemListener(this);
        gardeningCheckBox.addItemListener(this);
        movieCheckBox.addItemListener(this);
        shoppingCheckBox.addItemListener(this);
        othersCheckBox.addItemListener(this);
    }

    // remove listener so that showMessageDialog is not triggered when the user clicks Cancel or Reset
    protected void removeListener() {
        nameTextField.removeActionListener(this);
        weighTextField.removeActionListener(this);
        heighTextField.removeActionListener(this);
        dateOfBirthTextField.removeActionListener(this);
        nationalityComboBox.removeActionListener(this);
        newItem.removeActionListener(this);
        openItem.removeActionListener(this);
        saveItem.removeActionListener(this);
        exitItem.removeActionListener(this);
        maleButton.removeItemListener(this);
        femaleButton.removeItemListener(this);
        readingCheckBox.removeItemListener(this);
        gardeningCheckBox.removeItemListener(this);
        movieCheckBox.removeItemListener(this);
        shoppingCheckBox.removeItemListener(this);
        othersCheckBox.removeItemListener(this);
    }

    @Override
    protected void handleCancelButton() {
        removeListener();
        super.handleCancelButton();
        addListeners();
    }

    @Override
    protected void handleResetButton() {
        removeListener();
        super.handleResetButton();
        addListeners();
    }

    // define actionPerformed method to handle event of each button, text fields and menu item
    @Override
    public void actionPerformed(ActionEvent eActionEvent) {
        super.actionPerformed(eActionEvent);
        Object srcActionObject = eActionEvent.getSource();
        if (srcActionObject == nameTextField) {
            JOptionPane.showMessageDialog(this, "Name is changed to " + nameTextField.getText());
        }
        if (srcActionObject == weighTextField) {
            JOptionPane.showMessageDialog(this, "Weight is changed to " + weighTextField.getText());
        }
        if (srcActionObject == heighTextField) {
            JOptionPane.showMessageDialog(this, "Height is changed to " + heighTextField.getText());
        }
        if (srcActionObject == dateOfBirthTextField) {
            JOptionPane.showMessageDialog(this, "Date of birth is changed to " + dateOfBirthTextField.getText());
        }
        if (srcActionObject == nationalityComboBox) {
            JOptionPane.showMessageDialog(this, "Nationality is changed to " + nationalityComboBox.getSelectedItem());
        }
        if (srcActionObject == newItem) {
            JOptionPane.showMessageDialog(this, "You choose menu " + newItem.getActionCommand());
        }
        if (srcActionObject == openItem) {
            JOptionPane.showMessageDialog(this, "You choose menu " + openItem.getActionCommand());
        }
        if (srcActionObject == saveItem) {
            JOptionPane.showMessageDialog(this, "You choose menu " + saveItem.getActionCommand());
        }
        if (srcActionObject == exitItem) {
            System.exit(0);
        }
    }

    // define itemStateChanged() method to handle event of gender button and hobbies checkBox
    @Override
    public void itemStateChanged(ItemEvent eItemEvent) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                if (eItemEvent.getStateChange() == ItemEvent.SELECTED) {
                    if (eItemEvent.getItemSelectable() instanceof JRadioButton) {
                        JRadioButton genderButton = (JRadioButton) eItemEvent.getItemSelectable();
                        JOptionPane.showMessageDialog(null, genderButton.getText() + " is selected");
                    }
                    if (eItemEvent.getItemSelectable() instanceof JCheckBox) {
                        JCheckBox hobbiesCheckBox = (JCheckBox) eItemEvent.getItemSelectable();
                        JOptionPane.showMessageDialog(null, hobbiesCheckBox.getText() + " is also your hobby");
                    }
                } else if (eItemEvent.getStateChange() == ItemEvent.DESELECTED) {
                    if (eItemEvent.getItemSelectable() instanceof JCheckBox) {
                        JCheckBox hobbiesCheckBox = (JCheckBox) eItemEvent.getItemSelectable();
                        JOptionPane.showMessageDialog(null, hobbiesCheckBox.getText() + " is no longer your hobby");
                    }
                }
            }
        });
    }
}
