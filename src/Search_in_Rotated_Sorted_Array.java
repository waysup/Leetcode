public class Search_in_Rotated_Sorted_Array {

    public int search(int[] nums, int target) {
        return searchInRotated(nums, 0, nums.length - 1, target);
    }

    private int searchInRotated(int[] nums, int left, int right, int target) {
        if (left > right)
            return -1;
        int mid = (left + right) / 2;
        if (nums[mid] == target)
            return mid;

        if (nums[left] <= nums[mid]) {
            if (target >= nums[left] && target <= nums[mid])
                return searchInRotated(nums, left, mid - 1, target);
            return searchInRotated(nums, mid + 1, right, target);
        }
//        right sub-array is sorted
        else {
            if (target >= nums[mid] && target <= nums[right])
                return searchInRotated(nums, mid + 1, right, target);
            return searchInRotated(nums, left, mid - 1, target);
        }
    }

}
