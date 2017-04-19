package treesandgraphs.binarysearchtree.treetraversals;

import treesandgraphs.TreeNode;

public class InOrderTraversal {
    //private int sum = 0;
    private int counter = 0;
    private TreeNode lastGuy = null;
    public void displayInOrderTraversal(TreeNode node) {
        if(node == null) {
            return;
        }
        System.out.println(" node being traversed " + node.getValue());
        displayInOrderTraversal(node.getLeft());
        //System.out.print(node.getValue() + " ");
        displayInOrderTraversal(node.getRight());
    }
}
