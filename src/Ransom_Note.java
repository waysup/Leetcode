public class Ransom_Note {

    public static void main(String[] args) {

        Ransom_Note solver = new Ransom_Note();
        System.out.println(solver.canConstruct("aa", "ab"));
        System.out.println(solver.canConstruct("aa", "aab"));
        System.out.println(solver.canConstruct("", ""));


    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];
        //fill count table
        for (char inc : magazine.toCharArray())
            charCount[inc - 'a']++;
        //decrement by 1
        for (char dec : ransomNote.toCharArray()) {
            if (--charCount[dec - 'a'] < 0)
                return false;
        }
        return true;
    }
}
