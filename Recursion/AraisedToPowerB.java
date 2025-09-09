package Recursion;

public class AraisedToPowerB {
    public static void main(String[] args) {
        
       int pow= power(2,2 );
       System.out.println(pow);
    }

    public static int power(int a, int b){
        if(b==0){
            return 1;
        }
        int pw=power(a,b/2);
        return pw*pw;
        //return a*power(a,b-1);
    }
}
