public class Rotate_Array {

    public void rotate(int[] nums, int k) {
        int left_rotate_k = nums.length - k % (nums.length);
        int length = nums.length;
        reverse(nums, 0, left_rotate_k - 1);
        reverse(nums, left_rotate_k, length - 1);
        reverse(nums, 0, length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
