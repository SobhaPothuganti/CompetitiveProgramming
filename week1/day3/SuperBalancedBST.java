class BSTNode {

    public int value;
    public BSTNode left;
    public BSTNode right;

    public BSTNode(int value) {
        this.value = value;
    }

    public BSTNode insertLeft(int leftValue) {
        this.left = new BSTNode(leftValue);
        return this.left;
    }

    public BSTNode insertRight(int rightValue) {
        this.right = new BSTNode(rightValue);
        return this.right;
    }
}


class Height
{
    int height = 0;
}
class SuperBalanced {
    public boolean isBalanced(BSTNode root,Height h)
    {
        if(root==null)
        {
            h.height=0;
            return true;
        }
        Height lh=new Height();
        Height rh=new Height();

        boolean leftSTree=isBalanced(root.left,lh);
        boolean rightSTree=isBalanced(root.right,rh);

        h.height=(lh.height>rh.height?lh.height:rh.height)+1;

        if((lh.height-rh.height>=2)||(rh.height-lh.height>=2))
        {
            if((lh.height!=0)&&(rh.height!=0))
                return false;
        }


            return leftSTree & rightSTree;

    }
    public static void main(String[] args) {
        Height height = new Height();
        SuperBalanced tree=new SuperBalanced();
        BSTNode bt = new BSTNode(50);

        BSTNode m1 =bt.insertLeft(30);
        BSTNode m2 = m1.insertRight(40);
        BSTNode m3 = m1.insertLeft(20);
        BSTNode m4 = bt.insertRight(80);
        BSTNode m5 = m4.insertLeft(70);
        // BSTNode m5 = m3.insertLeft(70);
        BSTNode m6 = m4.insertRight(90);



        System.out.println(tree.isBalanced(bt,height));
    }
}
