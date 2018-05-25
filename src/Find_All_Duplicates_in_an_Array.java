import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {

    public static void main(String[] args){
        Find_All_Duplicates_in_an_Array solver = new Find_All_Duplicates_in_an_Array();
        int[] testCase = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> retList = solver.findDuplicates(testCase);
        for (int i: retList)
            System.out.println(i);
        return;
    }

    public List<Integer> findDuplicates(int[] nums) {

        int length = nums.length;
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            int complement_index = length - Math.abs(nums[i]);
            if (nums[complement_index] < 0)
                duplicates.add(Math.abs(nums[i]));
            else
                nums[complement_index] = - nums[complement_index];
        }
        return duplicates;
    }

    }

//    Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array),
//    some elements appear twice and others appear once.
//
//        Find all the elements that appear twice in this array.
//
//        Could you do it without extra space and in O(n) runtime?