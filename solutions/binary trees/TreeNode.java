import com.sun.source.tree.Tree;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int data){
        this.data = data;
        left = right = null;
    }

    TreeNode(int data, TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

}
