package BinaryTree;

import java.util.ArrayList;

public class InOrderTraversal {
     public ArrayList<Integer> inOrder(Node root) {
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
        ans.add(root.data);
       dfs(root.right,ans);
    }
}
