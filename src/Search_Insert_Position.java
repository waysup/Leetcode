public class Search_Insert_Position {

    public static void main(String[] args){
        Search_Insert_Position solver = new Search_Insert_Position();
        int[] arr = {1,3,5,6};
        System.out.println(solver.searchInsert(arr, 0));
    }

    public int searchInsert(int[] nums, int target) { ;
        int left = 0;
        int right = nums.length-1;
        int mid = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (right < mid) return mid;
        else return mid+1;
    }
}
