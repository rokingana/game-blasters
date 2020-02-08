package org.academiadecodigo.bootcamp.gameobjects;

import org.academiadecodigo.bootcamp.gameobjects.Asteroid;
import org.academiadecodigo.bootcamp.gameobjects.GameObject;
import org.academiadecodigo.bootcamp.gameobjects.ObstacleType;
import org.academiadecodigo.bootcamp.grid.Grid;

/**
 * A factory of different types of Cars
 */
public class ObjectFactory {

    /**
     * Manufactures new random cars
     *
     * @return a newly instantiated car
     */
    public static GameObject getNewObject(Grid grid) {

        int random = (int) (Math.random() * ObstacleType.values().length);

        ObstacleType carType = ObstacleType.values()[random];


        GameObject gameObject;

        switch (carType) {
            case ASTEROID:
                gameObject = new Asteroid(grid.makeGridPosition());
                break;

            default:
                gameObject = new Asteroid(grid.makeGridPosition());
        }

        return gameObject;

    }

}
