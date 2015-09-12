/*
William Thing
9/12/15

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
*/

public class FindMaxDepth {
    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }

    private int maxDepth(TreeNode root, int depth) {
        if (root != null) {
            return Math.max(maxDepth(root.left, depth+1), maxDepth(root.right, depth+1));
        }
        return depth;
    }
}
