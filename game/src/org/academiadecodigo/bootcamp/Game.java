package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameobjects.GameObject;
import org.academiadecodigo.bootcamp.gameobjects.ObjectFactory;
import org.academiadecodigo.bootcamp.gameobjects.ObstacleType;
import org.academiadecodigo.bootcamp.gameobjects.XWing;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridFactory;
import org.academiadecodigo.bootcamp.grid.GridType;

public class Game {

    private Grid grid;
    private GameObject[] gameObject;
    private XWing xWing;
    private int delay;
    private int numberOfObstacles;

    public Game(int cols, int rows, int delay){

        grid = GridFactory.makeGrid(cols, rows);
        this.delay = delay;
        numberOfObstacles = grid.getRows()-2;

    }


    public void init() {

        grid.init();

        gameObject = new GameObject[numberOfObstacles];
        //XWing xwing = new XWing(grid.makeGridPosition(0,grid.getRows()/2));

        for (int i = 0; i < numberOfObstacles; i++) {

            gameObject[i] = ObjectFactory.getNewObject(grid);
            gameObject[i].setGrid(grid);

        }

    }

    public void start(){

    }


}
