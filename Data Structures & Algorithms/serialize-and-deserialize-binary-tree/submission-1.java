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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> result =  new ArrayList<>();
        dfsSerialize(root, result);
        return String.join(",", result);
        
    }
    public void dfsSerialize(TreeNode root , List<String> result) {
        if(root == null) {
            result.add("N");
            return;
        }
        result.add(String.valueOf(root.val));
        dfsSerialize(root.left, result);
        dfsSerialize(root.right, result);
    }



    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        
        return dfsDeserialize(nodes);

        
    }


    public TreeNode dfsDeserialize(Queue<String> nodes){
        String val  =  nodes.poll();
        if(val.equals("N")) return null;
        TreeNode node =  new TreeNode(Integer.parseInt(val));
        node.left= dfsDeserialize(nodes);
        node.right= dfsDeserialize(nodes);
        return node;
        
    }
}
