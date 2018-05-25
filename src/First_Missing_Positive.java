public class First_Missing_Positive {


    public static void main(String[] args){

        First_Missing_Positive solver = new First_Missing_Positive();

        int[] nums = {3,4,-1,1};
        int result = solver.firstMissingPositive(nums);
        System.out.println(result);
    }

    public int firstMissingPositive(int[] nums) {

        if (nums == null || nums.length == 0) return 1;

        for (int i = 0; i < nums.length; i++){
//            NOT if!!!
            while (nums[i] >= 1 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]){
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != i + 1)
                return i + 1;
        return nums.length + 1;
    }
}
