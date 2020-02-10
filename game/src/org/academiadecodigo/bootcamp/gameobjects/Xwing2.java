package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Xwing2 implements KeyboardHandler {

    private Picture xWingUp;
    private Picture xWingDown;
    private Picture xWingLeft;
    private Picture xWingRight;

    public Xwing2(){

        xWingUp = new Picture(50,50,"xwing.png") ;
        xWingUp.draw();
        //xWingDown = new Picture(50,50,"xwing.png") ;
        //xWingDown.draw();
        /*
        xWingLeft = new Picture(50,50,"xwing.png") ;
        xWingLeft.draw();
        xWingRight = new Picture(50,50,"xwing.png") ;
        xWingRight.draw();
        */
    }


    @Override
    public void keyPressed(KeyboardEvent e) {
        xWingUp.translate(0,10);
        xWingDown.translate(0,-10);
        //xWingLeft.translate(-10,0);
        //xWingRight.translate(10,0);
    }

    @Override
    public void keyReleased(KeyboardEvent e) {

    }
}

