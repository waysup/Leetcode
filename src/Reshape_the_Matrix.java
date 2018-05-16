public class Reshape_the_Matrix {



    public static void main(String[] args){



    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int rows = nums.length;
        int columns = nums[0].length;
        if (rows * columns != r * c)
            return nums;
        int[][] newMatrix = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                int row = (i * c + j) / columns;
                int column = (i * c + j) % columns;
                newMatrix[i][j] = nums[row][column];
            }
        }
        return newMatrix;
    }
}


//    In MATLAB, there is a very useful function called 'reshape',
// which can reshape a matrix into a new one with different size but keep its original data.
//
//        You're given a matrix represented by a two-dimensional array,
// and two positive integers r and c representing the row number and
// column number of the wanted reshaped matrix, respectively.
//
//        The reshaped matrix need to be filled with all the elements
// of the original matrix in the same row-traversing order as they were.
//
//        If the 'reshape' operation with given parameters is possible and legal,
// output the new reshaped matrix; Otherwise, output the original matrix.