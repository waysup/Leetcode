public class Rotate_String {


    public static void main(String[] args){
        Rotate_String solver = new Rotate_String();

        String A = "abcde";
        String B = "cdeab";
        boolean result = solver.rotateString(A, B);

        System.out.println(result);
    }

    public boolean rotateString(String A, String B) {
        int lengthA = A.length();
        int lengthB = B.length();
        if (lengthA != lengthB)
            return false;
        if (lengthA == 0)
            return true;
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();
        for (int shift = 1; shift < lengthA; shift++){
            int pos = shift;
            int i = 0;
            while (i < lengthA && charsA[pos] == charsB[i]){
                i++;
                pos = (pos + 1) % lengthA;
            }
            if (i == lengthA)
                return true;
        }
        return false;
    }
}
