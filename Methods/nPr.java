package Methods;

import java.util.Scanner;

public class nPr {
     public static double Factorial(double n){
        double fact=1;

        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

       public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

       System.out.println("Enter a number :");

       double n=sc.nextInt();

       System.out.println("Enter  R :");

       double r=sc.nextInt();

       double nFact=Factorial(n);
      
       double nMinusR=Factorial(n-r);

       double nCr=nFact/(nMinusR);

       System.out.println("NCR is : "+nCr);

       sc.close();



    }
}
