package Queue;

import java.util.Queue;
import java.util.Stack;

public class reverseFirstKElement {
     public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (k > q.size()) return q;
        Stack<Integer> st= new Stack<>();
        
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        
        while(st.size()>0){
            q.add(st.pop());
        }
        
        int n=q.size();
        
        for(int i=0;i<n-k;i++){
           q.add(q.remove());
        }
        
        return q;
         
        
    }
}
