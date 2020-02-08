package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.grid.GridColor;

/**
 * Different types of cars
 */
public enum ObstacleType {

    ASTEROID(GridColor.YELLOW),
    GENERIC(GridColor.GREEN);

    private GridColor color;

    /**
     * Constructor of Car Types
     * @param color The car type color
     */
    ObstacleType(GridColor color) {
        this.color = color;
    }

    /**
     * Obtain the getColor associated with each car type
     *
     * @return the grid getColor
     */
    public GridColor getColor() {

        return this.color;

    }
}
