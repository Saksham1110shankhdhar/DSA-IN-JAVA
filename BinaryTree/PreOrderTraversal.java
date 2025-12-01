package BinaryTree;

import java.util.ArrayList;

public class PreOrderTraversal {
    public ArrayList<Integer> preOrder(Node root) {
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
       ans.add(root.data);
       dfs(root.left,ans);
       dfs(root.right,ans);
    }
}
