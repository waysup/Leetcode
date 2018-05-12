public class Length_of_Last_Word {


    public static void main(String[] args){
        Length_of_Last_Word solver = new Length_of_Last_Word();
        System.out.println(solver.lengthOfLastWord("f"));
    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.equals("")) return 0;
        char[] chars = s.toCharArray();
        int end = chars.length;
        while (end > 0 && chars[--end] == ' ') ;

        int start = end++;
        while (start >= 0) {
            if(chars[start] == ' ')
                break;
            start--;
        }
        return end - start - 1;
    }
}
