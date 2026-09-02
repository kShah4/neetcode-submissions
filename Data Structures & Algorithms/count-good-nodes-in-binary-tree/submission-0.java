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
    public int goodNodes(TreeNode root) {

        if(root == null )
            return 0;
        int [] res = new int[2];
        res[0] = 0;
        res[1] = root.val;    
        countNodes(root, res);
        return res[0];
    }


    public void countNodes(TreeNode root , int[] res){
        if(root== null)
            return;
        if(root.val>=res[1]){
            res[0]++;
            res[1] = Math.max(root.val, res[1]);
        }
        countNodes(root.left, res);
        countNodes(root.right, res); 
    }
}
