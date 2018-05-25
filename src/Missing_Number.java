public class Missing_Number {

    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};

        Missing_Number solver = new Missing_Number();

        int missed = solver.missingNumber(nums);
        System.out.println(missed);

    }

//    public int missingNumber(int[] nums) {
//        for (int i = 0; i < nums.length; i++){
//            while (nums[i] > 0 && nums[i] != nums[nums[i] - 1]){
//                int temp = nums[nums[i] - 1];
//                nums[nums[i] - 1] = nums[i];
//                nums[i] = temp;
//            }
//        }
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i] != i + 1)
//                return i+1;
//        }
//        return 0;
//    }
    //easier solution
    public int missingNumber(int[] nums) {
        int sum = nums.length;
        for(int i =0; i<nums.length; i++){
            sum = sum-nums[i]+i;
        }
        return sum;
    }
}
