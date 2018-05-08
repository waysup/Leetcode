public class Number_of_Lines_To_Write_String {

    public static void main(String[] args){


        int[] widths = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};

        String S = "abcdefghijklmnopqrstuvwxyz";
        Number_of_Lines_To_Write_String sovler = new Number_of_Lines_To_Write_String();


        int[] ret_tuple;
        ret_tuple = sovler.numberOfLines(widths, S);
        System.out.println(ret_tuple[0] + ", " + ret_tuple[1]);
    }

    public int[] numberOfLines(int[] widths, String S) {

        int line_cnt = 1;
        int unit_cnt = 0;

        for (char s: S.toCharArray()){
            int char_size = widths[s - 'a'];
            unit_cnt += char_size;
            //increase line_cnt; reset unit_cnt
            if (unit_cnt > 100){
                line_cnt++;
                unit_cnt = char_size;
            }
        }
        int[] ret_tuple = new int[2];
        ret_tuple[0] = line_cnt;
        ret_tuple[1] = unit_cnt;


        return ret_tuple;

    }
}
