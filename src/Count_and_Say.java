public class Count_and_Say {


    public static void main(String[] args) {

        Count_and_Say solver = new Count_and_Say();

        for (int i = 0; i < 10; i++)
            System.out.println(solver.countAndSay(i));
    }

    public String countAndSay(int n) {
        if (n <= 0) return null;
        if (n == 1) return "1";

        StringBuilder sb = new StringBuilder();

        String PrevString = countAndSay(n - 1);
        char[] prevChars = PrevString.toCharArray();

        int left = 0;
        int i = left;
        while (i < prevChars.length) {
            while (i + 1 < prevChars.length && prevChars[i] == prevChars[i + 1]) {
                i++;
            }
            int cnt = i + 1 - left;
            sb.append(cnt).append(prevChars[i]);
            left = ++i;
        }
        return sb.toString();
    }
}

//        1.     1
//        2.     11
//        3.     21
//        4.     1211
//        5.     111221



