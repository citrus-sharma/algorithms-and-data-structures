package treesandgraphs.binarysearchtree.treetraversals;

import treesandgraphs.TreeNode;

public class PostOrderTraversalDemo {
    public static void main (String args[]) {

        TreeNode treeNode = new TreeNode(3);

        TreeNode right1 = new TreeNode(7);
        TreeNode left1 = new TreeNode(2);

        treeNode.setLeft(left1);
        treeNode.setRight(right1);

        TreeNode leftRight = new TreeNode(5);
        TreeNode leftLeft = new TreeNode(1);
        left1.setLeft(leftLeft);
        left1.setRight(leftRight);

        TreeNode rightRight = new TreeNode(10);
        TreeNode rightLeft = new TreeNode(0);
        right1.setLeft(rightLeft);
        right1.setRight(rightRight);


        PostOrderTraversal traversal = new PostOrderTraversal();
        traversal.displayPostOrderTraversal(treeNode);

    }

}
