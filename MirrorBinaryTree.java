class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MirrorBinaryTree {

    public TreeNode mirror(TreeNode node) {
        if (node == null) return null;

        TreeNode leftMirror = mirror(node.left);
        TreeNode rightMirror = mirror(node.right);

        node.left = rightMirror;
        node.right = leftMirror;

        return node;
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        MirrorBinaryTree tree = new MirrorBinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.print("Inorder of Original Tree: ");
        tree.inorder(root);
        System.out.println();

        tree.mirror(root); 

        System.out.print("Inorder of Mirror Tree: ");
        tree.inorder(root);
    }
}

