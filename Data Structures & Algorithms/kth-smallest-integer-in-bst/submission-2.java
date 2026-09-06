class Solution {
    public int kthSmallest(TreeNode root, int k) {

        // arr[0] = count of nodes visited so far
        // arr[1] = value of the kth smallest node
        int[] arr = new int[2];

        arr[0] = 0;

        // Perform inorder traversal
        dfs(root, arr, k);

        // After traversal, arr[1] contains the kth smallest value
        return arr[1];
    }

    public void dfs(TreeNode root, int[] arr, int k) {

        // Base case: no node to process
        if (root == null)
            return;

        // Visit the left subtree first
        // In a BST, left subtree contains smaller values
        dfs(root.left, arr, k);

        // We have now "visited" the current node
        arr[0]++;

        // If this is the kth node visited in inorder,
        // then this node is the kth smallest
        if (arr[0] == k) {
            arr[1] = root.val;

            // Stop processing this path
            return;
        }

        // Visit the right subtree
        // Right subtree contains larger values
        dfs(root.right, arr, k);
    }
}