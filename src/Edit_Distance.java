public class Edit_Distance {


    public static void main(String[] args) {
        Edit_Distance solver = new Edit_Distance();
        System.out.println(solver.minDistance("intention", "execution"));
        System.out.println(solver.minDistance("horse", "ros"));
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length() + 1;
        int n = word2.length() + 1;
        int[][] matrix = new int[m][n];
        for (int i = 1; i < m; i++)
            matrix[i][0] = i;
        for (int j = 1; j < n; j++)
            matrix[0][j] = j;
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    matrix[i][j] = matrix[i - 1][j - 1];
                else
                    matrix[i][j] = Math.min(Math.min(matrix[i - 1][j] + 1, matrix[i][j - 1] + 1), matrix[i - 1][j - 1] + 1);
            }
        return matrix[m - 1][n - 1];
    }
}
