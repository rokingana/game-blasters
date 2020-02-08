package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.gameobjects.Obstacle;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;

public class CollisionDetector {

    private Obstacle[] obstacle;

    public CollisionDetector(Obstacle[] obstacle) {
        this.obstacle = obstacle;
    }

    public boolean isUnSafe(GridPosition pos) {

        for (Obstacle c : obstacle) {

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
    public void check(Obstacle obstacle) {

        /*for (Obstacle ic : obstacle) {

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
