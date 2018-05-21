public class Maximum_Depth_of_Binary_Tree {

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9); root.right = new TreeNode(20);
        root.right.left = new TreeNode(15); root.right.right = new TreeNode(7);
        Maximum_Depth_of_Binary_Tree solver = new Maximum_Depth_of_Binary_Tree();
        System.out.println(solver.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int depthOfLeftChild = 0;
        int depthOfRightChild = 0;
        if (root.left != null)
            depthOfLeftChild = maxDepth(root.left);
        if (root.right != null)
            depthOfRightChild = maxDepth(root.right);
        return depthOfLeftChild > depthOfRightChild ? depthOfLeftChild + 1 : depthOfRightChild + 1;
    }
}

//    Given a binary tree, find its maximum depth.
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//        Note: A leaf is a node with no children.
//
//        Example:
//
//        Given binary tree [3,9,20,null,null,15,7],
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        return its depth = 3.