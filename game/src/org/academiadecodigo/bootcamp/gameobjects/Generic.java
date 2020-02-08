package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.gameobjects.GameObject;
import org.academiadecodigo.bootcamp.gameobjects.ObstacleType;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;

/**
 * Mustang is a fast and reliable car
 */
public class Generic extends GameObject {

    public final static int SPEED = 2;

    /**
     * Constructs a brand new Mustang
     *
     * @param pos the position of the car in the grid
     */
    public Generic(GridPosition pos) {
        super(pos, ObstacleType.GENERIC);
    }

    @Override
    public void move() {

        //accelerate(choosePosition(), Generic.SPEED);

    }
}
