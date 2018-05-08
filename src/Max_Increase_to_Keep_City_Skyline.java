public class Max_Increase_to_Keep_City_Skyline {

    public static void main(String[] args){
        Max_Increase_to_Keep_City_Skyline solver = new Max_Increase_to_Keep_City_Skyline();


        int ret_value;
        int LENGTH = 4;
        int[][] grid = new int[LENGTH][];
        for (int i = 0; i < LENGTH; i++){
            grid[i] = new int[LENGTH];
        }
        grid[0][0] = 3;
        grid[0][1] = 0;
        grid[0][2] = 8;
        grid[0][3] = 4;
        grid[1][0] = 2;
        grid[1][1] = 4;
        grid[1][2] = 5;
        grid[1][3] = 7;
        grid[2][0] = 9;
        grid[2][1] = 2;
        grid[2][2] = 6;
        grid[2][3] = 3;
        grid[3][0] = 0;
        grid[3][1] = 3;
        grid[3][2] = 1;
        grid[3][3] = 0;


        ret_value = solver.maxIncreaseKeepingSkyline(grid);
        System.out.println(ret_value);
    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int[] col_max = new int[grid.length];
        int[] row_max = new int[grid.length];

        for (int i=0; i<grid.length; i++){
//            grid[i][0..length-1]
            col_max[i] = grid[0][i];
            row_max[i] = grid[i][0];

            for (int j = 1; j<grid.length; j++){
                if (grid[j][i] > col_max[i])
                    col_max[i] = grid[j][i];
                if (grid[i][j] > row_max[i])
                    row_max[i] = grid[i][j];
            }
        }
        int total_increase_height = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid.length; j++) {
            int lower = col_max[j];
            int height2 = row_max[i];
            if (lower > height2)
                lower = height2;
            total_increase_height +=  lower - grid[i][j];
            }
        }
        return total_increase_height;


        }
}
