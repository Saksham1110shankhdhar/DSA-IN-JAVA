package BinaryTree;

import java.util.Queue;
import java.util.LinkedList;


class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
    }
}

public class implementation {
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(2);
        Node d=new Node(7);
        Node e=new Node(1);
        Node f=new Node(6);

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.right=f;

        print(a);
        System.out.println(sum);
        System.out.println(size(a));
        System.out.println(product(a));
        System.out.println(productNonZero(a));
        System.out.println(Max(a));
        System.out.println(Min(a));
        System.out.println(levels(a));
        bfs(a);
    }
    private static long productNonZero(Node a) {
        if(a==null){
            return 1;
        }
        long leftProduct=productNonZero(a.left);
        long rightProduct=productNonZero(a.right);
        long currentData=a.data==0?1:a.data;
        return leftProduct*rightProduct*currentData;
    }
    private static long product(Node a) {
        if(a==null){
            return 1;
        }
        return product(a.left)*product(a.right)*a.data;
    }

    private static long Max(Node a) {
        if(a==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(a.data,Math.max(Max(a.left),Max(a.right)));
    }
    private static int Min(Node a) {
        if(a==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(a.data,Math.min(Min(a.left),Min(a.right)));
    }

    private static int levels(Node a) {
        if(a==null){
            return 0;
        }
        return 1+Math.max(levels(a.left),levels(a.right));
    }
    static int size=0;
    static int sum=0;

    private static void print(Node a) {
        if(a==null){
            return;
        }
       //System.out.print(a.data+" ");
       //size++;
       sum+=a.data;
       print(a.left);
       print(a.right);
    }

    private static int size(Node a) {
        if(a==null){
            return 0;
        }
        return size(a.left)+size(a.right)+1;
    }

     private static void bfs(Node root) {
        Queue<Node> q= new LinkedList<>();
        if(root!=null) q.add(root);

        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.data+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();

        
    }


     
    
}