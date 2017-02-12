/**
 * Created by Jerry on 12-02-2017.
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int total = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1)
                    total += getSurroundings(grid, i, j);
            }


        return total;

    }

    private int getSurroundings(int grid[][], int i, int j) {
        int total = 0;

        if (i - 1 == -1 || grid[i - 1][j] != 1)
            total++;

        if (j - 1 == -1 || grid[i][j - 1] != 1)
            total++;

        if (i + 1 == grid.length || grid[i + 1][j] != 1)
            total++;

        if (j + 1 == grid[0].length || grid[i][j + 1] != 1)
            total++;

        return total;
    }


}
