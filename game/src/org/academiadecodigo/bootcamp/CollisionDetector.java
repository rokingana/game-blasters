package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameobjects.Asteroid;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;

public class CollisionDetector {

    private Asteroid[] obstacle;

    public CollisionDetector(Asteroid[] obstacle) {
        this.obstacle = obstacle;
    }

    public boolean isUnSafe(GridPosition pos) {

        for (Asteroid c : obstacle) {

            if (c.getPos()!= pos && c.getPos().equals(pos)) {
                return true;
            }

        }

        return false;

    }

    /**
     * Checks for collisions with specific car
     * Requires iterating the array once
     * @param obstacle
     */
    public void check(Asteroid obstacle) {

        /*for (Asteroid ic : obstacle) {

            // No point in checking collisions with self
            if (ic == obstacle) {
                continue;
            }

            if (ic.getPos().equals(obstacle.getPos())) {
                ic.crash();
                obstacle.crash();
            }
        }*/

    }

}
