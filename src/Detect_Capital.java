public class Detect_Capital {

    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if (isLowercase(chars[0])){
//            first char lower, the rest should all be lower
            for (int i = 1; i < chars.length; i++)
                if (isUppercase(chars[i]))
                    return false;
            return true;
        }
        else {
            //first char upper, no more char->true
            if (chars.length == 1) return true;
            else if (isUppercase(chars[1])){
                //if second char is upper, the rest should be upper
                for (int i = 2; i < chars.length; i++)
                    if (isLowercase(chars[i]))
                        return false;
                return true;
            }
            else {
                //if second char is lower, the rest should be lower
                for (int i = 2; i < chars.length; i++)
                    if (isUppercase(chars[i]))
                        return false;
                return true;
            }
        }

    }

    private boolean isUppercase(char c){
        return (c >= 'A') && (c <= 'Z');
    }
    private boolean isLowercase(char c){
        return (c >= 'a') && (c <= 'z');
    }
}


//    Given a word, you need to judge whether the usage of capitals in it is right or not.
//
//        We define the usage of capitals in a word to be right
// when one of the following cases holds:
//
//        All letters in this word are capitals, like "USA".
//        All letters in this word are not capitals, like "leetcode".
//        Only the first letter in this word is capital if it has more than one letter, like "Google".
//        Otherwise, we define that this word doesn't use capitals in a right way.
//        Example 1:
//        Input: "USA"
//        Output: True