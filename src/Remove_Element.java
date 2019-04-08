public class Remove_Element {
    public int removeElement(int[] nums, int val) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            while (left < nums.length && nums[left] != val)
                left++;
            while (right >= 0 && nums[right] == val)
                right--;
            if(left > right) break;
            swap(nums, left, right);
            left++;right--;
        }
        return left;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
