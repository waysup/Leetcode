public class First_Unique_Character_in_a_String {


    public static void main(String[] args) {

        First_Unique_Character_in_a_String solver = new First_Unique_Character_in_a_String();
        System.out.println(solver.firstUniqChar("loveleetcode"));
        System.out.println(solver.firstUniqChar("cc"));
        System.out.println(solver.firstUniqChar(null));
    }

    public int firstUniqChar(String s) {

        if (s == null) return -1;

        int[] charCount = new int[26];
        //fill count table
        for (char inc : s.toCharArray())
            charCount[inc - 'a']++;
        //find first ele with value :1
        int index = -1;
        for (char chr : s.toCharArray()) {
            index++;
            if (charCount[chr - 'a'] == 1)
                return index;
        }
        return -1;
    }
}
