import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum {


    public static void main(String[] args) {

        Combination_Sum solver = new Combination_Sum();
//        int[] candidates = {2,3,6,7};
        int[] candidates = {2,5,3};
        System.out.println(solver.combinationSum(candidates, 8));


    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> results = new ArrayList<List<Integer>>();
        getResult(results, new ArrayList<Integer>(), candidates, target, 0);
        return results;
        }
        private void getResult(List<List<Integer>> results, List<Integer> cur_result, int[] candidates, int target, int start) {
            if (target > 0) {
                for (int i=start; i < candidates.length && target >= candidates[i]; i++) {
                    cur_result.add(candidates[i]);
                    getResult(results, cur_result, candidates, target - candidates[i], i);
                    //target <= 0, remove last one of cur_result
                    cur_result.remove(cur_result.size() - 1);
                }
            }
            else if (target == 0) {
                results.add(new ArrayList<>(cur_result));
            }

    }
}
