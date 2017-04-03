package treesandgraphs;

public class TreeNodeDemo {
    public static void main(String args[]) {
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

        //TreeNode start = new TreeNode(4);
        //baabuTezChalo(start);

        System.out.println(treeNode.toString());
    }

    static void baabuDheereChalo(TreeNode n, TreeNode m) {
        System.out.println("Before Location Dheere " + n);
        n.setValue(4546);
        n = m;
        System.out.println("After Location Dheere " + n);
    }

    static void baabuTezChalo(TreeNode n) {
        System.out.println("Before " + n.getValue());
        System.out.println("Before Location " + n);
        baabuDheereChalo(n, new TreeNode(303));
        System.out.println("After Location " + n);
        System.out.println("After " + n.getValue());
    }
}
