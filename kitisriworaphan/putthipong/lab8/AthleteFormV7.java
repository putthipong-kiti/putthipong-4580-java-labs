/**
 * Author: Putthipong Kitisriworaphan
 * ID: 653040458-0
 * Sec: 1
 * Date: February 16, 2023
 *
 * This program called AthleteFormV7 which extends from AthleteFormV6
 * This program has Java class called ReadImage which extends from JPanel
 * In class ReadImage has override the method paintComponent() to draw an image
 * by create a constructor of ReadImage that read an image file
 * then override addComponents method to declare an instance of the class ReadImage 
 * and declare an instance of JPanel where the instance of ReadImage will be added to
**/

package kitisriworaphan.putthipong.lab8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

public class AthleteFormV7 extends AthleteFormV6 {
    protected JPanel imagePanel;
    ReadImage athleteImage;

    public AthleteFormV7(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        AthleteFormV7 msw = new AthleteFormV7("Athlete Form V7");
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
        // declare an instance of the class ReadImage named athleteImage
        athleteImage = new ReadImage();
        athleteImage.setPreferredSize(new Dimension(500, 300));
        // declare imagePanel to place the instance of the class ReadImage
        imagePanel = new JPanel();
        imagePanel.add(athleteImage);
        // add imagePanel to mainPanel at south of panel
        mainPanel.add(imagePanel, BorderLayout.SOUTH);
    }

    protected class ReadImage extends JPanel {
        protected BufferedImage image;
        // constructor of ReadImage
        public ReadImage() {
            try {
                File imagePath = new File("images/Athlete.png");
                image = ImageIO.read(imagePath);
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        }
        // draw an image
        @Override
        protected void paintComponent(Graphics img) {
            img.drawImage(image, 0, 0, this);
        }
    }
}
