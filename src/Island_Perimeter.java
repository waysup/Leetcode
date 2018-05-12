public class Island_Perimeter {


    public static void main(String[] args) {
        Island_Perimeter solver = new Island_Perimeter();
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
//        int[][] grid = {{1}, {0}};


        int perimeter = solver.islandPerimeter(grid);

        System.out.println(perimeter);
    }

    //    lots of redundant checks!
    public int weightOfGridOne(int[][] grid, int i, int j) {
        int defWeight = 4;
        if (i - 1 >= 0 && grid[i - 1][j] == 1) defWeight--;
        if (i + 1 < grid.length && grid[i + 1][j] == 1) defWeight--;
        if (j - 1 >= 0 && grid[i][j - 1] == 1) defWeight--;
        if (j + 1 < grid[0].length && grid[i][j + 1] == 1) defWeight--;
        return defWeight;
    }

    public int islandPerimeter(int[][] grid) {

        int perimeter = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    perimeter += weightOfGridOne(grid, i, j);
            }
        return perimeter;

        //Another slower solution...访存的空间局部性真的有体现。
//        int islands = 0;
//        int neighbors = 0;
//        for (int i = grid.length - 1; i >= 0; i--)
//            for (int j = grid[i].length - 1; j >= 0; j--) {
//                if (grid[i][j] == 1) {
//                    islands++;
//                    if (i - 1 >= 0 && grid[i - 1][j] == 1)
//                        neighbors++;
//                    if (j - 1 >= 0 && grid[i][j - 1] == 1)
//                        neighbors++;
//                }
//            }
//            return islands * 4 - neighbors * 2;
//    }
    }
}

//    You are given a map in form of a two-dimensional integer grid
// where 1 represents land and 0 represents water.
// Grid cells are connected horizontally/vertically (not diagonally).
// The grid is completely surrounded by water,
// and there is exactly one island (i.e., one or more connected land cells).
// The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
// One cell is a square with side length 1.
// The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
//
//        Example:
//
//        [[0,1,0,0],
//        [1,1,1,0],
//        [0,1,0,0],
//        [1,1,0,0]]
//
//        Answer: 16