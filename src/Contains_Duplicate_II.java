import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Contains_Duplicate_II {

    public static void main(String[] args) {

        Contains_Duplicate_II solver = new Contains_Duplicate_II();
        int[] testArray = {1,2,3,1};
        int[] testArray2 = {1,2,3,1,2,3};
        System.out.println(solver.containsNearbyDuplicate(testArray, 3));
        System.out.println(solver.containsNearbyDuplicate(testArray2, 2));
    }


//    use hash map
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            Integer old_index;
//            if ((old_index = map.put(nums[i], i)) != null && Math.abs(old_index - i) <= k)
//                return true;
//        }
//        return false;
//    }

//faster solution: using a set(of size k)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k > 3000) return false;
        if(nums.length < 2 || k < 1){
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
            if(set.size() > k)
                set.remove(nums[i-k]);
        }
        return false;
    }
}
