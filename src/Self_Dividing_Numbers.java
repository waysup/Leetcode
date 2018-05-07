import java.util.ArrayList;
import java.util.List;

public class Self_Dividing_Numbers {


    public static void main(String[] args){

        Self_Dividing_Numbers sol = new Self_Dividing_Numbers();

        List<Integer> winners = sol.selfDividingNumbers(1, 22);

        System.out.println(winners);

    }


    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> winners = new ArrayList<>();
        for (int i = left; i <= right; i++){
            //digits
            int val = i;
            List<Integer> digits = new ArrayList<>();
            boolean zero_flag = false;
            do {
                int digit = val % 10;
                if (digit == 0)
                {
                    zero_flag = true;
                    break;
                }
                digits.add(digit);
            }while ((val/=10) != 0);
            if (zero_flag)
                continue;
            //if divided by all digits
            boolean winner_flag = true;
            for (Integer digit: digits) {
                if (i % digit != 0) {
                    winner_flag = false;
                    break;
                }
            }
            if (winner_flag)
            winners.add(i);
        }

        return winners;
    }
}


//    A self-dividing number is a number that is divisible by every digit it contains.
//
//        For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
//
//        Also, a self-dividing number is not allowed to contain the digit zero.
//
//        Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
//
//        Example 1:
//        Input:
//        left = 1, right = 22
//        Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
//        Note:
//
//        The boundaries of each input argument are 1 <= left <= right <= 10000.