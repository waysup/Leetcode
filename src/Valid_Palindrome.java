public class Valid_Palindrome {
    public static void main(String[] args) {
        Valid_Palindrome solver = new Valid_Palindrome();
        System.out.println(solver.isPalindrome("race a car"));
        System.out.println(solver.isPalindrome("12021"));
        System.out.println(solver.isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        char[] schars = s.toLowerCase().toCharArray();
        int i = 0;
        int j = schars.length - 1;
        while (i < j) {
            if (schars[i] == schars[j]) {
                i++;
                j--;
            } else {
                boolean inZone1 = false;
                boolean inZone2 = false;
                if (!isAlnum(schars[i]))
                    i++;
                else
                    inZone1 = true;
                if (!isAlnum(schars[j]))
                    j--;
                else inZone2 = true;
                if (inZone1 && inZone2)
                    return false;
            }
        }
        return true;
    }

    private boolean isAlnum(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
