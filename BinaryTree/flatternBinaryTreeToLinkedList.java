package BinaryTree;

import java.util.ArrayList;

public class flatternBinaryTreeToLinkedList {
    public static void flatten(Node root) {
        ArrayList<Node> pre= new ArrayList<>();
        dfs(root,pre);
        
        for(int i=0;i<pre.size()-1;i++){
            pre.get(i).left=null;
            pre.get(i).right=pre.get(i+1);
        }
        
        
    }
    
    public static void dfs(Node root,ArrayList<Node> pre){
        if(root==null){
            return;
        }
       //System.out.print(a.data+" ");
       //size++;
       pre.add(root);
       dfs(root.left,pre);
       dfs(root.right,pre);
    }
}
