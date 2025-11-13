package Stack;

public class removeConsicutiveCharacter {
     public String removeConsecutiveCharacter(String s) {
        
        int i=0, j=0;
        
        StringBuilder ans= new StringBuilder("");
        
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }else{
                ans.append(s.charAt(i));
                i=j;
            }
        }
        
        ans.append(s.charAt(i));
        
        return ans.toString();
        
    }
}
