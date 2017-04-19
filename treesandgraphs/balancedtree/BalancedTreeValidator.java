package treesandgraphs.balancedtree;

import treesandgraphs.TreeNode;

public class BalancedTreeValidator {

    public int getMaxHeight(TreeNode node) {
        if(node == null) {
            return 0;
        }
        System.out.println(" node: "+ node.getValue());
        int leftHeight = getMaxHeight(node.getLeft());
        int rightHeight = getMaxHeight(node.getRight());

        return (Math.max(leftHeight, rightHeight)+1);
    }

    public HeightAndBalanceFlagHolder checkIfTreeIsBalanced(TreeNode node) {
        HeightAndBalanceFlagHolder heightAndBalanceFlagHolder = new HeightAndBalanceFlagHolder();
        if(node == null) {
            heightAndBalanceFlagHolder.setHeight(0);
            heightAndBalanceFlagHolder.setBalancedTree(true);
            return heightAndBalanceFlagHolder;
        }
        HeightAndBalanceFlagHolder leftHolder = checkIfTreeIsBalanced(node.getLeft());

        HeightAndBalanceFlagHolder rightHolder = checkIfTreeIsBalanced(node.getRight());

        heightAndBalanceFlagHolder.setHeight((leftHolder.getHeight() > rightHolder.getHeight())? leftHolder.getHeight()+1:rightHolder.getHeight()+1);


        if(!leftHolder.isBalancedTree() || !rightHolder.isBalancedTree()||Math.abs(leftHolder.getHeight()-rightHolder.getHeight())>1) {
            heightAndBalanceFlagHolder.setBalancedTree(false);
        }
        return heightAndBalanceFlagHolder;
    }
}
