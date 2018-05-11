import javax.swing.text.JTextComponent;
import java.lang.invoke.WrongMethodTypeException;
import java.security.Key;
import java.util.HashMap;

public class Keyboard_Row {



    public static void main(String[] args){
        Keyboard_Row solver = new Keyboard_Row();

        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};

        String[] targetWords;
        targetWords = solver.findWords(words);
        for (String s:targetWords){
            System.out.println(s);
        }
    }


    public String[] findWords(String[] words) {


        HashMap<Character, Byte> lookupTable = new HashMap<>();

        for (Character s:"qwertyuiop".toCharArray()){
            lookupTable.put(s, (byte)0);
        }
        for (Character s:"asdfghjkl".toCharArray()){
            lookupTable.put(s, (byte)1);
        }
        for (Character s:"zxcvbnm".toCharArray()){
            lookupTable.put(s, (byte)2);
        }

        int count = 0;
        int[] indecies = new int[words.length];

        for (int i = 0; i < words.length; i++){
            String word = words[i];
            char[] chars = word.toLowerCase().toCharArray();
            int j = -1;
            byte wordSec = lookupTable.get(chars[0]);
            boolean flag = true;
            while (++j < chars.length){
                byte curSec = lookupTable.get(chars[j]);
                if (curSec != wordSec) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                indecies[count++] = i;
        }
        String[] retStrings = new String[count];
        for (int i = 0; i < count; i++)
            retStrings[i] = words[indecies[i]];
        return retStrings;
    }
}
//    Given a List of words, return the words that can be typed using letters of alphabet
// on only one row's of American keyboard like the image below.

//    Input: ["Hello", "Alaska", "Dad", "Peace"]
//    Output: ["Alaska", "Dad"]