import javax.swing.*;

public class Convert_a_Number_to_Hexadecimal {


    public static void main(String[] args){


        Convert_a_Number_to_Hexadecimal solver = new Convert_a_Number_to_Hexadecimal();
        String retsult = solver.toHex(-1);
        System.out.println(retsult);

    }

    public String toHex(int num) {
        if (num == 0) return "0";
        char[] lookupTable = {'0', '1', '2', '3', '4', '5', '6',
        '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuffer sb = new StringBuffer();
        while (num != 0){
            sb.append(lookupTable[num & 15]);
//            不是>>，是>>>!
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
