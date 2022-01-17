/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * This is MyJPanel Class extends JPanel.
 * In order to paint JPanel, I override paintComponent method.
 * Because I do not want use JLabel as backgroud.
 * @author Paul Duan
 */
public class MyJPanel extends JPanel {
    //background image
    ImageIcon img;
    //Construction method to get ImageIcon ojbect
    public MyJPanel(ImageIcon img) {
        this.img = img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        //use drawImage() to paint Image on JPanel
        g.drawImage(img.getImage(), 0, 0, this);
    }

}
