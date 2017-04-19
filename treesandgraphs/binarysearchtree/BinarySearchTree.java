package treesandgraphs.binarysearchtree;

import treesandgraphs.TreeNode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class BinarySearchTree {
    TreeNode root;
    TreeNode lastGuy = null;
    private int counter = 0;

    public TreeNode getRoot() {
        return root;
    }

    public void replaceElementWithSuccessor() {
        replaceElementWithSuccessor(root);
    }
    private void replaceElementWithSuccessor(TreeNode currentNode) {
        if(currentNode == null) {
            return;
        }
        replaceElementWithSuccessor(currentNode.getLeft());
        if(this.lastGuy !=null) {
            lastGuy.setValue(currentNode.getValue());
            lastGuy = currentNode;
        }else {
            this.lastGuy = currentNode;
        }
        replaceElementWithSuccessor(currentNode.getRight());

    }

    private void insert(TreeNode node, int item) {
        if(this.root == null) {
            TreeNode newNode = new TreeNode(item);
            this.root = newNode;
            this.root.setParent(null);
            return;
        }

        if(item < node.getValue()) {
            if(node.getLeft() == null) {
                TreeNode n = new TreeNode(item);
                node.setLeft(n);
                n.setParent(node);
            }else {
                insert(node.getLeft(), item);
            }

        } else if(item > node.getValue()) {
            if(node.getRight() == null) {
                TreeNode n = new TreeNode(item);
                node.setRight(n);
                n.setParent(node);
            }else {
                insert(node.getRight(), item);
            }
        }
    }

    public void insert(int item) {
        insert(this.root, item);
    }

    public TreeNode searchValue(TreeNode node, int value) {
        if(node == null) {
            //System.out.println("value not found");
            return null;
        }
        if(node.getValue() == value) {
            //System.out.println("value found" + value);
            return node;
        }

        if(value < node.getValue()) {
            return searchValue(node.getLeft(), value);
        } else if(value > node.getValue()) {
            return searchValue(node.getRight(), value);
        }
        return null;
    }

    public int getSmallestSum(int sumCount, int sum) {
       return getSmallestSum(this.root, sumCount, sum);
    }

    public int getSmallestSum(TreeNode node, int sumCount, int sum) {
        if(node == null) {
            return sum;
        }

        sum = getSmallestSum(node.getLeft(), sumCount, sum);
        if(counter == sumCount) {
            return sum;
        }
        sum = sum+node.getValue();
        counter++;

        sum = getSmallestSum(node.getRight(), sumCount, sum);

        return sum;
    }

    public int getClosestNumber(int value) {
        if(this.root == null) {
            System.out.println("null tree");
            return -1;
        }
        TreeNode node = root;
        int currMinDiff = Integer.MAX_VALUE;
        int currMinNodeValue = -1;
        while(node != null) {
            if(node.getValue() == value) {
                //currMinDiff = 0;
                return currMinNodeValue;
            }

            int currDiff = Math.abs(node.getValue() - value);
            if(currMinDiff > currDiff) {
                currMinDiff = currDiff;
                currMinNodeValue = node.getValue();
            }

            if(value < node.getValue()) {
                node = node.getLeft();
            }else {
                node = node.getRight();
            }
        }
        return currMinNodeValue;
    }

    public TreeNode searchValue(int value) {
        return searchValue(root, value);
    }

    public int getMinValue(TreeNode node) {
        //TreeNode node = root;
        int minValue = node.getValue();
        while(node.getLeft() != null) {
            minValue = node.getLeft().getValue();
            node = node.getLeft();
        }
        return minValue;
    }

    public TreeNode deleteNode(int item) {
        return deleteNode(this.root, item);
    }

    public TreeNode deleteNode(TreeNode root, int item) {

        TreeNode result = searchValue(root, item);
        //null condition
        if(result == null) {
            return null;
        }

        //root is null condition
        if(this.root == null) {
            return null;
        }

        //leaf condition
        if(result.getLeft() == null && result.getRight() ==  null) {
            TreeNode parent = result.getParent();
            if(parent.getLeft().getValue() == result.getValue()) {
                parent.setLeft(null);
            }else {
                parent.setRight(null);
            }
            return result;
        }

        //left is null
        if(result.getLeft() == null) {
            if(result.getParent().getLeft() != null && result.getParent().getLeft().getValue() == result.getValue()) {
                result.getParent().setLeft(result.getRight());
            } else {
                result.getParent().setRight(result.getRight());
            }
            return result;
        }
        //right is null
        if(result.getRight() == null) {
            if(result.getParent().getLeft()!=null && result.getParent().getLeft().getValue() == result.getValue()) {
                result.getParent().setLeft(result.getLeft());
            } else {
                result.getParent().setRight(result.getLeft());
            }
            return result;
        }
        //both children exist
        int min = getMinValue(result.getRight());
        result.setValue(min);
        deleteNode(result.getRight(), min);
        return result;

    }

    public void displayTree() {
        int height = getHeight(root);
        TreeNode node = root;
        Queue<TreeNode> queue = new LinkedBlockingDeque<>();
        int currLevel = 0;
        this.root.setLevel(0);
        queue.add(this.root);
        TreeNode curr;
        while(!queue.isEmpty() && currLevel < height) {
            curr = queue.remove();
            if(currLevel != curr.getLevel()) {
                currLevel = curr.getLevel();
                System.out.println("");
            }


            System.out.print(curr.getValue() +" ");
            if(curr.getLeft() != null) {
                curr.getLeft().setLevel(currLevel+1);
                queue.add(curr.getLeft());
            } else {
                TreeNode n = new TreeNode();
                n.setValue(-1);
                n.setLevel(currLevel+1);
                queue.add(n);
            }

            if(curr.getRight() != null) {
                curr.getRight().setLevel(currLevel+1);
                queue.add(curr.getRight());
            } else {
                TreeNode n =new TreeNode();
                n.setValue(-1);
                n.setLevel(currLevel+1);
                queue.add(n);
            }

        }
    }

    public int getHeight(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
    }

}
