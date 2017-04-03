package treesandgraphs.binarysearchtree;

public class BinarySearchTreeDemo {
    public static void main(String args[]) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(6);
        binarySearchTree.insert(7);
        binarySearchTree.insert(4);
        binarySearchTree.insert(10);
        binarySearchTree.insert(20);
        binarySearchTree.insert(13);
        binarySearchTree.insert(2);
        binarySearchTree.insert(5);
        binarySearchTree.insert(19);
        binarySearchTree.insert(16);

        /**
         * Binary search delete value demo
         */
        System.out.println("value found:  "+ binarySearchTree.searchValue(19).getValue());
        System.out.println("before deletion");
        binarySearchTree.displayTree();

        System.out.println("after deletion");
        binarySearchTree.deleteNode(20);
        binarySearchTree.displayTree();

        System.out.println("after deletion");
        binarySearchTree.deleteNode(16);
        binarySearchTree.displayTree();

        System.out.println("after deletion");
        binarySearchTree.deleteNode(7);
        binarySearchTree.displayTree();

        System.out.println("after deletion");
        binarySearchTree.deleteNode(4);
        binarySearchTree.displayTree();

        //Get the sum of K smallest elements
        binarySearchTree.displayTree();
        System.out.println("");
        int smallestSum = binarySearchTree.getSmallestSum(4, 0);
        System.out.println("smallest sum is: " + smallestSum);

        //Replace every node with its successor
        binarySearchTree.replaceElementWithSuccessor();
        System.out.println();
        binarySearchTree.displayTree();
    }

}
