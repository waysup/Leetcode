public class Toeplitz_Matrix {



    public static void main(String[] args){
//        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] matrix = {{1},{1}, {1}};
        Toeplitz_Matrix solver = new Toeplitz_Matrix();
        boolean result = solver.isToeplitzMatrix(matrix);
        System.out.println(result);
    }

    public boolean isToeplitzMatrix(int[][] matrix) {


        int row = 0;
        for (int j = 0; j < matrix[0].length; j++){
            int nexti = row + 1;
            int nextj = j + 1;
            while (nexti < matrix.length && nextj < matrix[0].length && matrix[row][j] == matrix[nexti][nextj]) {
                nexti++;
                nextj++;
            }
            if (nexti < matrix.length && nextj < matrix[0].length)
                return false;
        }

        int column = 0;
        for (int i = 1; i < matrix.length; i++){
            int nexti = i + 1;
            int nextj = column + 1;
            while (nexti < matrix.length && nextj < matrix[0].length && matrix[i][column] == matrix[nexti][nextj]) {
                nexti++;
                nextj++;
            }
            if (nexti < matrix.length && nextj < matrix[0].length)
                return false;
        }

        return true;

    }
}
