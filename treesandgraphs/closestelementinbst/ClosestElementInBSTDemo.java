package treesandgraphs.closestelementinbst;

import treesandgraphs.binarysearchtree.BinarySearchTree;

public class ClosestElementInBSTDemo {
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

        int closestNum = binarySearchTree.getClosestNumber(-1);
        System.out.println("closest number is : " + closestNum);


    }
}
