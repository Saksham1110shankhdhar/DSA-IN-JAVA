package Stack;

import java.util.Stack;

public class reverseStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        print(st);
        System.out.println();

        pushAtBottom(st,50);

        print(st);

        System.out.println();

        reverseStack(st);

        print(st);
    }

    private static void reverseStack(Stack<Integer> st) {
         if(st.size()==1){
            return;
         }

         int top=st.pop();
         reverseStack(st);
         pushAtBottom(st, top);
   }

    private static void pushAtBottom(Stack<Integer> st, int ele) {
       if(st.size()==0){
        st.push(ele);
        return;
       }

       int top=st.pop();
       pushAtBottom(st, ele);
       st.push(top);
    }

    public static void print(Stack<Integer> st){
        
        Stack<Integer> st2= new Stack<>();

         while(st.size()>0){
            System.out.println(st.peek());
            st2.push(st.pop());
            
         }

         while(st2.size()>0){
            st.push(st2.pop());
         }

    }
}
