
public class Reverse_String {

    public String reverseString(String s) {

        char[] s_rev = s.toCharArray();

        int LENGTH = s.length();
        for (int i = 0; i < LENGTH/2; i++){
            char temp = s_rev[i];
            s_rev[i] = s_rev[LENGTH - i -1];
            s_rev[LENGTH - i -1] = temp;
        }
        return new String(s_rev);

    }

}
