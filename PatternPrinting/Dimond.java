package PatternPrinting;

import java.util.Scanner;

public class Dimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row:");

        int n = sc.nextInt();

        // Upper Pyramid

        int nsp = n - 1, nst = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nsp--;
            nst += 2;
            System.out.println();
        }

        // Lower Pyramid

        nsp = 1;
        nst -= 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }

            nsp++;
            nst -= 2;
            System.out.println();
        }

        sc.close();

    }
}
