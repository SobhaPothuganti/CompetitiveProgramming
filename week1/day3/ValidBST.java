import java.util.*;

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

public class ValidBST {
    public boolean checkBST(BSTNode root,int min,int max)
    {
        if(root!=null)
        {
            if(root.value>min && root.value<max){
                return checkBST(root.left,min,root.value) && checkBST(root.right,root.value,max);
            }
            else{
                return false;
            }
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args) {
        BSTNode bt = new BSTNode(100);
        BSTNode b =bt.insertLeft(60);
        BSTNode b0 = b.insertRight(70);
        BSTNode b1 = b.insertLeft(20);
        BSTNode b2 = bt.insertRight(180);
        // BSTNode b3 = bt.insertLeft(180);
       
        

        ValidBST valid = new ValidBST();
        System.out.println(valid.checkBST(bt,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
