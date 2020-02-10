package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameobjects.*;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.GridFactory;
import org.academiadecodigo.bootcamp.grid.GridType;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game{

    private Grid grid;
    private GameObject[] gameObject;
    private GridDirection currentDirection;
    private GridPosition gridPosition;
    private int delay;
    private int numberOfObstacles;
    private Xwing2 xWing;

    public Game(int cols, int rows, int delay){

        grid = GridFactory.makeGrid(cols, rows);
        this.delay = delay;
        numberOfObstacles = grid.getRows()/3;
        this.xWing = new Xwing2();
    }


    public void init() {

        grid.init();

        KeyboardHandler kX = new Xwing2();
        Keyboard k = new Keyboard(kX);

        KeyboardEvent eventDown = new KeyboardEvent();
        eventDown.setKey(KeyboardEvent.KEY_DOWN);
        eventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventDown);

        KeyboardEvent eventUp = new KeyboardEvent();
        eventUp.setKey(KeyboardEvent.KEY_UP);
        eventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventUp);

        KeyboardEvent eventLeft = new KeyboardEvent();
        eventLeft.setKey(KeyboardEvent.KEY_LEFT);
        eventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventLeft);

        KeyboardEvent eventRight = new KeyboardEvent();
        eventRight.setKey(KeyboardEvent.KEY_RIGHT);
        eventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventRight);

        gameObject = new GameObject[numberOfObstacles];

        for (int i = 0; i < numberOfObstacles; i++) {
                    gameObject[i] = ObjectFactory.getNewObject(grid);
                    gameObject[i].setGrid(grid);
        }

        System.out.println(grid.getCols());
    }

    public void start(){

    }

}
