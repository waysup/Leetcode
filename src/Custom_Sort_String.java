public class Custom_Sort_String {

    public static void main(String[] args){


        Custom_Sort_String solver = new Custom_Sort_String();

        String S = "cbafg";
        String T = "abcd";
        String retString = solver.customSortString(S, T);
        System.out.println(retString);

    }

    public String customSortString(String S, String T) {
        int length = S.length() + T.length();
        char[] charsS = new char[length];
        int[] charOccurence = new int[length];
        int curPos = 0;
        for (char c: S.toCharArray()){
            charsS[curPos++] = c;
        }
        for (char tc: T.toCharArray()){
            boolean flag = false;
            for (int i = 0; i < curPos; i++){
                if (charsS[i] == tc) {
                    charOccurence[i]++;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                charsS[curPos] = tc;
                charOccurence[curPos++] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < curPos; i++)
            for (int j = 0; j < charOccurence[i]; j++)
                sb.append(charsS[i]);
        return sb.toString();
    }
}

//Example :
//        Input:
//        S = "cba"
//        T = "abcd"
//        Output: "cbad"
