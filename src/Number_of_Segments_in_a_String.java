public class Number_of_Segments_in_a_String {
    
    public static void main(String[] args) {

        Number_of_Segments_in_a_String solver = new Number_of_Segments_in_a_String();
        System.out.println(solver.countSegments("  He llo, my name is John  "));
    }

    public int countSegments(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int cnt = 0;
        while (i < chars.length) {
            int begin = i;
            while (i < chars.length && chars[i] != ' ')
                i++;
            if (begin != i) cnt++;
            while (i < chars.length && chars[i] == ' ')
                i++;
        }
        return cnt;
    }
}
