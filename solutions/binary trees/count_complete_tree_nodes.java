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
    public int countNodes(TreeNode root) {
        if (root == null)
        return 0;
  
    
    int lh = left_height(root);
    int rh = right_height(root);
  
   
    if (lh == rh)
        return (1 << lh) - 1;
  
   
    return 1 + countNodes(root.left)
           + countNodes(root.right);

    }
    
    static int left_height(TreeNode node)
{
    int ht = 0;
    while (node!=null) {
        ht++;
        node = node.left;
    }
  

    return ht;
}
  

static int right_height(TreeNode node)
{
    int ht = 0;
    while (node!=null) {
        ht++;
        node = node.right;
    }
  
   
    return ht;
}
}