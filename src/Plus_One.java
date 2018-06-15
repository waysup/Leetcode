import java.util.ArrayList;

public class Plus_One {

//    simple solution
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 9)
                digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }
        int[] retArray = new int[digits.length + 1];
        retArray[0] = 1;
        return  retArray;
    }
//    public int[] plusOne(int[] digits) {
//        ArrayList<Integer> retList = new ArrayList<>();
//
//        int i = digits.length - 1;
//        int sum = 1;
//        while (i >= 0) {
//            sum += digits[i--];
//            retList.add(sum % 10);
//            sum /= 10;
//        }
//        if (sum != 0) retList.add(sum);
//        int[] retValues = new int[retList.size()];
//        int k = retValues.length - 1;
//        for (int a : retList
//                ) {
//            retValues[k--] = a;
//        }
//        return retValues;
//    }
}
