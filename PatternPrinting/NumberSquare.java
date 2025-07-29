package PatternPrinting;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        
    
    Scanner sc =new Scanner(System.in);

       System.out.println("Enter the number : ");

       int num = sc.nextInt();


        

        for(int i=1; i<=num;i++){
            for(int j=1;j<=num;j++){
               if(i%2 ==0){
                System.out.print((char)(i+64)+" ");
               }else{
                System.out.print((char)(i+96)+" ");
               }
            }
            System.out.println(" ");
        }
         
        sc.close();
}
}
