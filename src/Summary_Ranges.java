import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {


    public static void main(String[] args){

        int[] nums = {0,1,2,4,5,7};
//        int[] nums = {0,2,3,4,6,8,9};
        Summary_Ranges solver = new Summary_Ranges();
        List<String> retStrList =  solver.summaryRanges(nums);

        for (String cons: retStrList)
            System.out.println(cons);

    }

    public List<String> summaryRanges(int[] nums) {
        //Don't return `null`!
        if (nums.length == 0) return new ArrayList<>();

        List<String> retStrList = new ArrayList<>();

        int begin = 0;
        int end = 0;

        while (end < nums.length) {
            while (end + 1 < nums.length && nums[end] == nums[end + 1] - 1)
                end++;
            if (begin == end)
//                System.out.println(nums[begin]);
                retStrList.add(String.valueOf(nums[begin]));
            else
//                System.out.println(nums[begin] + "->" + nums[end]);
                retStrList.add(nums[begin] + "->" + nums[end]);
            begin = end + 1;
            end = begin;
        }
        return retStrList;
    }


}

//    Given a sorted integer array without duplicates, return the summary of its ranges.
//
//        Example 1:
//
//        Input:  [0,1,2,4,5,7]
//        Output: ["0->2","4->5","7"]
//        Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.