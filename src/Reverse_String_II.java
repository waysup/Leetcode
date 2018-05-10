public class Reverse_String_II {


    public static void main(String[] args){


        String s = "fukyasfsuusaciabtch";
        int k = 3;
        Reverse_String_II solver = new Reverse_String_II();
        String rev_s = solver.reverseStr(s, k);

        System.out.println(rev_s);
    }

    public void reverseChars(char[] chars, int left, int right) {

        int LENGTH = right - left;
        for (int i = left; i < left + LENGTH/2; i++) {
            char temp = chars[i];
            chars[i] = chars[left + right - i - 1];
            chars[left + right - i - 1] = temp;
        }
    }

    public String reverseStr(String s, int k) {

        char[] chars = s.toCharArray();
        int nowat = 0;
        while (nowat < chars.length){
            if (chars.length - nowat < k){
                reverseChars(chars, nowat, chars.length);
                break;
            }
            else if (chars.length - nowat >= k && chars.length - nowat < 2*k){
                reverseChars(chars, nowat, nowat + k);
                break;
            }
            else{//
                reverseChars(chars, nowat, nowat + k);
                nowat += 2*k;
            }
        }
        return new String(chars);

    }


}


//    Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
//        Example:
//        Input: s = "abcdefg", k = 2
//        Output: "bacdfeg"
//        Restrictions:
//        The string consists of lower English letters only.
//        Length of the given string and k will in the range [1, 10000]