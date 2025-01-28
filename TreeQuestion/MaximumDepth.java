
//  Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

 public int maxDepth(TreeNode root) {
    if (root == null)
        return 0;
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
}

 public class  MaximumDepth{
    public static void main(String[] args) {
       MaximumDepth maximum;
    //    System.out.println(maximum.maxDepth(TreeNode));

    }
}
        

