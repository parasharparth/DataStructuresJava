package practice.october26.binarytree;

public class BinaryTree {

    Node root;
    BinaryTree(int element)
    {
        root = new Node(element);
    }

    BinaryTree()
    {
        root = null;
    }

    public static void main(String[] args)
    {
        BinaryTree binarytree = new BinaryTree();
        binarytree.root = new Node(1);
        binarytree.root.left = new Node(0);
        binarytree.root.right = new Node(2);
    }
}
