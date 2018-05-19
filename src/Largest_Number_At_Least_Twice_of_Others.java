public class Largest_Number_At_Least_Twice_of_Others {




    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++)
            if (nums[i] > nums[maxIndex])
                maxIndex = i;
        int bar = nums[maxIndex] / 2;
        for (int i = 0; i < nums.length; i++){
            if ( i != maxIndex && nums[i] > bar)
                return -1;
        }
        return maxIndex;
    }
}

//    In a given integer array nums, there is always exactly one largest element.
//
//        Find whether the largest element in the array is
// at least twice as much as every other number in the array.
//
//        If it is, return the index of the largest element, otherwise return -1.