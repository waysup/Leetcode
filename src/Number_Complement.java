import java.util.ArrayList;
import java.util.List;

public class Number_Complement {

    public static void main(String[] args){
        int num = 1;
        Number_Complement solver = new Number_Complement();
        System.out.println(solver.findComplement(num));
    }

    public int findComplement(int num) {

        List<Integer> remainders = new ArrayList<>();
        while (num != 0){
            remainders.add(1 - num % 2);
            num /= 2;
        }
        int sum = 0;
        for (int i = remainders.size() - 1; i >= 0; i--){
            sum = remainders.get(i) + sum * 2;
        }
        return sum;
    }


}

//    Given a positive integer, output its complement number.
// The complement strategy is to flip the bits of its binary representation.
//
//        Note:
//        The given integer is guaranteed to fit within the range of a 32-bit signed integer.
//        You could assume no leading zero bit in the integer’s binary representation.
//        Example 1:
//        Input: 5(101)
//        Output: 2(010)
