package treesandgraphs.binarysearchtree.treetraversals;

import treesandgraphs.TreeNode;

public class PostOrderTraversal {
    public void displayPostOrderTraversal(TreeNode node) {

        if(node == null) {
            return;
        }
        displayPostOrderTraversal(node.getLeft());
        displayPostOrderTraversal(node.getRight());
        System.out.print(node.getValue() + " ");
    }
}
