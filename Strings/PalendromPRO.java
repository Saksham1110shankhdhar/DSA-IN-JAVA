package Strings;

public class PalendromPRO {
    public static void main(String[] args) {
        String s="a2b {Cc{B2a";

       System.out.println( ispalindrome(s));
    }

    public static boolean ispalindrome(String s) {
       int i=0, j=s.length()-1;

       while(i<=j){
        char c=s.charAt(i);

        char ch=s.charAt(j);

        if(c==' '){
           i++;
        }else if(ch==' '){
            j--;
        }else{
            if(c>=65 && c<=90 ){
                c=(char)(c+32);
            }else if(ch>=65 && ch<=90){
                ch=(char)(ch+32);
            }
            if(c!=ch) return false;
            i++;
            j--;
        }
        
       }
       return true;

    }
}
