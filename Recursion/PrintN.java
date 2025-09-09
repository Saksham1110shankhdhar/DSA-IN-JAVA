package Recursion;

import java.util.Scanner;

public class PrintN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();

        print(n);
        sc.close();
    }

    private static void print(int n) {
        if(n==0){
            return;
        }

        print(n-1);
        System.out.print(n + " ");
    }
   
}
