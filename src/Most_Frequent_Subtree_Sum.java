
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Most_Frequent_Subtree_Sum {



    public static void main(String[] args){
        Most_Frequent_Subtree_Sum solver = new Most_Frequent_Subtree_Sum();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-3);
        int[] retList;
        retList = solver.findFrequentTreeSum(root);
        System.out.println(retList.length);
    }


    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) return new int[0];
//        or return null?why wrong?

        List<Integer> sumsAtRoots = new ArrayList<>();

        sumAtRoot(sumsAtRoots, root);

        HashMap<Integer, Integer> mmap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (Integer i: sumsAtRoots){
            int val = mmap.getOrDefault(i, 0) + 1;
            mmap.put(i, val);
            if (val > max)
                max = val;
        }
        List<Integer> ccc = new ArrayList<>();
        for (Integer i: mmap.keySet()){
            if (mmap.get(i) == max){
                ccc.add(i);
            }
        }
        int[] retArray = new int[ccc.size()];
        for (int i = 0; i < ccc.size(); i++){
            retArray[i] = ccc.get(i);
        }
        return retArray;
    }

    public int sumAtRoot(List<Integer> retList, TreeNode root){
//        if (root == null)
        int sum = root.val;
        if (root.left != null) {
            int leftSum = sumAtRoot(retList, root.left);
            sum += leftSum;
        }
        if (root.right != null) {
            int rightSum = sumAtRoot(retList, root.right);
            sum += rightSum;
        }
        retList.add(sum);
        return sum;
    }

}


//    Given the root of a tree, you are asked to find the most frequent subtree sum.
// The subtree sum of a node is defined as the sum of all the node values
// formed by the subtree rooted at that node (including the node itself).
// So what is the most frequent subtree sum value? If there is a tie,
// return all the values with the highest frequency in any order.
//
//        Examples 1
//        Input:
//
//        5
//        /  \
//        2   -3
//        return [2, -3, 4], since all the values happen only once, return all of them in any order.