package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class EightQueens {
    int GRID_SIZE = 8;

    void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results) {
        if (row == GRID_SIZE) {
            results.add(columns.clone());
        } else {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (checkValid(columns, row, col)) {
                    columns[row] = col;
                    placeQueens(row+1, columns, results);
                }
            }
        }
    }

    boolean checkValid(Integer[] columns, int row1, int column1) {

        return false;
    }


}
