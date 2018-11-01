import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {

    private final static String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {

        List<String> results = new ArrayList<>();
        if (digits.equals(""))
            return results;
        combination("", digits, 0, results);
        return results;
    }
    private void combination(String prefix, String digits, int offset, List<String> results) {
        if (offset >= digits.length()) {
            results.add(prefix);
            return;
        }
        for (int i = 0; i < KEYS[(digits.charAt(offset) - '0')].length(); i++) {
            combination(prefix + KEYS[(digits.charAt(offset) - '0')].charAt(i), digits, offset + 1, results);
        }
    }
}
