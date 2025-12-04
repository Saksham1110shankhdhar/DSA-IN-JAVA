package Heaps;

public class isBinaryTreeHeap {
    class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }

    public boolean isHeap(Node tree) {
        return maxHeap(tree) && isCBT(tree,1,size(tree));
        
     }

    private boolean maxHeap(Node tree) {
        if(tree==null){
            return true;
        }

        int leftData= tree.left!=null ? tree.left.data :Integer.MIN_VALUE;
        int rightData= tree.right!=null ? tree.right.data :Integer.MIN_VALUE;

        if(tree.data<=leftData || tree.data<=rightData){
            return false;
        }
        return maxHeap(tree.left) && maxHeap(tree.right);
    }

    private boolean isCBT(Node tree, int i, int size) {
       if(tree==null){
        return true;
       }

       if(i>size){
        return false;
       }
        return isCBT(tree.left, 2*i, size) && isCBT(tree.right, 2*i +1, size);
    }

    private int size(Node tree) {
       if(tree==null){
        return 0;
       }
       return 1+ size(tree.left) + size(tree.right);
    }

  }
} 
