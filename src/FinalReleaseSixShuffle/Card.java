/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalReleaseSixShuffle;

import java.awt.image.BufferedImage;

/**
 *
 * @author Scott
 */
public class Card {

    int n, nVal, nSuit;
    BufferedImage biCard;

    Card(int _n, BufferedImage _biCard) {
        n = _n;
        biCard = _biCard;
        nVal = n % 13;
        nSuit = n / 13; // we won't use the suit for "war"
    }
    // accessor functions.
    BufferedImage getImg(){
        return biCard;
    }
    int getVal(){
        return nVal;
    }

}
