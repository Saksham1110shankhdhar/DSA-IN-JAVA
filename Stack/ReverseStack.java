package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        reverseStack(st);

        System.out.println(st);
    }

    private static void reverseStack(Stack<Integer> st) {
       Stack<Integer> st2= new Stack<>();

       Stack<Integer> st3= new Stack<>();


       while(st.size()>0){
        st2.push(st.pop());
       }

       while(st2.size()>0){
        st3.push(st2.pop());
       }

       while(st3.size()>0){
        st.push(st3.pop());
       }

       

    }
}
