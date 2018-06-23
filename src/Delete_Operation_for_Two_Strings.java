public class Delete_Operation_for_Two_Strings {

    public static void main(String[] args) {
        Delete_Operation_for_Two_Strings solver = new Delete_Operation_for_Two_Strings();
        System.out.println(solver.minDistance("sea", "eat"));
        System.out.println(solver.minDistance("abcbdab", "bdcaba"));
        System.out.println(solver.minDistance("sea", "ate"));
    }

    public int minDistance(String word1, String word2) {
        int m = word1.length() + 1;
        int n = word2.length() + 1;
        int[][] lcsTable = new int[m][n];
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    lcsTable[i][j] = lcsTable[i - 1][j - 1] + 1;
                else if (lcsTable[i][j - 1] > lcsTable[i - 1][j])
                    lcsTable[i][j] = lcsTable[i][j - 1];
                else lcsTable[i][j] = lcsTable[i - 1][j];
            }
//            lcsTable[m-1][n-1] is #LCS of 1, 2
        return word1.length() + word2.length() - 2 * lcsTable[m - 1][n - 1];
    }
}
