public class Multiply_Strings {


    public static void main(String[] args) {

        Multiply_Strings solver = new Multiply_Strings();
        System.out.println(solver.multiply("9133", "0"));
        System.out.println(solver.multiply("178737387232736726397890", "17237481790902328938293"));
        System.out.println(solver.multiply("", ""));

        System.out.println(solver.addBinary("132", "64"));

    }

    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) return "0";

        int j = num2.length() - 1;
        String result = "0";
        while (j >= 0) {
            int sum = 0;
            int multiplier = num2.charAt(j) - '0';
            StringBuilder sb = new StringBuilder();
            int i = num1.length() - 1;
            while (i >= 0) {
                sum += (num1.charAt(i--) - '0') * multiplier;
                sb.append(sum % 10);
                sum /= 10;
            }
            if (sum != 0) sb.append(sum);
            sb.reverse();
            for (int k = 0; k < num2.length() - 1 - j; k++)
                sb.append('0');
            result = addBinary(result, sb.toString());
            j--;
        }
        return result;
    }

    private String addBinary(String a, String b) {
//        should consider very long sequence!

        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0) {
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            sum /= 10;
        }
        if (sum != 0) sb.append(sum);
        return sb.reverse().toString();
    }
}

//    Given two non-negative integers num1 and num2 represented as strings,
// return the product of num1 and num2, also represented as a string.
//
//        Example 1:
//
//        Input: num1 = "2", num2 = "3"
//        Output: "6"
//Note:
//
//        The length of both num1 and num2 is < 110.
//        Both num1 and num2 contain only digits 0-9.
//        Both num1 and num2 do not contain any leading zero, except the number 0 itself.
//        You must not use any built-in BigInteger library or convert the inputs to integer directly.