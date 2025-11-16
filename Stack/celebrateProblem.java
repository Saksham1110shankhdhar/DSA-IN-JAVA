package Stack;

import java.util.Stack;

public class celebrateProblem {
    public int celebrity(int mat[][]) {
        
        int n=mat.length;
        
        Stack<Integer> st= new Stack<>();
        
        for(int i=0;i<n;i++){
            st.push(i);
        }
        
        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            
            if(mat[a][b]==0 && mat[b][a]==1) st.push(a);
            
            if( mat[b][a]==0 && mat[a][b]==1) st.push(b);
            
            
        }
        
        if(st.size()==0) return -1;
        
        int celeb=st.pop();
        
        for(int i=0;i<n;i++){
            if(i==celeb) continue;
            
            if(mat[celeb][i]==1 || mat[i][celeb]==0 ) return -1;
            
        }
        
        return celeb;
        
    }
}
