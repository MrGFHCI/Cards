package FinalReleaseSixShuffle;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Deck {

    //BufferedImage[] abiCards = SplitSprites(); //Array of BufferedImages
    Card[] arCards = new Card[52];
    BufferedImage biDeck = null, biCard = null;
    int nWidth, nHeight, nRows, nColumns, n;
    
    Deck(){   
        int nWidth, nHeight, nRows, nColumns;
        try {
            biDeck = ImageIO.read(new File("PlayingCardsSpreadsheet.png")); //Read in the entire SpriteSheet
        } catch (IOException e) {
            e.printStackTrace();
        }
        nWidth = biDeck.getWidth()/13;
        nHeight = biDeck.getHeight()/4;       
        //nWidth = 73; //Width of one card
        //nHeight = 98; //Height of one card
        nRows = 4; //Number of rows in the SpriteSheet
        nColumns = 13; //Number of columns in the Spritesheet
        for (int i = 0; i < nRows; i++) { // split up sprite
            for (int j = 0; j < nColumns; j++) {
                biCard = biDeck.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight);               
                arCards[n] = new Card(n, biCard);
                n++;
            }
        }       
    }
    Card getCard(int _n){
        n = _n;
        return arCards[n];
    }   
        
}
