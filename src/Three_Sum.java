import java.util.*;


public class Three_Sum {


    public static void main(String[] args){
        Three_Sum solver = new Three_Sum();

        int[] array = {-1, 0, 1, 2, -1, -4};
        solver.threeSum(array);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> results = new HashSet<>();

        int i = 0;
        while ( i < nums.length - 2){
            if (nums[i] > 0) break;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) results.add(Arrays.asList(nums[i], nums[left], nums[right]));
                if (sum <= 0) while (nums[left] == nums[++left] && left < right);
                if (sum >= 0) while (nums[right] == nums[--right] && left < right);
            }
            while (nums[i] == nums[++i] && i < nums.length - 2);
        }
        System.out.println(results.size());
        return new ArrayList<>(results);
    }
}
