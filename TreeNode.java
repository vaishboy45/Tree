class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeTraversals {
    TreeNode root;

    public void buildSampleTree() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
    }

    public void preorder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public void postorder(TreeNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }

    public static void main(String[] args) {
        BinaryTreeTraversals tree = new BinaryTreeTraversals();
        tree.buildSampleTree();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}

