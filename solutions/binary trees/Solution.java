import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    class Pair{
        Node node;
        int num;
        Pair(Node node, int num){
            this.node = node;
            this.num = num;
        }
    }

    public void preInPostTraversal(Node root){
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,1));
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        if(root==null) return;

        while(!st.isEmpty()){
            Pair it = st.pop();

            if(it.num==1){
                pre.add(it.node.data);
                it.num++;
                st.push(it);

                if(it.node.left!=null){
                    st.push(new Pair(it.node.left,1));
                }
            }

            else if(it.num==2){
                in.add(it.node.data);
                it.num++;
                st.push(it);

                if(it.node.right!=null){
                    st.push(new Pair(it.node.right,1));
                }
            }

            else{
                post.add(it.node.data);
            }
        }
    }
}
