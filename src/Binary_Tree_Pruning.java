public class Binary_Tree_Pruning {
    public static void main(String[] args){
//        Didn't run locally, accepted on first submit.
//        luckyyyyy DOG
    }

    public TreeNode pruneTree(TreeNode root) {
        if (isAZeroTree(root)) return null;
        if (root.left != null && ! isAZeroTree(root.left)){
            pruneTree(root.left);
        }
        else
            root.left = null;
        if (root.right != null && ! isAZeroTree(root.right)){
            pruneTree(root.right);
        }
        else
            root.right = null;
        return root;

    }

//    tell if a subtree at root is a `zero tree`
    boolean isAZeroTree(TreeNode root){
        if (root.val != 0) return false;
        if ((root.left == null || isAZeroTree(root.left)) &&(root.right == null || isAZeroTree(root.right)))
            return true;
        return false;
    }

}


//    We are given the head node root of a binary tree,
// where additionally every node's value is either a 0 or a 1.
//
//        Return the same tree where every subtree (of the given tree)
// not containing a 1 has been removed.
//
//        (Recall that the subtree of a node X is X,
// plus every node that is a descendant of X.)