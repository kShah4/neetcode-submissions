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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0; i<s;i++){
            TreeNode node = q.poll();
                if(node!=null){
                    level.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
                
            }
            if(level.size()> 0){
                    result.add(level);
                }

        }

        return result;
    }
}
