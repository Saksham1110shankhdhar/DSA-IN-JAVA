package Recursion;

public class Factorial {
    public static void main(String[] args) {
        
        int facto=factorial(3);
        System.out.println(facto);
    
   
}
 public static int factorial(int n) {
    if(n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
   
}
}
