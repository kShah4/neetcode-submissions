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
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }

    public boolean valid(TreeNode root, long lval , long rval){
            if(root == null){
                return true;
            };
            if( root.val <= lval || root.val >= rval) return false;
            return valid(root.left, lval, root.val) && valid(root.right, root.val, rval);

    }
}
