public class Valid_Palindrome_II {

    public static void main(String[] args) {

        Valid_Palindrome_II solver = new Valid_Palindrome_II();
        System.out.println(solver.validPalindrome("aba"));
        System.out.println(solver.validPalindrome("aab"));
        System.out.println(solver.validPalindrome("aihia"));

    }


    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) return false;
        int l = -1;
        int r = s.length();
        while (l++ < r--) {
            if (s.charAt(l) != s.charAt(r)) return isPalindromic(s, l, r - 1) || isPalindromic(s, l + 1, r);
        }
        return true;
    }

    private boolean isPalindromic(String s, int l, int r) {
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        return l >= r;
    }


}
