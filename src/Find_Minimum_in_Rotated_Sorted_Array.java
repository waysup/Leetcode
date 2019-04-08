public class Find_Minimum_in_Rotated_Sorted_Array {

    public int findMin(int[] nums) {
        return findMinimumInRotated(nums, 0, nums.length - 1);
    }

    private int findMinimumInRotated(int[] nums, int left, int right) {
        if (left > right)
            return nums[0];
        if (left == right)
            return nums[left];
        int mid = (left + right) / 2;
        if (left < mid && nums[mid] < nums[mid - 1])
            return nums[mid];
        if (mid < right && nums[mid + 1] < nums[mid])
            return nums[mid + 1];
        if (nums[right] > nums[mid])//rule out right sub-array (ascending order)
            return findMinimumInRotated(nums, left, mid - 1);
        return findMinimumInRotated(nums, mid + 1, right);
    }
}
