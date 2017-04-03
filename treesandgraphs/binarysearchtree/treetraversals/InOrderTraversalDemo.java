package treesandgraphs.binarysearchtree.treetraversals;

import treesandgraphs.TreeNode;

public class InOrderTraversalDemo {
    public static void main (String args[]) {

        TreeNode treeNode = new TreeNode(11);

        TreeNode left1 = new TreeNode(7);
        TreeNode right1 = new TreeNode(15);

        treeNode.setLeft(left1);
        treeNode.setRight(right1);

        TreeNode leftRight = new TreeNode(8);
        TreeNode leftLeft = new TreeNode(5);
        left1.setLeft(leftLeft);
        left1.setRight(leftRight);

        TreeNode rightRight = new TreeNode(20);
        TreeNode rightLeft = new TreeNode(12);
        right1.setLeft(rightLeft);
        right1.setRight(rightRight);


        InOrderTraversal traversal = new InOrderTraversal();
        traversal.displayInOrderTraversal(treeNode);


    }

}
