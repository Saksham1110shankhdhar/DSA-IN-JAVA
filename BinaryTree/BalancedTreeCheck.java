package BinaryTree;

public class BalancedTreeCheck {
      static boolean flag;
      public boolean isBalanced(Node root) {
        flag=true;
        levels(root);
        return flag;
    }
     
    
    private int levels(Node root) {
        if(root==null){
            return 0;
        }
        int leftLevel=levels(root.left);
        int rightLevel=levels(root.right);
        if(Math.abs(leftLevel-rightLevel)>1){
            flag=false;
        }
        return 1+Math.max(leftLevel,rightLevel);
    }

    // public boolean isBalanced(Node root) {
    //     if(root==null) return true;
    //     int leftLevel=levels(root.left);
    //     int rightLevel=levels(root.right);
        
    //     if(Math.abs(leftLevel-rightLevel)>1) return false;
    //     return isBalanced(root.left) && isBalanced(root.right);
        
    // }
}
