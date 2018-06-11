public class Binary_Tree_Tilt {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Binary_Tree_Tilt solver = new Binary_Tree_Tilt();
        System.out.println(solver.findTilt(root));
    }


    public int findTilt(TreeNode root) {
//        add up title at all nodes
        if (root == null) return 0;
        return findTilt(root.left) + findTilt(root.right) + tiltAtNode(root);
    }

    private int tiltAtNode(TreeNode root) {
        if (root == null) return 0;
        return Math.abs(sumAtNode(root.left) - sumAtNode(root.right));
    }

    private int sumAtNode(TreeNode root) {
        if (root == null) return 0;
        return sumAtNode(root.left) + sumAtNode(root.right) + root.val;
    }
}

//Input:
//        1
//        /   \
//        2     3
//        Output: 1
//        Explanation:
//        Tilt of node 2 : 0
//        Tilt of node 3 : 0
//        Tilt of node 1 : |2-3| = 1
//        Tilt of binary tree : 0 + 0 + 1 = 1