package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.grid.position.GridPosition;

/**
 * Fiat is not a very fast or reliable car and may break after some time.
 */
public class Obstacle extends GameObject {

    public final static int SPEED = 1;
    private final static int MOVES_BEFORE_BREAK = 30;
    private final static int BREAK_INTERVAL = 4;
    private int moves = 0;

    /**
     * Constructs a brand new Fiat
     *
     * @param pos the position of the car in the grid
     */
    public Obstacle(GridPosition pos) {
        super(pos, ObstacleType.GENERIC);
    }

    /**
     * Constructs a new car
     *
     * @param pos          the initial car position
     * @param obstacleType the car type
     */
    public Obstacle(GridPosition pos, ObstacleType obstacleType) {
        super(pos, obstacleType);
    }

    /**
     * @seeCarmove()
     */
    @Override
    public void move() {

        moves++;

        if (moves < MOVES_BEFORE_BREAK || moves % BREAK_INTERVAL != 0) {
            accelerate(chooseDirection(), Obstacle.SPEED);
        }

    }
}
