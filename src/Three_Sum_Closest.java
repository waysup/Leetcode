import java.util.Arrays;

public class Three_Sum_Closest {

    public static void main(String[] args) {
        Three_Sum_Closest solver = new Three_Sum_Closest();
        int result = solver.threeSumClosest(new int[]{-1,2,1,4}, 1);
        System.out.println(result);
    }

    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int begin = i + 1, end = nums.length - 1;
            while (begin < end) {
                int tempResult = nums[i] + nums[begin] + nums[end];
                if (tempResult > target)
                    end--;
                else
                    begin++;
                result = (Math.abs(target - result) > Math.abs(target - tempResult)) ? tempResult : result;
            }
        }
        return result;
    }
}
