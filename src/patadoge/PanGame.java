package patadoge;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.*;

public class PanGame extends JPanel implements KeyListener {
    BtnDoge arBtnDoge[] = new BtnDoge[9];
    Map<Integer, Integer> map = new HashMap<>();
    Timer timerDoge;
    int nTimer;
    int ranDoge;
    int nScore;
    Random r = new Random();
    PanScore panScore;
    boolean bScore = false, bStart = true;

    public PanGame(PanScore _panScore) {
        panScore = _panScore;
        timerDoge = new Timer(1500, updateDoge); //timer to randomize doge pop ups
        nTimer = 0;
        timerDoge.start();
        setFocusable(true);
        requestFocus();
        map.put(7, 0);
        map.put(8, 1);
        map.put(9, 2);
        map.put(4, 3);
        map.put(5, 4);
        map.put(6, 5);
        map.put(1, 6);
        map.put(2, 7);
        map.put(3, 8);
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < arBtnDoge.length; i++) {
            arBtnDoge[i] = new BtnDoge(i);
            add(arBtnDoge[i]);
            //System.out.println("Button" + i +" created");
        }
        //  randomize();
        addKeyListener(this);
    }

    //randomize doge
    public void randomize() {
        // I needed to use the bStart var so that the upper left square was not
        // flipped immediately with the first random Doge.
        // if the user did not score, flip the previous Doge before getting a
        // new random Doge and flipping it.
        if(!bScore&&!bStart){
            arBtnDoge[ranDoge].flip();
        }
        ranDoge = r.nextInt(9);
        arBtnDoge[ranDoge].flip();
        bScore = false;
        bStart = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int nKey = e.getKeyCode();
        int nNewKey = nKey - 96;
        Integer value = map.get(nNewKey);
        //try {
        if (value == ranDoge) {
            arBtnDoge[value].flip();
            nScore++;
            //System.out.println(nScore);
            panScore.UpdateScoreLabel(nScore);
            bScore = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    ActionListener updateDoge = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            randomize();
        }
    };
}
