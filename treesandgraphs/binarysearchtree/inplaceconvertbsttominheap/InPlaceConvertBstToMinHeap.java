package treesandgraphs.binarysearchtree.inplaceconvertbsttominheap;

import treesandgraphs.TreeNode;

public class InPlaceConvertBstToMinHeap {
    public void convertBstToMinHeap(TreeNode node) {
        if(node == null) {
            return;
        }
        convertBstToMinHeap(node.getLeft());
        System.out.println("node getting processed "+ node.getValue());

        convertBstToMinHeap(node.getRight());
    }

    public void displayTree(TreeNode node) {

    }
}
