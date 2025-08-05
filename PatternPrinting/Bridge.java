package PatternPrinting;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row:");

        int n = sc.nextInt();

        for(int i=1;i<=2*n+1;i++){
            System.out.print("* ");
        }
        System.out.println();

        int nsp =1, nst = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*"+" ");
            }

            nsp+=2;
            nst--;
           
            System.out.println();
        }

        sc.close();
    }
}
