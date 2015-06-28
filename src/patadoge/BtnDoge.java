package patadoge;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BtnDoge extends JButton {

    ImageIcon blankbg;
    ImageIcon newdoge;
    int iFlip;
    int nNum;
    boolean dogeShown;
    int rDoge;

    BtnDoge(int _nNum) {
        nNum = _nNum;
        iFlip = 1;
        blankbg = new ImageIcon("blankbg.png");
        //setActionCommmand(sNum);
        blankbg.getImage();
        newdoge = new ImageIcon("doge1.png");
        newdoge.getImage();
        this.setIcon(blankbg);
        this.setBackground(new Color(252, 154, 134));
        //this.setIcon(newdoge);

    }

    //flip the doge images
    void flip() {
        if (iFlip == 1) {
            setIcon(newdoge);
            //dogeShown = true;
        } else {
            setIcon(blankbg);
            //dogeShown = false;
        }
        iFlip *= -1;
    }
}