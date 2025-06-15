class Node {
    int value;
    Node left, right;

    Node(int item) {
        value = item;
        left = right = null;
    }
}
public class TreeNode {
    Node root;


    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
    }
}

