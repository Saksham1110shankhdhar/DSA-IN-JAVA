package Stack;

import java.util.Stack;

public class parenthesesChecker {
     public boolean isBalanced(String s) {
        Stack<Character> st= new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else{
                if(st.size()>0 && isSameType(st.peek(),ch)){
                    st.pop();
                }else{
                    return false;
                }
            }
        }

        return st.size()==0;
        
    }

     private boolean isSameType(Character opening, char closing) {

        if(opening=='(' && closing==')'){
            return true;
        }
         if(opening=='{' && closing=='}'){
            return true;
        }
         if(opening=='[' && closing==']'){
            return true;
        }

        return false;
       
     }
}
