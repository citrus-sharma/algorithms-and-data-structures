package treesandgraphs;


public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;
    private int size=0;
    private int level;
    public TreeNode() {
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel(){
        return this.level;
    }
    public TreeNode(int value) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }



}
