public class SecondLargestBST {

    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }

    public static int findSecondLargest(BinaryTreeNode rootNode) {

        // find the second largest item in the binary search tree
        int n=finding1(rootNode);

        return n;
    }

    public static int finding1(BinaryTreeNode n){
        if(n.right==null) return finding2(n.left);
        else if(n.right.right==null && n.right.left==null) return n.value;
        else {
            return finding1(n.right);
        }
    }
     public static int finding2(BinaryTreeNode n){
        if(n.right==null) return n.value;
        else {
            return finding2(n.right);
        }
    }

