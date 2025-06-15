class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeMinMax {
    public int findMax(TreeNode root) {
        if (root == null) return Integer.MIN_VALUE;

        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public int findMin(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;

        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);

        return Math.min(root.val, Math.min(leftMin, rightMin));
    }
}

