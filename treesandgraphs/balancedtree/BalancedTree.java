package treesandgraphs.balancedtree;

import treesandgraphs.TreeNode;

public class BalancedTree {

    public int getMaxHeight(TreeNode node) {
        if(node == null) {
            return 0;
        }
        System.out.println(" node: "+ node.getValue());
        int leftHeight = getMaxHeight(node.getLeft());
        int rightHeight = getMaxHeight(node.getRight());

        return (Math.max(leftHeight, rightHeight)+1);
    }
}
