public class Sum_of_Two_Integers {


    public int getSum(int num1, int num2) {
        if (0 == num2)
            return num1;
        int sum = num1 ^ num2;
        int carry = (num1 & num2) << 1;
        return getSum(sum, carry);
    }
}


//    Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
//
//        Example:
//        Given a = 1 and b = 2, return 3.