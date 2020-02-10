package org.academiadecodigo.bootcamp.gameobjects;


import org.academiadecodigo.bootcamp.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class XWing implements KeyboardHandler {

    private GridPosition pos;
    private Grid grid;
    private Keyboard keyboard;
    private Picture xWing;

    protected GridDirection currentPosition;
    protected  GridDirection currentDirection;
    private boolean destroyed = false; // the XWing is destroyed

    public XWing(GridPosition pos){

        currentDirection = GridDirection.UP;
        this.pos = pos;
        this.pos.setPos(0,grid.getRows()/2);
        pos.setColor(GridColor.WHITE);
        //this.keyboard = new Keyboard(this);
        xWing = new Picture(20, grid.getCols()/2*7, "xwing.png");
        //init();
    }

    public void init(){

        xWing.draw();

        KeyboardEvent xWingKey = new KeyboardEvent();
        xWingKey.setKey(KeyboardEvent.KEY_UP);
        xWingKey.setKey(KeyboardEvent.KEY_DOWN);
        xWingKey.setKey(KeyboardEvent.KEY_LEFT);
        xWingKey.setKey(KeyboardEvent.KEY_RIGHT);
        xWingKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(xWingKey);
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public GridPosition getPos() {
        return pos;
    }

    public boolean isFucked() {
        return true;
    }


    public boolean isHittingWall() {

        switch (currentPosition) {

           // For the second stage
            case LEFT:
                if (getPos().getCol() == 0) {
                    return true;
                }
                break;
            case RIGHT:
                if (getPos().getCol() == grid.getCols() - 1) {
                    return true;
                }
                break;

            case UP:
                if (getPos().getRow() == 0) {
                    return true;
                }
                break;
            case DOWN:
                if (getPos().getRow() == grid.getRows() - 1) {
                    return true;
                }
        }

        return false;

    }
    @Override
    /*public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                if(currentDirection == GridDirection.RIGHT){
                    return;
                }
                currentDirection = GridDirection.LEFT;
                break;
            case KeyboardEvent.KEY_RIGHT:
                if(currentDirection == GridDirection.LEFT){
                    return;
                }
                currentDirection = GridDirection.RIGHT;
                break;
            case KeyboardEvent.KEY_UP:
                if(currentDirection == GridDirection.DOWN){
                    return;
                }
                currentDirection = GridDirection.UP;
                break;
            case KeyboardEvent.KEY_DOWN:
                if(currentDirection == GridDirection.UP){
                    return;
                }
                currentDirection = GridDirection.DOWN;
                break;
        }
    }*/


    public void keyPressed(KeyboardEvent e) {

        /*int distance = 5;

        if (e.getKey() == KeyboardEvent.KEY_LEFT) {
            getPos().moveInDirection(GridDirection.LEFT, distance);
        }
        if(e.getKey() == KeyboardEvent.KEY_RIGHT) {
            getPos().moveInDirection(GridDirection.RIGHT, distance);
        }
        if (e.getKey() == KeyboardEvent.KEY_UP) {
            getPos().moveInDirection(GridDirection.UP, distance);
        }
        if (e.getKey() == KeyboardEvent.KEY_DOWN) {
            getPos().moveInDirection(GridDirection.DOWN, distance);
        }*/
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    @Override
    public String toString() {
        return "GameObject{" +
                "pos= " + pos +
                ", fucked= " + isFucked() +
                '}';
    }

}
