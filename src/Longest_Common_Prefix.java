public class Longest_Common_Prefix {


    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int minLength = Integer.MAX_VALUE;
        for (String s: strs){
            if (s.length() < minLength)
                minLength = s.length();
        }
        int maxPos = 0;
        //iterable over chars
        for (int i = 0; i < minLength; i++){
            char signal = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if (strs[j].charAt(i) != signal)
                    return strs[0].substring(0, maxPos);
            }
            maxPos++;
        }
        return strs[0].substring(0, maxPos);
    }
}


//    Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//
//        Example 1:
//
//        Input: ["flower","flow","flight"]
//        Output: "fl"

