package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> q= new LinkedList<>();
   
    public void push(int x) {
         q.add(x);
    }
    
    public int pop() {
         int n=q.size();

        for(int i=1;i<=n-1;i++){
            q.add(q.remove());
        }

        return q.remove();
    }
    
    public int top() {
        int n=q.size();

        for(int i=1;i<=n-1;i++){
            q.add(q.remove());
        }

        int peek=q.peek();
        q.add(q.remove());

        return peek;
    }
    
    public boolean empty() {
        return q.size()==0;
    }
}
