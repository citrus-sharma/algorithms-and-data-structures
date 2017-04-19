package treesandgraphs.binarysearchtree.mirrorimage;

import treesandgraphs.binarysearchtree.BinarySearchTree;

public class MirrorImageBstsDemo {
    public static void main(String args[]) {
        BinarySearchTree binarySearchTree_1 = new BinarySearchTree();
        binarySearchTree_1.insert(6);
        binarySearchTree_1.insert(7);
        binarySearchTree_1.insert(4);
        binarySearchTree_1.insert(10);
        binarySearchTree_1.insert(20);
        binarySearchTree_1.insert(13);
        binarySearchTree_1.insert(2);
        binarySearchTree_1.insert(5);
        binarySearchTree_1.insert(19);
        binarySearchTree_1.insert(16);


        BinarySearchTree binarySearchTree_2 = new BinarySearchTree();
        binarySearchTree_2.insert(9);
        binarySearchTree_2.insert(15);
        binarySearchTree_2.insert(7);
        binarySearchTree_2.insert(30);
        binarySearchTree_2.insert(25);
        binarySearchTree_2.insert(18);
        binarySearchTree_2.insert(2);
        binarySearchTree_2.insert(55);
    }

}
