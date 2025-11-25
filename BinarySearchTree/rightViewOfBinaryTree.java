package BinarySearchTree;

import java.util.ArrayList;

public class rightViewOfBinaryTree {
    private  int levels(Node a) {
        if(a==null){
            return 0;
        }
        return 1+Math.max(levels(a.left),levels(a.right));
    }
    
    public ArrayList<Integer> rightView(Node root) {
        int []arr=new int[levels(root)];
        dfs(root,0,arr);
        ArrayList<Integer> ans= new ArrayList<>();
        for(int ele:arr){
            ans.add(ele);
        }
        return ans;
        
    }
    public void dfs(Node root,int levels,int arr[]){
        if(root==null){
            return;
        }
       //System.out.print(a.data+" ");
       //size++;
       arr[levels]=(root.data);
       dfs(root.left,levels+1,arr);
       dfs(root.right,levels+1,arr);
    }
}
