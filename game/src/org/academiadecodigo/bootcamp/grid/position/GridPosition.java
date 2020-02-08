package org.academiadecodigo.bootcamp.grid.position;

import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.GridColor;

/**
 * A position2 on the grid2 that is capable of moving around
 */
public interface GridPosition {

    /**
     * Gets the position2 column in the grid2
     *
     * @return the position2 column
     */
    public int getCol();

    /**
     * Gets the position2 row in the grid2
     *
     * @return the position2 row
     */
    public int getRow();

    /**
     * Updates the position2 column and row
     *
     * @param col the new position2 column
     * @param row the new position2 row
     */
    public void setPos(int col, int row);

    /**
     * Gets the position2 getColor
     *
     * @return the position2 getColor
     */
    public GridColor getColor();

    /**
     * Changes the getColor of this grid2 position2
     *
     * @param color the new position2 getColor
     */
    public void setColor(GridColor color);

    /**
     * Displays the position2 in the grid2
     */
    public void show();

    /**
     * Hides the position2 in the grid2
     */
    public void hide();

    /**
     * Moves this grid2 position2 towards a specified direction
     *
     * @param direction the direction to move to
     * @param distance  the number of positions to move
     */
    public void moveInDirection(GridDirection direction, int distance);

    /**
     * Tests equality with another position2
     *
     * @param position the position2 to test against
     * @return true if positions are equal
     */
    public boolean equals(GridPosition position);

}


