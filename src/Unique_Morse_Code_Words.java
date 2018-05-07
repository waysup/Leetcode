

public class Unique_Morse_Code_Words {

    private static String[] code_table = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static void main(String[] args){
        String[] words = new String[]{"gin", "zen", "gig", "msg"};

        Unique_Morse_Code_Words sol = new Unique_Morse_Code_Words();

        int count = 0;
        count  = sol.uniqueMorseRepresentations(words);
        System.out.println(count);

    }

    public int uniqueMorseRepresentations(String[] words) {

        char A = 'a';
        int count = 0;
        String[] codes = new String[words.length];
        for (String word: words){
            codes[count] = new String();
            for (char i: word.toCharArray()){
                codes[count] += code_table[i-A];
            }
            count++;
        }
        for (String i: codes){
            System.out.println(i);
        }

        for (int i = 0; i < codes.length - 1; i++){
            if (codes[i] != null){
                for (int j = i+1; j < codes.length; j++){
                    if (codes[j] != null && codes[i].equals(codes[j])){
                        codes[j] = null;
                    }
                }
            }
//            else; continue
        }
        int unique_cnt = 0;
        for(int i = 0; i < codes.length; i++){
            if (codes[i] != null)
                unique_cnt++;

        }

        return unique_cnt;
    }
}


//morse table
//[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
//Example:
//        Input: words = ["gin", "zen", "gig", "msg"]
//        Output: 2
//        Explanation:
//        The transformation of each word is:
//        "gin" -> "--...-."
//        "zen" -> "--...-."
//        "gig" -> "--...--."
//        "msg" -> "--...--."
//
//        There are 2 different transformations, "--...-." and "--...--.".