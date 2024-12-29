package DSA.BinarySearchTree;

public class Runner {
    public static void main(String[] args){

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(8);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(5);
        binaryTree.insert(12);
        binaryTree.insert(2);
        binaryTree.insert(15);

        binaryTree.inOrder();
        binaryTree.preOrder();
        binaryTree.postOrder();
    }
}
