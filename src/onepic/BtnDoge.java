/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onepic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author tomkc2421
 */
public class BtnDoge extends JButton {

    ImageIcon newdoge;
    ImageIcon newerdoge;

    BtnDoge(String file) {
        newdoge = new ImageIcon(file);
        newdoge.getImage();
        newerdoge = new ImageIcon("doge2.png");
        newerdoge.getImage();
        this.setIcon(newdoge);
        this.setBackground(new Color(248, 190, 169));
        AL changeImage = new AL();
        this.addActionListener(changeImage);
        
    }
    class AL implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println("Hello");
            setIcon(newerdoge);
        } 
    }
}
