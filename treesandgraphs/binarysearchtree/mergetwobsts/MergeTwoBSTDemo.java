package treesandgraphs.binarysearchtree.mergetwobsts;

import treesandgraphs.binarysearchtree.BinarySearchTree;

public class MergeTwoBSTDemo {
    public static  void main(String args[]) {
        BinarySearchTree bst_1 = new BinarySearchTree();
        bst_1.insert(6);
        bst_1.insert(7);
        bst_1.insert(4);
        bst_1.insert(10);
        bst_1.insert(20);
        bst_1.insert(13);
        bst_1.insert(2);
        bst_1.insert(5);
        bst_1.insert(19);
        bst_1.insert(16);

        BinarySearchTree bst_2 = new BinarySearchTree();
        bst_2.insert(9);
        bst_2.insert(3);
        bst_2.insert(15);
        bst_2.insert(25);
        bst_2.insert(30);
        bst_2.insert(17);
        bst_2.insert(13);
        bst_2.insert(22);

        System.out.println("tree 1 before merging");
        bst_1.displayTree();

        System.out.println("tree 2 before merging");
        bst_2.displayTree();

        MergeTwoBst mergeBst = new MergeTwoBst();
        mergeBst.mergeBst(bst_1, bst_2.getRoot());
        System.out.println("after merging");
        bst_1.displayTree();
    }
}
