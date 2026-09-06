/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxPathSum(TreeNode root) {

        int [] max =  new int[1];
        max[0] = Integer.MIN_VALUE;
        pathSum(root, max);
        return max[0];
        
    }
    public int pathSum(TreeNode root, int[] max) {
        if(root==null) return 0;
        int leftSum = pathSum(root.left, max);
        if(leftSum < 0) leftSum=0;
        int rightSum = pathSum(root.right,  max);
        if(rightSum < 0) rightSum=0;
        max[0] =  Math.max(leftSum+ root.val + rightSum, max[0]);

        return Math.max(rightSum,leftSum ) + root.val;
        
    }

}
