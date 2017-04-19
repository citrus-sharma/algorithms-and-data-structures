package treesandgraphs.commonnodesintwobinarytrees;

import treesandgraphs.binarysearchtree.BinarySearchTree;

public class PrintCommonNodesInTwoBinarySearchTreesDemo {
    public static void main(String args[]) {
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
        bst_1.insert(50);
        bst_1.insert(-1);
        bst_1.insert(29);

        BinarySearchTree bst_2 = new BinarySearchTree();
        bst_2.insert(19);
        bst_2.insert(3);
        bst_2.insert(6);
        bst_2.insert(30);
        bst_2.insert(20);
        bst_2.insert(15);

        PrintCommonNodesInTwoBinarySearchTrees commonNodes = new PrintCommonNodesInTwoBinarySearchTrees();
        int lenBst_1 =  bst_1.getHeight(bst_1.getRoot());
        int lenBst_2 =  bst_2.getHeight(bst_2.getRoot());


        if(lenBst_1 > lenBst_2) {
            commonNodes.printCommonNodes(bst_1, bst_2.getRoot());
        }
        else {
            commonNodes.printCommonNodes(bst_2, bst_1.getRoot());
        }


    }
}
