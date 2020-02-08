package org.academiadecodigo.bootcamp.gameobjects;

        import org.academiadecodigo.bootcamp.CollisionDetector;
        import org.academiadecodigo.bootcamp.grid.Grid;
        import org.academiadecodigo.bootcamp.grid.GridColor;
        import org.academiadecodigo.bootcamp.grid.GridDirection;
        import org.academiadecodigo.bootcamp.grid.position.GridPosition;

/**
 * Generic GameObject, should be extended
 */
abstract public class GameObject {

    private GridPosition pos;
    private Grid grid;
    private ObstacleType obstacleType;
    private boolean crashed = false; // the car crashed state
    private int directionChangeLevel = 8; // randomness of direction changes from 1 to 10

    // Allow direct access from subclasses
    protected CollisionDetector collisionDetector;
    protected GridDirection currentPosition;

    /**
     * Constructs a new obstacle
     *
     * @param pos     the initial car position
     * @param obstacleType the obstacle type
     */
    public GameObject(GridPosition pos, ObstacleType obstacleType) {

        this.pos = pos;
        this.obstacleType = obstacleType;

        pos.setColor(obstacleType.getColor());
        currentPosition = GridDirection.values()[(int) (Math.random() * GridDirection.values().length)];

    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public GridPosition getPos() {
        return pos;
    }

    public void setCollisionDetector(CollisionDetector collisionDetector) {
        this.collisionDetector = collisionDetector;
    }

    public void setDirectionChangeLevel(int directionChangeLevel) {
        this.directionChangeLevel = directionChangeLevel;
    }

    public boolean isCrashed() {
        return crashed;
    }

    /**
     * Sets the obstacle into a crashed state
     */
    public void crash() {

        if(obstacleType.getColor() != GridColor.YELLOW) {
            this.crashed = true;
            pos.setColor(GridColor.RED);
        }

    }

    /**
     * Perform specific moving behaviour according to the car type
     */
    abstract public void move();

    /**
     * Chooses a new direction for the car
     *
     * @return the new direction
     */

    /*
    public GridDirection chooseDirection() {

        // Let's move in the same direction by default
        GridDirection newDirection = currentPosition;

        // Sometimes, we want to change direction...
        if (Math.random() > ((double) directionChangeLevel) / 10) {
            newDirection = GridDirection.values()[(int) (Math.random() * GridDirection.values().length)];

            // but we do not want to perform U turns..
            if (newDirection.isOpposite(currentPosition)) {
                return chooseDirection();
            }
        }

        return newDirection;

    }
    */

    /**
     * Accelerates the car towards a specific direction,
     * as long as we have not bumped against the wall,
     * in which case we bounce back
     *
     *  direction the direction to which accelerate
     *  speed     the speed to accelerate at
     */

    public void move(GridDirection direction, int speed){

        GridDirection newDirection = direction;

        this.currentPosition = newDirection;

        for (int i = grid.getCols(); i < speed; i--) {
            getPos().moveInDirection(newDirection, 1);
        }

    }

    /*
    public void accelerate(GridDirection direction, int speed) {

        // Crashed cars can not accelerate
        if (isCrashed()) {
            return;
        }

        GridDirection newDirection = direction;

        // Perform a U turn if we have bumped against the wall
        if (isHittingWall()) {
            newDirection = direction.oppositeDirection();
        }

        // Accelerate in the choosen direction
        this.currentPosition = newDirection;
        for (int i = 0; i < speed; i++) {
            getPos().moveInDirection(newDirection, 1);
            if (collisionDetector.isUnSafe(getPos())){
                crash();
                break;
            }
        }

    }*/

    /**
     * Detects if the car is hitting the field wall
     *
     * @return true if the car is hitting the wall
     */
    public boolean isHittingWall() {

        switch (currentPosition) {
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
    public String toString() {
        return "GameObject{" +
                "pos=" + pos +
                ", obstacleType=" + obstacleType +
                ", crashed=" + crashed +
                '}';
    }
}

