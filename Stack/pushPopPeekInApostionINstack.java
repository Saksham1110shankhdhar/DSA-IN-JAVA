package Stack;

import java.util.Stack;


public class pushPopPeekInApostionINstack {
    public static void main(String[] args) {
        Stack<String> st= new Stack<>();

        st.push("Saksham");
        st.push("Shivam");
        st.push("Vansh");
        st.push("Harshit");
        st.push("Aditya");
        st.push("Ronak");

        print(st);

       System.out.println(peekAtIdx(1,st)); 

       print(st);
       System.out.println();

       System.out.println(pushAtIdx(1,st)); 

       print(st);

       System.out.println();

       System.out.println(popAtIdx(4,st)); 

       print(st);

        
    }

    private static String peekAtIdx(int idx,Stack<String> st) {
        Stack<String> st2= new Stack<>();
        int k=st.size()-idx-1;

        for(int i=1; i<=k; i++){
            st2.push(st.pop());
        }

        String val=st.peek();

        while(st2.size()>0){
            st.push(st2.pop());

        }

        return val;

    }

    private static String pushAtIdx(int idx,Stack<String> st) {
        Stack<String> st2= new Stack<>();
        int k=st.size()-idx;

        for(int i=1; i<=k; i++){
            st2.push(st.pop());
        }

        st.push("Muskan");

        String val=st.peek();

        while(st2.size()>0){
            st.push(st2.pop());

        }

        return val;

    }

     private static String popAtIdx(int idx,Stack<String> st) {
        Stack<String> st2= new Stack<>();
        int k=st.size()-idx-1;

        for(int i=1; i<=k; i++){
            st2.push(st.pop());
        }

        st.pop();

        String val=st.peek();

        while(st2.size()>0){
            st.push(st2.pop());

        }

        return val;

    }
    public static void print(Stack<String> st){
        
        Stack<String> st2= new Stack<>();

        int idx=st.size()-1;

         while(st.size()>0){
            System.out.println(idx--+" "+st.peek());
            st2.push(st.pop());
            
         }

         while(st2.size()>0){
            st.push(st2.pop());
         }

    }
}
