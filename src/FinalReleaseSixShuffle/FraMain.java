package FinalReleaseSixShuffle;

import javax.swing.*;
import java.awt.*;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain(); //Initialize PanMain
        setTitle("WAR!!!"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((600), (200)); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());
        add(panMain, BorderLayout.CENTER); 
    }
}
