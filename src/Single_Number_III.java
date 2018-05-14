public class Single_Number_III {

    public static void main(String[] args){

        Single_Number_III solver = new Single_Number_III();

//        int[] testCase = {1,2,1,3,2,5};
        int[] testCase = {1,2,1,9,2,8, 4,3,2,3,2,9};


        int[] retValue = solver.singleNumber(testCase);
        System.out.println(retValue[0] + ", " + retValue[1]);

    }


    public int[] singleNumber(int[] nums) {
//XOR is the xor-result of the two distinct numbers(a, b)
        int XOR = 0;
        for (int num:nums){
            XOR ^= num;
        }
        //find the right-most different bit
        XOR &= -XOR;
//        iterate again to find a, b
        int[] results = {0, 0};
        for (int num: nums){
//            operator precedence
//            `if ((XOR & num) == 1)` is wrong! There are more values other than 0/1
                if ((XOR & num) == 0)
                results[0] ^= num;
            else
                results[1] ^= num;
        }
    return results;
    }
}
