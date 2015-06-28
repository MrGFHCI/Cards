
package onepic;

import java.awt.*;
import javax.swing.*;


public class PanMain extends JPanel{
    
    PanDisp panDisp = new PanDisp();
    
    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add(panDisp, BorderLayout.CENTER);
    }
    
}
