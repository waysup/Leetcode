import java.util.ResourceBundle;

public class Reverse_Words_in_a_String_III {


    public static void main(String[] args){
        String testCase = "Let's take LeetCode contest";
        Reverse_Words_in_a_String_III solver = new Reverse_Words_in_a_String_III();
        String revWordsinCase = solver.reverseWords(testCase);

        System.out.println(revWordsinCase);

    }

    public String reverseWords(String s) {

        char[] chars = s.toCharArray();

        int start = 0;
        int nowat = 0;
        while (nowat < chars.length) {
            if (chars[nowat] != ' ') {
                nowat++;
                continue;
            }
            else {
                reverseChars(chars, start, nowat);
                nowat++;
                start = nowat;
            }
        }
        //reverse the last word when loop ends
        reverseChars(chars, start, nowat);
        s = new String(chars);
        return s;
    }
    public void reverseChars(char[] chars, int left, int right) {
//        char at right-end is excluded

        int LENGTH = right - left;
        for (int i = left; i < left + LENGTH/2; i++) {
            char temp = chars[i];
            chars[i] = chars[left + right - i - 1];
            chars[left + right - i - 1] = temp;
        }
    }


}


//    Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
//        Example 1:
//        Input: "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
//        Note: In the string, each word is separated by single space and there will not be any extra space in the string.