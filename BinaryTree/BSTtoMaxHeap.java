package BinaryTree;

import java.util.ArrayList;

public class BSTtoMaxHeap {
     static int i;
    
    public static void convertToMaxHeapUtil(Node root) {
        ArrayList<Integer> ans= new  ArrayList<>();
        
        dfs(root,ans);
        
        i=0;
        
        post( root, ans);
        
    }
    
    public static  void post(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
       post(root.left,ans);
       post(root.right,ans);
       
       root.data=ans.get(i++);
    }
    
    public static  void dfs(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
       dfs(root.left,ans);
       ans.add(root.data);
       dfs(root.right,ans);
    }
}
