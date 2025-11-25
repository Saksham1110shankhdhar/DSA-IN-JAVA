package BinarySearchTree;

import java.util.ArrayList;

public class postOrderTraversal {
     public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans= new ArrayList<>();
        dfs(root,ans);
        return ans;
        
    }
    public void dfs(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
       //System.out.print(a.data+" ");
       //size++;
       
       dfs(root.left,ans);
       dfs(root.right,ans);
       ans.add(root.data);
    }
}
