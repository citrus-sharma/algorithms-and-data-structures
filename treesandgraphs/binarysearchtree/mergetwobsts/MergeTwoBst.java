package treesandgraphs.binarysearchtree.mergetwobsts;

import treesandgraphs.TreeNode;
import treesandgraphs.binarysearchtree.BinarySearchTree;

public class MergeTwoBst {

    public void mergeBst(BinarySearchTree bst_1, TreeNode bst2_node) {
        if(bst2_node == null ){
            return;
        }

        mergeBst(bst_1, bst2_node.getLeft());
        bst_1.insert(bst2_node.getValue());
        mergeBst(bst_1, bst2_node.getRight());
    }
}
