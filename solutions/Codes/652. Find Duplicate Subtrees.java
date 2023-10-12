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
     Map<String,Integer> map ;
     List<TreeNode> nodelist;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map = new HashMap<String,Integer>();
        nodelist = new ArrayList<>();
        solve(root);
        return nodelist;
    }
    private String solve(TreeNode root){
        if(root==null) return "n";
        
        StringBuilder sb = new StringBuilder();
        sb.append(solve(root.left));
        sb.append(solve(root.right));
        sb.append(root.val+",");
        
        String s = sb.toString();
        
        map.put(s,map.getOrDefault(s,0)+1);
        
        if(map.get(s)==2) nodelist.add(root);
        return s;
    }
}