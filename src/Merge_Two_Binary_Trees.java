import com.waysup.Merge;

public class Merge_Two_Binary_Trees {


    public static void main(String[] args){

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        Merge_Two_Binary_Trees merge = new Merge_Two_Binary_Trees();
        TreeNode ROOT = merge.mergeTrees(root1, root2);
        System.out.println(ROOT);
    }


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null && t2 == null)
            return null;
        //test and set values
        int value1 = (t1 == null) ? (0) : t1.val;
        int value2 = (t2 == null) ? (0) : t2.val;

        TreeNode root = new TreeNode(value1 + value2);

        if (t1 == null){
            root.left = mergeTrees(null, t2.left);
            root.right = mergeTrees(null, t2.right);
        }
        else if (t2 == null){
            root.left = mergeTrees(null, t1.left);
            root.right = mergeTrees(null, t1.right);
        }
        else {//两结点t1/t2均不为null
            root.left = mergeTrees(t1.left, t2.left);
            root.right = mergeTrees(t1.right, t2.right);
        }

        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

//Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
//
//        You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
//
//        Example 1:
//        Input:
//        Tree 1                     Tree 2
//        1                         2
//        / \                       / \
//        3   2                     1   3
//        /                           \   \
//        5                             4   7
//        Output:
//        Merged tree:
//        3
//        / \
//        4   5
//        / \   \
//        5   4   7
//        Note: The merging process must start from the root nodes of both trees.