package org.academiadecodigo.bootcamp.gfx;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;
    public static final int cellSize = 10;
    private int cols;
    private int rows;
    Rectangle grid;
    SimpleGfxGrid simpleGrid;
    GridPosition gridPosition;
    private Picture background;

    public SimpleGfxGrid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {

        background = new Picture(0+PADDING,0+PADDING, "background.jpg");
        background.draw();


        /*
        grid = new Rectangle(PADDING,PADDING, cols * cellSize, rows * cellSize);
        grid.draw();
        grid.fill();
        grid.setColor(Color.BLUE);
        */
    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        return cols;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        return rows;
    }

    /**
     * Obtains the width of the grid2 in pixels
     * @return the width of the grid2
     */
    public int getWidth() {
        return grid.getWidth();
    }

    /**
     * Obtains the height of the grid2 in pixels
     * @return the height of the grid2
     */
    public int getHeight() {
        return grid.getHeight();
    }

    /**
     * Obtains the grid2 X position2 in the SimpleGFX canvas
     * @return the x position2 of the grid2
     */
    public int getX() {
        return grid.getX();
    }

    /**
     * Obtains the grid2 Y position2 in the SimpleGFX canvas
     * @return the y position2 of the grid2
     */
    public int getY() {
        return grid.getY();
    }

    /**
     * Obtains the pixel width and height of a grid2 position2
     * @return
     */
    public int getCellSize() {
        return cellSize;
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {

        return gridPosition = new SimpleGfxGridPosition(this);
    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return gridPosition = new SimpleGfxGridPosition(col, row, this);
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {

        return row * cellSize + PADDING;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        return column * cellSize + PADDING;
    }
}
