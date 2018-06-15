public class Add_Strings {

    public static void main(String[] args) {

        Add_Strings solver = new Add_Strings();
        System.out.println(solver.addStrings("217378", "8821"));
        System.out.println(solver.addStrings("0", "1024"));
        System.out.println(solver.addStrings("", ""));
    }

    public String addStrings(String num1, String num2) {
        //        should consider very long sequence!

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0)
                sum += num1.charAt(i--) - '0';
            if (j >= 0)
                sum += num2.charAt(j--) - '0';
            sb.append(sum % 10);
            sum /= 10;
        }
        if (sum != 0) sb.append(sum);
        return sb.reverse().toString();
    }
}
