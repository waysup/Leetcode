public class Remove_Duplicates_from_Sorted_Array {

    public int removeDuplicates(int[] nums) {
        int left = 0;
//        two pointers: 1 slow, 1 fast
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                nums[left++] = nums[i];
            }
        }
        return left;
    }
}
