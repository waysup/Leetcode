public class Longest_Substring_Without_Repeating_Characters {


    public static void main(String[] args) {

        Longest_Substring_Without_Repeating_Characters solver = new Longest_Substring_Without_Repeating_Characters();
        System.out.println(solver.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solver.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solver.lengthOfLongestSubstring("pwwkew"));
<<<<<<< HEAD

=======
        
>>>>>>> 7d9e7cc6e79cfa9f248052715697b39dc91c99da
    }

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int longest = 0;
        int[] ascii_pos = new int[256];
        for (int i = 0; i < 256; i++)
            ascii_pos[i] = -1;

        for (int i = 0; i < chars.length; i++) {
//            reason for `ascii_pos[chars[i]] + 1`: 从chars[i]上次出现位置的下一个开始计算
            left = Math.max(ascii_pos[chars[i]] + 1, left);
            longest = Math.max(longest, i - left + 1);
            ascii_pos[chars[i]] = i;
        }
        return longest;
    }
}
