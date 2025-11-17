package Queue;

import java.util.Stack;

public class ImplementQueueUsingStack {
    Stack<Integer> st= new Stack<>();
    Stack<Integer> st2= new Stack<>();
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1){
            st2.push(st.pop());
            
        }
        int peek=st.pop();

        while(st2.size()>0){
            st.push(st2.pop());
        }
        return peek;
    }
    
    public int peek() {
        while(st.size()>1){
            st2.push(st.pop());
            
        }
        int peek=st.peek();

        while(st2.size()>0){
            st.push(st2.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return st.size()==0;
    }
}
