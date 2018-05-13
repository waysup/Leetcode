public class Flipping_an_Image {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++)
//            (A[i].length+1) / 2确保循环到达奇偶的中间
            for (int j = 0; j < (A[i].length+1) / 2; j++){
            int right = A[i].length - j - 1;
            if (A[i][j] == A[i][right])//0,0|1,1->1,1|0,0
                A[i][j] = A[i][right] = 1 - A[i][j];
//            else do nothing
            }
        return A;
    }
}

