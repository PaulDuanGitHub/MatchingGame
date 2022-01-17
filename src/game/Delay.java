/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.JButton;

/**
 * This is a Delay Class in order to realize the function of delay.
 * I do not like the idea of another button to "Guess Again",
 * so I give players 0.25s to meremorize the second image.
 * @author Paul Duan
 */

//Implement Runnable interface in order to run it in another thread
public class Delay implements Runnable{
    //get two buttons(cards) need to turn back
    public Delay(JButton firstBtn, JButton secondBtn) {
        this.firstBtn = firstBtn;
        this.secondBtn = secondBtn;
    }
    //override run() in order to start a new Thread
    @Override
    public void run() {
        try {
            //use static method sleep to delay 0.25s
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            System.out.println("Thread Interrputed");
        }
        
        //set buttons' setEnabled ture, so that it can show the image of barrier
        firstBtn.setEnabled(true);
        secondBtn.setEnabled(true);
    }
    
    //create varibles
    JButton firstBtn;
    JButton secondBtn;
}
