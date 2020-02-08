package org.academiadecodigo.bootcamp.gameobjects;


import org.academiadecodigo.bootcamp.CollisionDetector;
import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;

//Add movement(Accelerate and etc..) from GameObject

public class XWing {

    private GridPosition pos;
    private Grid grid;
    private int initCol;
    private int initRow;
    private boolean fucked = false;


    // Allow direct access from subclasses
    protected CollisionDetector collisionDetector;
    protected GridDirection currentPosition;
    private boolean destroyed = false; // the XWing is destroyed

    public XWing(GridPosition pos){

        this.pos = pos;
        this.pos.setPos(0,grid.getRows()/2);
        pos.setColor(GridColor.WHITE);

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
            /*case LEFT:
                if (getPos().getCol() == 0) {
                    return true;
                }
                break;
            case RIGHT:
                if (getPos().getCol() == grid.getCols() - 1) {
                    return true;
                }
                break;*/

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
    public String toString() {
        return "GameObject{" +
                "pos= " + pos +
                ", fucked= " + isFucked() +
                '}';
    }

}
