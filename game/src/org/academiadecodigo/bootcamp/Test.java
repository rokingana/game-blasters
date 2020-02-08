package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameobjects.ObstacleType;
import org.academiadecodigo.bootcamp.gameobjects.XWing;
import org.academiadecodigo.bootcamp.gfx.SimpleGfxGrid;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridFactory;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;

public class Test {
    public static void main(String[] args) {

        Game game = new Game (100,50,200);

        game.init();



        //GridFactory grid = new GridFactory ();

        //GridFactory.makeGrid(10,100);

        SimpleGfxGrid simpleGfxGrid = new SimpleGfxGrid(100,50);

        simpleGfxGrid.init();

        //XWing xwing = new XWing();
    }
}
