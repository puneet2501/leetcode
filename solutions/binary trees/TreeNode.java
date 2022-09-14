import com.sun.source.tree.Tree;

public class Node {
    int data;
    Node left;
    Node right;
    Node(){}
    Node(int data){
        this.data = data;
        left = right = null;
    }

    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

}
