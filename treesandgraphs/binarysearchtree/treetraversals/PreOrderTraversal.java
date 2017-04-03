package treesandgraphs.binarysearchtree.treetraversals;

import treesandgraphs.TreeNode;

public class PreOrderTraversal {
    public void displayPreOrderTraversal(TreeNode node) {

        if(node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        displayPreOrderTraversal(node.getLeft());
        displayPreOrderTraversal(node.getRight());
    }

}
