public class Remove_Duplicates_from_Sorted_Array_II {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && i < nums.length - 1 && nums[i] == nums[i-1] && nums[i] == nums[i+1])
                continue;
            nums[left++] = nums[i];
        }
        return left;
    }
}
