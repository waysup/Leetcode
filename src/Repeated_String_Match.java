import java.util.HashSet;
import java.util.Set;

public class Repeated_String_Match {

    public static void main(String[] args) {
        Repeated_String_Match solver = new Repeated_String_Match();
        System.out.println(solver.repeatedStringMatch("abcd", "cdabcdab"));
        System.out.println(solver.repeatedStringMatch("aa", "aab"));
        System.out.println(solver.repeatedStringMatch("", ""));
    }

    public int repeatedStringMatch(String A, String B) {
        if (!containAllChars(A, B)) return -1;

        if (A.contains(B)) return 1;

        String timesA = A;
        int repeatCount = 1;

        while (timesA.length() < 2 * B.length()) {
            timesA = timesA.concat(A);
            repeatCount++;
            if (timesA.contains(B))
                return repeatCount;
        }
        return -1;
    }

    private Set<Character> getCharset(String s) {
        Set<Character> charset = new HashSet<>();
        for (char c : s.toCharArray()) {
            charset.add(c);
        }
        return charset;
    }

    private boolean containAllChars(String A, String B) {
        return getCharset(A).containsAll(getCharset(B));
    }
}
