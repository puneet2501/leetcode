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
    public List<Integer> largestValues(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        
        q.add(root);
        while(q.size()>0){
            int n = q.size();
            int max = Integer.MIN_VALUE;
            boolean flag = false;
            for(int i=0; i<n; i++){
                TreeNode node = q.remove();
                if(max<node.val) max = node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null)q.add(node.right);                
            }
            list.add(max);
        }
        return list;
    }
}