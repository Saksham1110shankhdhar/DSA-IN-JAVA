package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class operationsInQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        //peek(q,2);

        //remove(q,2);

        add(q,2,99);

        
    }

    public static void peek(Queue<Integer> q,int idx){

        int n=q.size();

        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }

        System.out.println(q.peek());

        
        // Restore original queue order by rotating back
        for(int i=0;i<n-idx;i++){
           
            q.add(q.remove());
        }

        for(int i=1;i<=n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());

        }

       
    }

     public static void remove(Queue<Integer> q,int idx){
        int n=q.size();

        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }

        System.out.println(q.remove());
        // Restore original queue order by rotating back
        for(int i=0;i<n-idx-1;i++){
           
            q.add(q.remove());
        }

        int m=q.size();

        for(int i=0;i<m;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());

        }
    }
    
     public static void add(Queue<Integer> q,int idx,int ele){
        int n=q.size();

        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }

        q.add(ele);
        // Restore original queue order by rotating back
        for(int i=0;i<n-idx;i++){
           
            q.add(q.remove());
        }

        int m=q.size();

        for(int i=0;i<m;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());

        }
    }

}
