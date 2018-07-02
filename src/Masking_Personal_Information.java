public class Masking_Personal_Information {


    public static void main(String[] args) {

        Masking_Personal_Information solver = new Masking_Personal_Information();
        System.out.println(solver.maskPII("LeetCode@LeetCode.com"));
        System.out.println(solver.maskPII("AB@qq.com"));
        System.out.println(solver.maskPII("1(234)567-890"));
        System.out.println(solver.maskPII("86-(10)12345678"));
        System.out.println(solver.maskPII(""));

    }

    private String maskPII(String S) {
        if (S == null || S.equals("")) return null;
        S = S.toLowerCase();
        if (S.indexOf('@') != -1)
            return maskEmail(S);
        return maskPhoneNumber(S);
    }

    private String maskEmail(String S) {
        int atIndex = S.indexOf('@');
        String maskedID = S.charAt(0) + "*****" + S.charAt(atIndex - 1);
        String domainName = S.substring(atIndex);
        return maskedID + domainName;
    }

    private String maskPhoneNumber(String S) {
        char[] lastFour = new char[4];
        char[] chars = S.toCharArray();

        int digitCount = 0;
        for (int i = S.length() - 1; i >= 0; i--) {
            char c = chars[i];
            if (c >= '0' && c <= '9') {
                if (digitCount < 4)
                    lastFour[3 - digitCount] = c;
                digitCount++;
            }
        }
        if (digitCount == 10) return "***-***-" + String.valueOf(lastFour);
        if (digitCount == 11) return "+*-***-***-" + String.valueOf(lastFour);
        if (digitCount == 12) return "+**-***-***-" + String.valueOf(lastFour);
        return "+***-***-***-" + String.valueOf(lastFour);
    }
}
