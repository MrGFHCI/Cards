package onepic;

import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

public class PanDisp extends JPanel{

    ImageIcon newdoge;

    public PanDisp() {
        BtnDoge btn = new BtnDoge("doge1.png");
        add(btn);
    }
}