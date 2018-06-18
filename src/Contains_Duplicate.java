import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {

    public static void main(String[] args) {

        Contains_Duplicate solver = new Contains_Duplicate();
        int[] testArray = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] testArray2 = {1, 5, -2, -4, 0};
        System.out.println(solver.containsDuplicate(testArray));
        System.out.println(solver.containsDuplicate(testArray2));

    }

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
//can't handle negative numbers
//    public boolean containsDuplicate(int[] nums) {
//
//        byte[] marker = new byte[150000];
//        for (int num : nums) {
//            int i = num >> 3;
//            int j = num & 7;
//            int bitNumber = 1 << j;
//            if ((marker[i] & bitNumber) != 0)
//                return true;
//            marker[i] |= bitNumber;
//        }
//        return false;
//    }
}
