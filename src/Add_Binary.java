public class Add_Binary {


    public static void main(String[] args) {

        Add_Binary solver = new Add_Binary();
        System.out.println(solver.addBinary("1010", "1011"));
        System.out.println(solver.addBinary("11", "1"));
        System.out.println(solver.addBinary("", ""));
        System.out.println(solver.addBinary("0", "0"));


    }

    public String addBinary(String a, String b) {
//        should consider very long 0-1 sequence!

        int i = a.length() - 1;
        int j = b.length() - 1;

        int sum = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0) {
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            sum /= 2;
        }
        if (sum != 0) sb.append(sum);
        return sb.reverse().toString();
    }
}
