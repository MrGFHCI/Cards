package patadoge;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanOut extends JPanel {

    ImageIcon imgHeader;
//    JButton btnHeader;
    JLabel lblHeader;

    public PanOut() {
        lblHeader = new JLabel();
        imgHeader = new ImageIcon("dogeheader.jpg");
        lblHeader.setIcon(imgHeader);
        add(lblHeader);
        this.setBackground(new Color(248, 190, 169));

//        header as a button does not work
//        btnHeader = new JButton();
//        imgHeader.getImage();
//        btnHeader.setIcon(imgHeader);
//        add(btnHeader);
    }
}