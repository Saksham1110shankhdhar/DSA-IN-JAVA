package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseAQueue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int n=q.size();

       System.out.println(q);

        Stack<Integer> st= new Stack<>();

        for(int i=0;i<n;i++){
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        for(int i=0;i<n;i++){
            System.out.print(q.remove()+" ");
        }
    }
}
