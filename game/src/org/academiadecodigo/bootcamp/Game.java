package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameobjects.GameObject;
import org.academiadecodigo.bootcamp.gameobjects.ObjectFactory;
import org.academiadecodigo.bootcamp.gameobjects.ObstacleType;
import org.academiadecodigo.bootcamp.gameobjects.XWing;
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
    private XWing xWing;

    public Game(int cols, int rows, int delay){

        grid = GridFactory.makeGrid(cols, rows);
        this.delay = delay;
        numberOfObstacles = grid.getRows()/2;
    }


    public void init() {

        grid.init();

        gameObject = new GameObject[numberOfObstacles];

        for (int i = 0; i < numberOfObstacles; i++) {

            gameObject[i] = ObjectFactory.getNewObject(grid);
            gameObject[i].setGrid(grid);

        }

        //xWing = new XWing(gridPosition);
    }

    public void start(){

    }

}
