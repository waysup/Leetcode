import java.lang.reflect.Array;
import java.util.*;

public class Four_Sum {

    public static void main(String[] argv) {
        Four_Sum solver = new Four_Sum();
        int nums[] = {-5,5,4,-3,0,0,4,-2};
        solver.fourSum2(nums, 4);
    }


    public List<List<Integer>> fourSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> quadruplets = new LinkedList<>();

        for (int i = 0; i < nums.length - 3; i++) {
//rule out same elements
            if (i == 0 || nums[i] != nums[i-1])
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int lo = j + 1;
                        int hi = nums.length - 1;
                        while (lo < hi) {
                            int temp_target = nums[i] + nums[j] + nums[lo] + nums[hi];
                            if (temp_target == target) {
                                quadruplets.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                                while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                                while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                                lo++;
                                hi--;
                            }
                            else if (temp_target < target)
                                lo++;
                            else
                                hi--;
                        }
                    }
                }
        }
        return new ArrayList<>(quadruplets);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        
        Set<List<Integer>> quadruplets = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
//rule out same elements
            if (i == 0 || nums[i] != nums[i-1])
            for (int j = i + 1; j < nums.length - 2; j++) {
                //rule out same elements
//                search using hashing method
                if (j == i + 1 || nums[j] != nums[j - 1]) {
                    HashSet<Integer> dudu = new HashSet<>();
                    for (int k = j + 1; k < nums.length; k++) {
                        int cur_target = target - nums[i] - nums[j] - nums[k];
                        if (dudu.contains(cur_target)) {
//                        log quadruplet
                            quadruplets.add(Arrays.asList(nums[i], nums[j], nums[k], cur_target));
                        } else
                            dudu.add(nums[k]);
                    }
                }
            }
        }
        return new ArrayList<>(quadruplets);
    }
}
