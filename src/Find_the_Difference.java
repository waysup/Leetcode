
public class Find_the_Difference {


    public static void main(String[] args){
        Find_the_Difference solver = new Find_the_Difference();
        System.out.print(solver.findTheDifference("abcd", "abcde"));

    }

    //basically the same as Single_Number
    public char findTheDifference(String s, String t) {

        int[] charCount = new int[26];
        for (char inc: s.toCharArray())
            charCount[inc - 'a']++;
        for (char dec: t.toCharArray()) {
            if (charCount[dec - 'a'] == 0)
                return dec;
            charCount[dec - 'a']--;
        }
        return '\0';//should never execute
    }
}
