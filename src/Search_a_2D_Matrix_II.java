public class Search_a_2D_Matrix_II {



    public static void main(String[] args){

        Search_a_2D_Matrix_II solver = new Search_a_2D_Matrix_II();

        int[][] matrix = {
                            {1,   4,  7, 11, 15},
                            {2,   5,  8, 12, 19},
                            {3,   6,  9, 16, 22},
                            {10, 13, 14, 17, 24},
                            {18, 21, 23, 26, 30}
                        };
//        int[][] matrix = {};
        int target = 20;
        solver.searchMatrix(matrix, target);

    }

//TODO:optimize
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        while (i < m) {
            while (j < n) {
                if (matrix[i][j] == target) {
//                    System.out.println(i + ", " + j);
                    return true;
                }
                if (matrix[i][j] < target) {
                    j++;
                } else
                    break;
            }
            i++;
            j = 0;
        }
        return false;
    }
}
