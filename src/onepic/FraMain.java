package onepic;

import javax.swing.JFrame;

public class FraMain extends JFrame {
    
    FraMain() {
        PanMain panMain = new PanMain();
        setSize(400, 400);
        setTitle("One Pic");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panMain);
        setVisible(true);

    }
    
}
