package org.academiadecodigo.bootcamp.grid;

import org.academiadecodigo.bootcamp.gfx.SimpleGfxGrid;

public class GridFactory {

        /**
         * Creates a new grid2
         *
         *
         * gridType the type of grid2 to create
         * @param cols     the number of columns of the grid2
         * @param rows     the number of rows of the grid2
         * @return the new grid2
         */
        public static Grid makeGrid(int cols, int rows) {

                return new SimpleGfxGrid(cols, rows);
        }
}

