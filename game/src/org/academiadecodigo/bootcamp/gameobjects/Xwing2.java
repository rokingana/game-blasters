package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Xwing2 implements KeyboardHandler {

    private Picture xWing;

    public Xwing2(){

        xWing = new Picture(50,50,"xwing.png") ;
        xWing.draw();

    }


    @Override
    public void keyPressed(KeyboardEvent e) {

        if (e.getKey() == KeyboardEvent.KEY_UP) {
            xWing.translate(0, -10);
        }

        if (e.getKey() == KeyboardEvent.KEY_DOWN) {
            xWing.translate(0, 10);
        }

        if (e.getKey() == KeyboardEvent.KEY_LEFT) {
            xWing.translate(-10, 0);
        }

        if (e.getKey() == KeyboardEvent.KEY_RIGHT) {
            xWing.translate(10, 0);
        }

    }

    @Override
    public void keyReleased(KeyboardEvent e) {

    }
}

