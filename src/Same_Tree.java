public class Same_Tree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q)
            return true;
        if (p == null || q == null || p.val != q.val)
            return false;
        if (! isSameTree(p.left, q.left))
            return false;
        return isSameTree(p.right, q.right);
    }
}
