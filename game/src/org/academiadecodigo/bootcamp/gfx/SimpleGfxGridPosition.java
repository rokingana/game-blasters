package org.academiadecodigo.bootcamp.gfx;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    private Picture asteroid;
    private Picture xWing;

    /**
     * Simple graphics position constructor
     *
     * @param grid Simple graphics grid
     *
     */

    public SimpleGfxGridPosition(SimpleGfxGrid grid) {
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);

        simpleGfxGrid = grid;


        //rectangle = new Rectangle(simpleGfxGrid.columnToX(getCol()), simpleGfxGrid.rowToY(getRow()), simpleGfxGrid.getCellSize(), simpleGfxGrid.getCellSize());
        asteroid = new Picture(simpleGfxGrid.columnToX(getCol()), simpleGfxGrid.rowToY(getRow()), "asteroid.png");
        xWing = new Picture(2*simpleGfxGrid.getCellSize(), (simpleGfxGrid.getRows())/2*simpleGfxGrid.getCellSize(), "xwing.png");
        show();
    }

    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {
        super(col, row, grid);

        simpleGfxGrid = grid;

        rectangle = new Rectangle(simpleGfxGrid.columnToX(col), simpleGfxGrid.rowToY(row), simpleGfxGrid.getCellSize(), simpleGfxGrid.getCellSize());

        show();

    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        //rectangle.fill();
        asteroid.draw();
        xWing.draw();


    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        asteroid.delete();
        xWing.delete();
        //rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        int xI = simpleGfxGrid.columnToX(getCol());
        int yI = simpleGfxGrid.rowToY(getRow());

        super.moveInDirection(direction, distance);

        int xF = simpleGfxGrid.columnToX(getCol());
        int yF = simpleGfxGrid.rowToY(getRow());

        //rectangle.translate(xF-xI, yF-yI);
        asteroid.translate(xF - xI, yF - yI);


        /*
        if (getColor() == GridColor.GREEN) {

            switch (direction) {
                case UP:
                    car.load("mustang-up.png");
                    break;
                case DOWN:
                    car.load("mustang-down.png");
                    break;
                case LEFT:
                    car.load("mustang-left.png");
                    break;
                case RIGHT:
                    car.load("mustang-right.png");
                    break;
            }

         */
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        super.setColor(color);
        //rectangle.setColor(SimpleGfxColorMapper.getColor(color));
        //mustangUP

        /*
        if (getColor() == GridColor.RED) {
            car.load("carcrash.png");
        } else if (getColor() == GridColor.BLUE){
            car.load("fiat.png");
        }*/
        //mustangRight.load((getColor() == GridColor.RED) ? "carcrash2.png" : "mustang-right.png");

    }

}
