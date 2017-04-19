package treesandgraphs.commonnodesintwobinarytrees;

import treesandgraphs.TreeNode;
import treesandgraphs.binarysearchtree.BinarySearchTree;

public class PrintCommonNodesInTwoBinarySearchTrees {

    public void printCommonNodes(BinarySearchTree bstToSearch, TreeNode nodeToSearch) {
        if(nodeToSearch == null) {
            return;
        }
        System.out.println("search for node :" + nodeToSearch.getValue());
        printCommonNodes(bstToSearch, nodeToSearch.getLeft());
        TreeNode result = bstToSearch.searchValue(bstToSearch.getRoot(), nodeToSearch.getValue());
        if(result != null) {
            System.out.print("common nodes are -> " + result.getValue()+ " ");
            System.out.println();
        }
        System.out.println("search for node :" + nodeToSearch.getValue());
        printCommonNodes(bstToSearch, nodeToSearch.getRight());

    }

}
