package Stack;
import java.util.Stack;

public class stackTraversal {
    public static void main(String[] args) {
        Stack<String> st= new Stack<>();

        st.push("Saksham");
        st.push("Shivam");
        st.push("Vansh");
        st.push("Harshit");
        st.push("Aditya");
        st.push("Ronak");
        
        
        
        Stack<String> st2= new Stack<>();

         while(st.size()>0){
            System.out.println(st.peek());
            st2.push(st.pop());
         }

         while(st2.size()>0){
            System.out.println(st2.peek());
            st.push(st2.pop());
         }

         System.out.println(st+" "+st2);

        
    }
}
