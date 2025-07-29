package PatternPrinting;

import java.util.Scanner;

public class AlphabateSquare {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        

        for(int i=1; i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println(" ");
        }
         
        sc.close();
    }
}
