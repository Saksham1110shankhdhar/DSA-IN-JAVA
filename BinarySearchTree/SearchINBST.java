class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}


public class SearchINBST {
    public boolean search(Node root, int key) {
        if(root==null){
            return false;
        }
        else if(root.data>key) return search(root.left,key);
        else if(root.data<key) return search(root.right,key);
        else return true;

    }
}
